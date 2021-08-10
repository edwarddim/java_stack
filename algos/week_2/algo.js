// MON
// LAST IN FIRST OUT
// LIFO - STACKS
class Stack {
    constructor(items = []) {
        this.items = items;
    }
    // Time: O(1)
    // Space: O(1)
    push(item) {
        this.items.push(item)
    }

    // Time: O(1)
    // Space: O(1)
    // Returns undefined if empty
    pop() {
        return this.items.pop()
    }

    // aka top, returns undefined if empty
    // Time: O(1)
    // Space: O(1)
    peek() {
        return this.items[this.items.length - 1]
    }

    // Time: O(1)
    // Space: O(1)
    isEmpty() {
        return this.items.length == 0;
    }

    // Time: O(1)
    // Space: O(1)
    size() {

    }

    // Time: O(n) linear
    // Space: O(n)
    print() {

    }
}

class SLNode {
    constructor(value) {
        this.value = value
        this.next = null
    }
}

class SLStack {
    constructor() {
        this.head = null;
        this.length = 0;
    }

    isEmpty() {
        
    }

    // Adds a new node with the given value in front of the head node.
    push(value) {

    }

    // Removes the head node
    // return the popped value -- important!
    pop() {

    }

    size() {

    }

    peek() {

    }
    printPretty() {

    }

    ////  EXTRA  /////
    // Reverses stack with the order of the nodes reversed
    // For this exercise, do NOT try to re-point all the pointers
    // use an extra stack as storage and utilize the pop and push 
    // methods. Hint: you can re-point the head.
    reverse() {

    }
}
class SLQueue {
    constructor() {
      this.head = null;
      this.tail = null;
      this.size = 0;
    }
    enqueue(value){

    }
    // RETURNING THE VALUE
    dequeue(){

    }
    isEmpty(){

    }
    getSize(){
      
    }
    front(){
      
    }
  
    printPretty() {

    }
}