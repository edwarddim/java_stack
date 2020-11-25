// QUEUES AND STACKS
class SLNode{
    constructor(value){
      this.value = value
      this.next = null
    }
}

// MON
// LIFO - STACKS

class Stack {
    constructor(items = []) {
      this.items = items;
    }
  
    // Time: O(1)
    // Space: O(1)
    push(item) {
      this.items.push(item);
    }
  
    // Time: O(1)
    // Space: O(1)
    // Returns undefined if empty
    pop() {
      return this.items.pop();
    }
  
    // aka top, returns undefined if empty
    // Time: O(1)
    // Space: O(1)
    peek() {
      return this.items[this.items.length - 1];
    }
  
    // Time: O(1)
    // Space: O(1)
    isEmpty() {
      return this.items.length === 0;
    }
  
    // Time: O(1)
    // Space: O(1)
    size() {
      return this.items.length;
    }
  
    // Time: O(n) linear
    // Space: O(n)
    print() {
      const str = this.items.join(" ");
      console.log(str);
      return str;
    }
}

class SLStack {
    constructor() {
        this.head = null;
    }
    push(newVal) {
        // push newVal to top of stack
    }
    pop() {
        // remove and return data at top of stack
    }
    peek() {
        // return data at top of stack without removing
    }
    contains(value) {
        // return true if SLStack contains value
        // return false if SLStack does not contain value
    }
    isEmpty() {
        // return true if SLStack is empty
        // return false if SLStack is not empty
    }
    size() {
        // return length of SLStack
    }
    print() {
        // print out the values of the SLStack
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

  // Time: O(1) constant
  // Space: O(1)
  isEmpty() {
    return this.head === null;
  }

  // Time: O(1) constant
  // Space: O(1)
  enqueue(val) {
    // ADD NODE TO THE BACK
    // INCREMENT SIZE
  }

  // Time: O(1) constant
  // Space: O(1)
  dequeue() {
    // REMOVE NODE FROM THE FRONT
    // AND RETURN VALUE
    // DECREMENT SIZE

  }

  // Time: O(1) constant
  // Space: O(1)
  front() {
    // RETURN THE VALUE OF THE HEAD
  }

  // Time: O(n) linear
  // Space: O(1)
  contains(val) {
    let runner = this.head;

    while (runner) {
      if (runner.val === val) return true;
      runner = runner.next;
    }
    return false;
  }

  // Time: O(n) linear
  // Space: O(n)
  print() {
    let runner = this.head;
    let vals = "";

    while (runner) {
      vals += `${runner.data}${runner.next ? ", " : ""}`;
      runner = runner.next;
    }
    console.log(vals);
    return vals;
  }

  /* 
    Queue: Is Palindrome
    Output: Bool representing if the queue items are a palindrome (items same forwards as reversed)
    
    Restore Queue to original state before returning.
    For storage, use one additional Stack only.
    You CAN use vars to store a dequeued and/or popped item, 
    but NO string concatenating the entire queue, no 2nd stack, 2nd queue, or arrays.
    
  */

  /* 
    Approach:
    1. loop over fixed-length of queue
      - dequeue each item and push it into the stack
      - enqueue each item back into the queue to preserve it's order
    2. loop over fixed-length of queue and check equality of popped & dequeued vals
      - enqueue each dequeued item back into the queue to preserve it's order
    Time: O(2n) -> O(n) linear, n = queue length
    Space: O(n) from the stack being used
  */

  isPalindrome(){
    
  }

  // Time: O(n) linear since enqueue is O(1), n = vals.length
  // Space: O(1)
}

var queue = new SLQueue()
queue.enqueue('a')
queue.enqueue('b')
queue.enqueue('c')
queue.enqueue('b')
queue.enqueue('a')
queue.isPalindrome()

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// WED

/* 
  Write a method that returns whether or not the sum of a queue's first half is equal to the sum of it's
  second half. Use no other objects, do not loop directly over the underlying array,
  or access by index
  When the function finishes, the queue should be in it's original state.
  
  Time: O(n) linear, n = queue length
  Space: O(1) constant
*/

isSumOfHalvesEqual(){

}


// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// THUR
class CircleQueue{
  constructor(length){
      this.size = length
      this.head = -1
      this.tail = -1
      this.items = new Array(length)
  }
  displayValues(){
      console.log(this.items)
  }
  enqueue(value){
    // LIST IS FULL
    if((this.tail + 1) % this.size === this.head ){
      console.log("THE QUEUE IS FULL")
      return false
    }

    // LIST IS EMPTY
    if(this.head == -1){
      this.head = 0
      this.tail = 0
      this.items[this.head] = value
    }
    // LIST IS PARTIALLY FULL


  }
  dequeue(){

  }
}
var circleQ = new CircleQueue(9);
circleQ.enqueue('a')



// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// FRI


// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//