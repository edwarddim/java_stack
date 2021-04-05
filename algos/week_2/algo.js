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
