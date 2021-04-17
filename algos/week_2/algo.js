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
class ArrayStack {
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
    printPretty() {
      let runner = this.head;
      let printString = "~ SLStack ~ HEAD--(";
      while (runner && runner.next) {
        printString+= `${runner.value})->(`;
        runner = runner.next;
      }
      printString+=`${runner.value})->null\n`;
      console.log(printString);
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

    // Week 2 THURSDAY
  // Stacks/Queues Continued

  /** Methods will be in the STACK class
   * Returns a new stack that is copy of the original stack.
   * Retain the original order. You may create extra temp 
   * SLStacks and/or SLQueues 
   * as storage.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {SLStack} Copy of the original stack
   */
   copy() {
    let copy_stack = new SLStack();
    let temp_stack = new SLStack();
    let runner = this.head;
    
    // Push all the values into a temp stack
    while (runner) {
       temp_stack.push(runner.value);
       runner = runner.next;
    }
    // Push all the vals in temp into copy stack
    // by popping off the top to put back in the right order.
    while (!temp_stack.isEmpty()) {
      copy_stack.push(temp_stack.pop());
    }
    return copy_stack;
  }

  /**
   * Rearranges the stack so that numbers > 0 are 
   * on the top and any negatives are on the bottom
   * Retain the order of the positives and negatives
   * Use extra stacks and/or queues as storage.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {any} The removed item.
   */
  partitionPositives() {
    let positives = new SLStack;
    let negatives = new SLStack;

    while (!this.isEmpty()) {
      if (this.peek() < 0) {
        negatives.push(this.pop());
      }
      else {
        positives.push(this.pop());
      }
    }
    while (!negatives.isEmpty()) {
      this.push(negatives.pop());
    }
    while (!positives.isEmpty()) {
      this.push(positives.pop());
    }
  }
    
}

var new_stack = new SLStack();
new_stack.push(-3);
new_stack.push(1);
new_stack.push(2); 
new_stack.push(-5); 
new_stack.push(-7); 
new_stack.push(8); 
new_stack.push(-10); 
// head (-10)->(8)->(-7)->(-5)->(2)->(1)->(-3)->null
new_stack.copy();
new_stack.printPretty();
new_stack.partitionPositives();
new_stack.printPretty();
// head (8)->(2)->(1)->(-10)->(-7)->(-5)->(-3)->null



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
    return this;
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

  printPretty() {
    let runner = this.head;
    let printString = "~ SLQueue ~ HEAD--(";
    while (runner && runner.next) {
      printString+= runner === this.tail? "TAIL ":"";
      printString+= `${runner.value})->(`;
      runner = runner.next;
    }
    printString+= runner === this.tail? "TAIL ":"";
    printString+=`${runner.value})->null\n`;
    console.log(printString);
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
let q = new SLQueue();
q.enqueue(1).enqueue(2).enqueue(3).enqueue(4);
q.printPretty();
// WEDNESDAY EXTRA
// Extra: MinStack
// Design a stack that supports push, pop, top, and min methods where the min method retrieves the minimum int in the stack
// Bonus: retrieve min element in constant time (no looping).


// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// WEEK 2 FRI
class CircleQueue{
  constructor(capacity){
      this.size = 0
      this.head_index = -1
      this.tail_index = -1

      // Items is an array with length == capacity 
      // where all values are undefined
      this.items = new Array(capacity)

      this.capacity = capacity
      
  }
  
  // Adds a new element into the list.
  enqueue(val){
    if ((this.tail_index + 1) % this.capacity == this.head_index) {
      console.log("Warning: failed to enqueue. List at capacity.")
      return null;
    }

    if(this.head_index == -1) {
      this.head_index = 0;
      this.tail_index = 0;
      this.items[0] = val;
    }
    else {
      let next_spot = (this.tail_index + 1) % this.capacity;
      this.items[next_spot] = val;
      this.tail_index = next_spot;
    }
    this.size++;
    // chaining
    return this;
  }

  dequeue(){

    if (this.head_index == -1) {
      console.log("Warning: Dequeue Failed. List empty.")
      return null;
    }
    let removed = this.items[this.head_index];
    this.items[this.head_index] = undefined;
    
    if (this.head_index == this.tail_index){
      this.tail_index = -1;
      this.head_index = -1;
    }
    else {
      this.head_index = (this.head_index + 1) % this.capacity;
    }
    this.size--;
    return removed;
  }

}
