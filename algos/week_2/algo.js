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
      
    }
    push(value){

    }
    pop(){

    }
    size(){

    }
    peek(){
      // return top item without removing
    }
    
}

class SLStack {
    constructor() {
        this.head = null;
    }

    isEmpty(){
      
    }

    // Adds a new node with the given value in front of the head node.
    push(value){
      
    }

    // Removes the head node
    // return the popped value -- important!
    pop(){

    }

    size(){

    }

    peek(){
      // return top item without removing
    }

    ////  EXTRA  /////
    // Reverses stack with the order of the nodes reversed
    // For this exercise, do try to re-point all the pointers
    // use an extra stack as storage and utilize the pop and push 
    // methods.
    reverse() {}
    
}

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
