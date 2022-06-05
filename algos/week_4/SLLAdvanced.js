class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class SinglyLinkedList {
  constructor() {
    this.head = null;
  }
  /**
   * Determines if this list is empty.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {boolean}
   */
  isEmpty() {
    return this.head === null;
  }

  /**
   * Determines the length of this list.
   * - Time: O(n) linear, n = length of list
   * - Space: O(1) constant
   * @returns {number} The length.
   */
  length() {
    let len = 0;
    let runner = this.head;

    while (runner) {
      len += 1;
      runner = runner.next;
    }
    return len;
  }

  /**
   * Prints all the nodes in the list to the console.
   * of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {SinglyLinkedList} This list.
   */
  printValues() {
    if (this.head == null) {
      console.log("LIST EMPTY");
      return;
    }
    // IF THE LIST IS NOT EMPTY
    var runner = this.head;
    while (runner != null) {
      console.log(runner.value);
      runner = runner.next;
    }
  }
  /**
   * Creates a new node with the given data and inserts it at the back of
   * this list.
   * - Time: (?).
   * - Space: (?).
   * @param {any} data The data to be added to the new node.
   * @returns {SinglyLinkedList} This list.
   */
  insertAtBack(data) {
    if (this.isEmpty()) {
      this.head = new Node(data);
      return this;
    }

    let runner = this.head;
    while (runner.next != null) {
      runner = runner.next;
    }

    runner.next = new Node(data);

    return this;
  }

  /**
   * Adds each item of the given array to the back of this list.
   * - Time: (?).
   * - Space: (?).
   * @param {Array<any>} vals The data for each new node.
   * @returns {SinglyLinkedList} This list.
   */
  seedFromArr(vals) {
    for (const item of vals) {
      this.insertAtBack(item);
    }

    return this;
  }

  /**
   * Creates a new node with the given data and inserts that node at the front
   * of this list.
   * - Time: (?).
   * - Space: (?).
   * @param {any} data The data for the new node.
   * @returns {SinglyLinkedList} This list.
   */
  insertAtFront(data) {
    let newHead = new Node(data);
    newHead.next = this.head;
    this.head = newHead;

    return this;
  }

  /**
   * Removes the first node of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {any} The data from the removed node.
   */
  removeAtFront() {
    if (this.isEmpty()) return null;

    let oldHead = this.head;
    this.nead = oldHead.next;
    oldHead.next = null;

    return oldHead.data;
  }

  /**
   * Calculates the average of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {number|NaN} The average of the node's data.
   */
  average() {
    if (this.isEmpty()) return null;

    let sum = 0;
    let runner = this.head;
    while (runner != null) {
      sum += runner.data;
      runner = runner.next;
    }

    return sum / this.length();
  }

  /**
   * Determines whether or not the given search value exists in this list.
   * - Time: (?).
   * - Space: (?).
   * @param {any} val The data to search for in the nodes of this list.
   * @returns {boolean}
   */
  contains(val) {
    if (this.isEmpty()) return null;

    let runner = this.head;
    while (runner != null) {
      if (runner.data === val) {
        return true;
      }
      runner = runner.next;
    }

    return false;
  }

  /**
   * Removes the last node of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {any} The data from the node that was removed.
   */
  removeBack() {
    if (this.isEmpty()) return null;

    if (this.head.next === null) {
      this.head = this.removeAtFront();
    }

    let runner = this.head;
    while (runner.next != null) {
      runner = runner.next;
    }
    let node = runner.next;
    runner.next = null;

    return node.data;
  }

  /**
   * Determines whether or not the given search value exists in this list.
   * - Time: (?).
   * - Space: (?).
   * @param {any} val The data to search for in the nodes of this list.
   * @param {?node} current The current node during the traversal of this list
   *    or null when the end of the list has been reached.
   * @returns {boolean}
   */
  containsRecursive(val, current = this.head) {
    if (current === null) return false;

    if (current.data === val) return true;

    return this.containsRecursive(val, current.next);
  }

  /**
   * Retrieves the data of the second to last node in this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {any} The data of the second to last node or null if there is no
   *    second to last node.
   */
  secondToLast() {
    if (this.isEmpty()) return null;

    let runner = this.head;

    while (runner.next.next != null) {
      runner = runner.next;
    }

    return runner.data;
  }

  getSecondToLastNode() {
    if (this.isEmpty()) return null;

    let runner = this.head;

    while (runner.next.next != null) {
      runner = runner.next;
    }

    return runner;
  }

  getLastNode() {
    if (this.isEmpty()) return null;

    let runner = this.head;

    while (runner.next != null) {
      runner = runner.next;
    }

    return runner;
  }

  /**
   * Removes the node that has the matching given val as it's data.
   * - Time: (?).
   * - Space: (?).
   * @param {any} val The value to compare to the node's data to find the
   *    node to be removed.
   * @returns {boolean} Indicates if a node was removed or not.
   */
  removeVal(val) {
    if (this.isEmpty()) return null;

    let runner = this.head;

    while (runner.next != null) {
      if (runner.next.data === val) {
        let removedNode = runner.next;
        let currentNode = runner;
        let nextNode = runner.next.next;

        removedNode.next = null;
        currentNode.next = nextNode;

        return true;
      }
      runner = runner.next;
    }

    return false;
  }

  /**
   * Retrieves the data of the kth to last node in this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {any} The data of the kth to last node or null if there is no
   *    kth to last node.
   */
  kthToLast(k) {
    if (this.isEmpty()) return null;

    runner = this.head;
    for (let i = 0; i < k; i++) {
      if (runner === null) return null;

      runner = runner.next;
    }

    return runner.data;
  }

  // WEEK 4
  // ========== MONDAY ==========

  /**
   * Reverses this list in-place without using any extra lists.
   * - Time: (?).
   * - Space: (?).
   * @returns {SinglyLinkedList} This list.
   */
  reverse() {
    if (this.isEmpty()) {
      return null;
    }

    //Set a runner to traverse linked list, and a walker to grab previous nodes
    let runner = null;
    let walker = null;
    let currentNode = this.head; // start current traversal through linked list

    while (currentNode != null) {
      //Runner traverses through the nodes
      runner = currentNode.next;

      //Set the next value in the liked list to the walker
      currentNode.next = walker;

      //Set the next node to be the current node
      walker = currentNode;

      //move the current node forward
      currentNode = runner;
    }
    //set the head to walker which is the last position of the original linked list
    this.head = walker;
    return this.head;
  }

  // ========== TUESDAY =========

  /**
   * Determines whether the list has a loop in it which would result in
   * infinitely traversing unless otherwise avoided. A loop is when a node's
   * next points to a node that is behind it.
   * - Time: (?).
   * - Space: (?).
   * @returns {boolean} Whether the list has a loop or not.
   */
  hasLoop() {
    if (this.isEmpty()) return false;

    let oneAhead = this.head;
    let twoAhead = this.head;

    while ((twoAhead != null) & (twoAhead.next != null)) {
      oneAhead = oneAhead.next; // look 1 node ahead
      twoAhead = twoAhead.next.next; // look 2 nodes ahead

      // if they refer to the same node there must be a loop
      // as 'oneAhead' could only catch up to 'twoAhead' if there is a loop
      if (oneAhead == twoAhead) return true;
    }

    return false;
  }

  /**
   * Removes all the nodes that have a negative integer as their data.
   * - Time: (?).
   * - Space: (?).
   * @returns {SinglyLinkedList} This list after the negatives are removed.
   */
  removeNegatives() {
    //Starting base case, the list is empty
    if (this.isEmpty()) {
      return null;
    } else if (this.head.next == null) {
      if (this.head.value < 0) {
        this.head = null;
        return true;
      }
      return false;
    }

    let walker = this.head;
    let runner = this.head.next;

    if (this.head.value < 0) {
      while (walker.value < 0) {
        walker = walker.next;
      }
      this.head = walker;
      runner = walker.next;
    }

    while (walker != null) {
      if (walker.value >= 0) {
        if (runner == null) {
          walker.next = null;
          break;
        }
        while (runner.value < 0) {
          console.log(runner.value);
          runner = runner.next;
        }
        console.log(runner.value);
        walker.next = runner;
      }

      walker = walker.next;
      runner = walker.next;
    }
    return this.head;
  }
}

<<<<<<< HEAD:algos/week_4/algo.js
// has loop test case
var sslArr = [3, 5, -2, 3, -7, 9, 1, 0 - 2, 8];
const ssl = new SinglyLinkedList();
ssl.seedFromArr(sslArr);
var secondToLastNode = ssl.getSecondToLastNode();
var lastNode = sll.getLastNode();
lastNode.next = secondToLastNode;

// remove Negatives Test Case
var sslArr = [-4, -2, 3, 5, -2, 9, 1, 0 - 2, 8];
const ssl = new SinglyLinkedList();
ssl.seedFromArr(sslArr);
=======
var myList = new SLL();
myList.push(5).push(4).push(3).push(2).push(1)
// .push("and one more for even number of nodes");

// // Uncomment to test when it does have a loop ////
// let runner = myList.head;
// while(runner.next) {
//     runner=runner.next;
// }
// runner.next = myList.head.next; //

// console.log(myList.hasLoop());
>>>>>>> master:algos/week_4/SLLAdvanced.js
