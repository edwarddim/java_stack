// MON

/* 
Intro to Singly Linked Lists
 - OOP
 - Array VS SLL

*/

var arr = ['a', 'b', 'c', 'd', 'e']


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

class SLL {
  constructor() {
    this.head = null;
  }
  printValues() {
    // 1. SLL IS EMPTY
    if (this.head === null) {
      console.log("LIST EMPTY")
      return
    }
    // 2. SLL IS NOT EMPTY
    var string = ""
    var runner = this.head
    while (runner.next != null) {
      string += runner.value + " -> "
      // console.log(runner.value)
      runner = runner.next
    }
    string += runner.value + " -> null"
    // console.log(runner.value)
    console.log(string)
  }
  insertAtBack(data) {
    var newNode = new SLNode(data)
    // 1. LIST IS EMPTY
    if (this.head === null) {
      this.head = newNode
      return
    }
    // 2. LIST IS NOT EMPTY
    var runner = this.head
    while (runner.next != null) {
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
    // 1. LIST IS EMPTY
    if(this.head === null){
      // CREATE A NEW NODE
      var newNode = new SLNode(data)
      // POINT THE HEAD TO THE NEW NODE
      this.head = newNode
      return
    }
    // 2. LIST IS NOT EMPTY
    // CREATE A NEW NODE
    var newNode = new SLNode(data)
    // POINT THE NEW NODE'S .next TO THE HEAD
    newNode.next = this.head
    // POINT THE HEAD TO THE NEW NODE
    this.head = newNode
  }

  /**
   * Removes the first node of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {any} The data from the removed node.
   */
  removeAtFront() {
    // 1. LIST IS EMPTY
    if(this.head === null){
      return
    }
    // 2. LIST IS NOT EMPTY
    // CREATE TEMP VARIABLE TO POINT TO HEAD
    var temp = this.head
    // MOVE HEAD DOWN THE LIST ONE NODE
    this.head = this.head.next
    // HAVE THE NODE TO DELETE, POINT TO null
    temp.next = null
    return temp.value
  }

  // EXTRA
  /**
   * Calculates the average of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {number|NaN} The average of the node's data.
   */
  average() {
    // 1. LIST IS EMPTY
    if(this.head === null){
      return 0
    }
    // 2. LIST NOT EMPTY
    var count = 0
    var totalSum = 0

    var runner = this.head
    while (runner != null) {
      count++
      totalSum += runner.value
      runner = runner.next
    }
    return totalSum / count;
  }
  // THURSDAY -------------------------------------------------------------------//
  /**
 * Retrieves the data of the second to last node in this list.
 * - Time: O(?).
 * - Space: O(?).
 * @returns {any} The data of the second to last node is null or if there is no
 *    second to last node, return false
 */
  secondToLast() { 
    if(this.head === null || this.head.next === null){
      return false
    }
    // 2. LIST IS NOT EMPTY
    var runner = this.head
    while(runner.next.next != null){
      runner = runner.next
    }
    return runner.value
  }

  /**
   * Removes the node that has the matching given val as it's data.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} val The value to compare to the node's data to find the
   *    node to be removed.
   * @returns {boolean} Indicates if a node was removed or not.
   */
  removeVal(val) { 

  }

  // EXTRA
  /**
   * Inserts a new node before a node that has the given value as its data.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} newVal The value to use for the new node that is being added.
   * @param {any} targetVal The value to use to find the node that the newVal
   *    should be inserted in front of.
   * @returns {boolean} To indicate whether the node was pre-pended or not.
   */
  prepend(newVal, targetVal) { }
}


//==========================//
//         TESTING          //
//==========================//

var newList = new SLL()
// newList.insertAtBack('a')
// newList.insertAtBack('b')
// newList.insertAtBack('c')
// newList.insertAtBack('d')
newList.insertAtFront(1)
newList.insertAtFront(2)
newList.insertAtFront(3)
newList.insertAtFront(4)
newList.insertAtFront(5)
newList.insertAtFront(6)
console.log(newList.average())



newList.printValues()