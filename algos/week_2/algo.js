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

var new_stack = new SLStack();
new_stack.push(3);
new_stack.push(2);
new_stack.push(1);
console.log(new_stack);
new_stack.reverse();
console.log(new_stack);

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

  }
  dequeue(){

  }
  isEmpty(){

  }
  size(){

  }
  front(){
    
  }

  
}



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
