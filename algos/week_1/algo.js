// MON

/* 
Intro to Singly Linked Lists
 - OOP
 - Array VS SLL

*/


// Part I
let a = new SLNode(7);
let b = new SLNode(3);
let c = new SLNode(1);
a.next = b;
b.next = c;

console.log('A:', a.val);
console.log('B:', b.val);
console.log('C:', c.val);
console.log(a.next.val);
console.log(a.next.next.val);
console.log(a.next.next.next.val);

// Part II 
// Note: Later the head variable shown here will be part of the SLL class

let head = new SLNode(1);
let runner_temp = head;
for (let i of [7,3,5,2]) {
    let new_node = new SLNode(i);
    runner_temp.next = new_node;
    runner_temp = new_node;
}

console.log(head.val);
console.log(head.next.val);
console.log(head.next.next.next.val);


class SLNode{
    constructor(value){
        this.value = value
        this.next = null
    }
}

class SLL{
    constructor(){
        this.head = null;
    }    

    //  TUESDAY -------------------------------------------------------------------//
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data to be added to the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBack(data){

    }
    
    /**
     * Adds each item of the given array to the back of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {Array<any>} vals The data for each new node.
     * @returns {SinglyLinkedList} This list.
     */
    seedFromArr(vals) {

    }
    
 // WEDNESDAY -------------------------------------------------------------------//
    /**
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    printValues() {

    }
    printPretty() {

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

    }

    /**
     * Removes the first node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the removed node.
     */
     removeAtFront(){

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

    // THURSDAY --------------------------------------------------------------------//
    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The data to search for in the nodes of this list.
     * @returns {boolean}
     */
    contains(val) {

    }

    /**
     * Removes the last node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the node that was removed.
     */
    removeBack() {


    }

    // --- If extra time -- code the removeAtFront method from scratch
    
    // EXTRA
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

    }
    
    
    /**
     * Recursively finds the maximum integer data of the nodes in this list.
     * - Time: (?).
     * - Space: (?).
     * @param {Node} runner The start or current node during traversal, or null
     *    when the end of the list is reached.
     * @param {Node} maxNode Keeps track of the node that contains the current
     *    max integer as it's data.
     * @returns {?number} The max int or null if none.
     */
    recursiveMax(runner = this.head, maxNode = this.head) {

    }

    // FRIDAY ----------------------------------------------------------------------//

    /**
     * Retrieves the data of the second to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the second to last node or null if there is no
     *    second to last node.
     */
    secondToLast() {

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

    }

    //  FRIDAY EXTRA
    /**
     * Retrieves the data of the kth to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the kth to last node or null if there is no
     *    kth to last node.
     */
     kthToLast(k) {

     }

    // ====================================================
    
    // EXTRA
    /**
     * Inserts a new node before a node that has the given value as its data.
     * - Time: (?).
     * - Space: (?).
     * @param {any} newVal The value to use for the new node that is being added.
     * @param {any} targetVal The value to use to find the node that the newVal
     *    should be inserted in front of.
     */
    prepend(newVal, targetVal) {}


    /**
     * Concatenates the nodes of a given list onto the back of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {SinglyLinkedList} addList An instance of a different list whose
     *    whose nodes will be added to the back of this list.
     * @returns {SinglyLinkedList} This list with the added nodes.
     */
    concat(addList) {}

    /**
     * Finds the node with the smallest number as data and moves it to the front
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    moveMinToFront() {}
    
    // EXTRA
    /**
     * Splits this list into two lists where the 2nd list starts with the node
     * that has the given value.
     * splitOnVal(5) for the list (1=>3=>5=>2=>4) will change list to (1=>3)
     * and the return value will be a new list containing (5=>2=>4)
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The value in the node that the list should be split on.
     * @returns {SinglyLinkedList} The split list containing the nodes that are
     *    no longer in this list.
     */
        splitOnVal(val) {}
    //  }
}

//==========================//
//         TESTING          //
//==========================//

