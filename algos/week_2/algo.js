// QUEUES AND STACKS
class SLNode{
    constructor(value){
      this.value = value
      this.next = null
    }
}
// MON
// LAST IN FIRST OUT
// LIFO - STACKS
class Stack {
    constructor(items = []) {
      this.items = items;
    }

    isEmpty(){
      return this.items.length == 0;
    }
    push(value){
      this.items.push(value);
    }
    pop(){
      return this.items.pop();
    }
    size(){
      return this.items.length;
    }
    peek(){
      // return top item without removing
      return this.items[this.items.length-1]
    }
    
}

class SLStack {
    constructor() {
        this.head = null;
        this.length = 0;
    }

    isEmpty(){
      return this.head == null;
    }

    // Adds a new node with the given value in front of the head node.
    push(value){
      var new_node = new SLNode(value);
      new_node.next = this.head;
      this.head = new_node;
      this.length++;
    }

    // Removes the head node
    // return the popped value -- important!
    pop(){
      if (!this.head) {
        return null;
      }
      var removed = this.head.value;
      this.head = this.head.next;
      this.length--;
      return removed;
    }

    size(){
      return this.length;
    }

    peek(){
      // Note: If this looks weird, look up ternary statements.
      // They are another way to re-write a very simple 
      // if statement variable assignment.
      return this.head? this.head.value: null;
      // return top value without removing
    }

    ////  EXTRA  /////
    // Reverses stack with the order of the nodes reversed
    // For this exercise, do NOT try to re-point all the pointers
    // use an extra stack as storage and utilize the pop and push 
    // methods. Hint: you can re-point the head.
    reverse() {
      var tempStack = new SLStack();
      while(this.head) {
        tempStack.push(this.pop());
      }
      this.head = tempStack.head;
      this.length = tempStack.length;
    }
    
}

// var new_stack = new SLStack();
// new_stack.push(3);
// new_stack.push(2);
// new_stack.push(1);
// console.log(new_stack);
// new_stack.reverse();
// console.log(new_stack);

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// TUE
// FIFO - QUEUES
class SLQueue {
  constructor() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  enqueue(value){
    var new_node = new SLNode(value);
    
    if (this.isEmpty()) {
      this.head = new_node;
      this.tail = new_node;
    }
    else {
      this.tail.next = new_node;
      this.tail = new_node;
    }
    this.size++;
  }
  dequeue(){
    if (this.isEmpty()) {
      return null;
    }
    var removed_val = this.head.value;
    this.head = this.head.next;
    
    if (!this.head) {
      this.tail = null;
    }
    this.size--;
    return removed_val;

  }
  isEmpty(){
    return !this.head;
  }
  // Note: Changed this! 
  // Attributes and methods should have different names.
  getSize(){
    return this.size;
  }
  front(){
    return this.head? this.head.value: null;
  }

  // equals
  // Write a method on the Queue class that, given another queue, 
  // will return whether they are equal (same items in same order).
  // Do not use any extra array or objects as storage.
  // Do not alter (pop from or push into) either queue.
  equals(secondQ){
    if (secondQ.size != this.size) {
      return false;
    }
    let runner1 = this.head;
    let runner2 = secondQ.head;

    while (runner1 && runner2) {
      if(runner1.value != runner2.value) {
        return false;
      }
      runner1 = runner1.next;
      runner2 = runner2.next;
    }
    return true;
  }

  // isPalindrome
  // Write a method on the Queue class that returns whether or not the queue is a palindrome
  // Use only 1 stack as additional storage (no additional arrays / objects).
  isPalindrome(){
    let compareStack = new SLStack();
    let runner = this.head;
    while (runner) {
      compareStack.push(runner.val);
      runner = runner.next;
    }
    // Note: If you implement the size attribute in the
    //       stack class as well, you can use the equals
    //       method here, since it is identical code!
    let runner1 = this.head;
    let runner2 = compareStack.head;

    while (runner1 && runner2) {
      if(runner1.value != runner2.value) {
        return false;
      }
      runner1 = runner1.next;
      runner2 = runner2.next;
    }
    return true;
  }
  //   BONUS (after solving) -- can you do it in one pass? 
  //  ( ADVANCED BRAIN_TEASER! )
  isPalindrome1Pass(){
    let compareStack = new SLStack();

    // runner will help add each value to the
    // stack and stop at the middle
    let runner = this.head;

    // this runner goes 2x as fast as the runner
    // so that the first runner will stop in the middle
    let doubleTimeRunner = this.head;

    // Goes half-way through the queue adding nodes to the 
    // compare stack (reverses order)
    while(doubleTimeRunner && doubleTimeRunner.next) {

      compareStack.push(runner.value);

      // Quick runner skips a node each time 
      // so normal runner will end up at the middle at the end
      doubleTimeRunner = doubleTimeRunner.next.next;
      runner = runner.next;
    }
    // If odd number of nodes, advance runner.
    runner = doubleTimeRunner? runner.next: runner;

    // prepare to iterate over the compareStack 
    // which is now the first half of the queue reversed.
    let stackRunner = compareStack.head;
    
    // compare each node in the last half of of the queue
    // with the compareStack.
    while (runner) {
      if(stackRunner.value != runner.value) {
        return false;
      }
      stackRunner = stackRunner.next;
      runner = runner.next;
    }
    return true;



  }
  
}
// WEDNESDAY EXTRA
// Extra: MinStack
// Design a stack that supports push, pop, top, and min methods where the min method retrieves the minimum int in the stack
// Bonus: retrieve min element in constant time (no looping).


var queue = new SLQueue();
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);

var queue2 = new SLQueue();
queue2.enqueue(1);
queue2.enqueue(2);
queue2.enqueue(4);

var queue3 = new SLQueue();
queue3.enqueue(1);
queue3.enqueue(2);
queue3.enqueue(4);

var letterQ = new SLQueue();
letterQ.enqueue("a");
letterQ.enqueue("b");
letterQ.enqueue("b");
letterQ.enqueue("a");
// letterQ.enqueue("a");

console.log(queue.equals(queue2)); // false
console.log(queue2.equals(queue3)); // true
console.log(letterQ.isPalindrome());
console.log(letterQ.isPalindrome1Pass());


// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// FRI
class CircleQueue{
  constructor(length){
      this.size = length
      this.head = -1
      this.tail = -1
      this.items = new Array(length)
  }
  
}
