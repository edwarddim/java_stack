// MON

/* 
Intro to Singly Linked Lists
 - OOP
 - Array VS SLL

*/

var arr = ['a','b','c','d','e']


// var a = new SLNode(6)
// var b = new SLNode(2)
// var c = new SLNode(1)

// console.log(a.value) // 6
// console.log(a.next) // null

// a.next = b
// b.next = c

// var head = a

// console.log(head)

// var runner = head
// while(runner.next != null){
//   runner = runner.next
// }


class SLNode {
  constructor(value) {
      this.value = value
      this.next = null
  }
}

class SLL{
  constructor(){
    this.head = null;
  }
  printValues(){
    // 1. SLL IS EMPTY
    if(this.head === null){
      console.log("LIST EMPTY")
      return
    }
    // 2. SLL IS NOT EMPTY
    var string = ""
    var runner = this.head
    while(runner.next != null){
      string += runner.value + " -> "
      // console.log(runner.value)
      runner = runner.next
    }
    string += runner.value + " -> null"
    // console.log(runner.value)
    console.log(string)
  }
  insertAtBack(data){
    var newNode = new SLNode(data)
    // 1. LIST IS EMPTY
    if(this.head === null){
      this.head = newNode
      return
    }
    // 2. LIST IS NOT EMPTY
    var runner = this.head
    while(runner.next != null){
      runner = runner.next
    }
    runner.next = newNode
    // Set the runner at head
    // Have the runner go to the last Node
    // Create a new SLNode with the data
    // Set the runner.next to the new Node created
  }
  seedFromArr(vals) {

  }

  // WEDNESDAY -------------------------------------------------------------------//

    /**
     * Creates a new node with the given data and inserts that node at the front
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data for the new node.
     * @returns {SinglyLinkedList} This list.
     */
  insertAtFront(data) {

  }

  /**
   * Removes the first node of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {any} The data from the removed node.
   */
  removeAtFront() {

  }

  // EXTRA
  /**
   * Calculates the average of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {number|NaN} The average of the node's data.
   */
  average() {

  }
}


//==========================//
//         TESTING          //
//==========================//

var newList = new SLL()
newList.insertAtBack('a')
newList.insertAtBack('b')
newList.insertAtBack('c')
newList.insertAtBack('d')


newList.printValues()