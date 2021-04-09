// MON

// Part I

// let a = new SLNode(7);
// let b = new SLNode(3);
// let c = new SLNode(1);
// a.next = b;
// b.next = c;

// console.log('A:', a.val);
// console.log('B:', b.val);
// console.log('C:', c.val);
// console.log(a.next.val);
// console.log(a.next.next.val);
// console.log(a.next.next.next.val);

// Part II 
// Note: Later the head variable shown here will be part of the SLL class

// let head = new SLNode(1);
// let runner_temp = head;
// for (let i of [7,3,5,2]) {
//     let new_node = new SLNode(i);
//     runner_temp.next = new_node;
//     runner_temp = new_node;
// }

// console.log(head.val);
// console.log(head.next.val);
// console.log(head.next.next.next.val);


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
        let new_node = new SLNode(data);
        if (this.head == null) {
            this.head = new_node;
            return this;
        }

        let current_node = this.head;
        while(current_node.next != null) {
            current_node = current_node.next;
        }
        current_node.next = new_node;
        return this;
        }

    /* TO TEST, UNCOMMENT THE BELOW AND ADD AFTER CLASS DEFINITION */
    //  my_list = new SLL();
    //  my_list.insertAtBack(8);
    //  my_list.insertAtBack(9);
    //  my_list.insertAtBack(10);
    //  console.log(my_list);
    //  Note: we will be creating the print method later, but for now, if you run the code 
    
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
    
 // WEDNESDAY -------------------------------------------------------------------//
    /**
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    printValues() {
        var runner = this.head
        while(runner != null){
            console.log(runner.value)
            runner = runner.next
        }
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
        // Create the new node
        var newNode = new SLNode(data)

        // Point new node's .next to the head
        // What happens if .head is null? .next is still null!
        newNode.next = this.head
        
        // Change the head to the new node
        this.head = newNode
    }

    /**
     * Removes the first node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the removed node.
     */
     removeAtFront(){
        // If list empty
        if(this.head == null){
            console.log("LIST IS EMPTY")
        }
        // Save head's value to return, 
        // reassign head to next node (or null if no next node)
        else {
            var value = this.head.value
            this.head = this.head.next
            return value
        }
    }
    
    // EXTRA
    /**
     * Calculates the average of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {number|NaN} The average of the node's data.
     */
    average() {
        let runner = this.head;
        let sum = 0;
        let count = 0;

        while (runner) {
            count++;
            sum += runner.value;
            runner = runner.next;
        }
        /**
         * Dividing by 0 will give you NaN (Not a Number), so an empty list
         * will return NaN in this case, it may make sense to allow NaN to be
         * returned, because the average of an empty list doesn't make sense and
         * it could be misleading to return 0 since 0 is the average of any
         * list with a sum of 0 (due to negatives or all zeros).
         */
        return sum / cnt;
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
        let runner = this.head;

        while (runner) {
            if (runner.value === val) {
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

        // We plan to save the last value
        // before removing it
        var removedVal;

        // Case if list empty
        if(!this.head) {
            console.log("List empty.")
            return null;
        }

        // Case if only one node in list
        if (!this.head.next) {

            // Save value in head to return
            removedVal = this.head.value;
            // Reassign head to null
            this.head = null;
            return removedVal;
        }

        var runner = this.head;
        // We want to stop at the second to last node
        // So we check if there is a node after the next node
        while (runner.next.next) {
            // keep advancing the pointer
            runner = runner.next;
        }
        // Save last node's value
        removedVal = runner.next.value;
        // Re-assign second-to-last node's next pointer to null
        runner.next = null;
        return removedVal;

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
        if (current === null) {
            return false;
        }
        if (current.value === val) {
            return true;
        }
        return this.containsRecursive(val, current.next);
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
        if (this.head === null) {
            return null;
        }
    
        if (runner === null) {
            return maxNode.data;
        }
    
        if (runner.data > maxNode.data) {
            maxNode = runner;
        }
    
        return this.recursiveMax(runner.next, maxNode);
    }

    // FRIDAY ----------------------------------------------------------------------//

    /**
     * Retrieves the data of the second to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the second to last node or null if there is no
     *    second to last node.
     */
    secondToLast() {}
    
    /**
     * Removes the node that has the matching given val as it's data.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The value to compare to the node's data to find the
     *    node to be removed.
     * @returns {boolean} Indicates if a node was removed or not.
     */
    removeVal(val) {}

    //  FRIDAY EXTRA
    /**
     * Retrieves the data of the kth to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the second to last node or null if there is no
     *    second to last node.
     */
     kthToLast() {}

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

/* insertAtBack & seedFromArray Test */
let my_list = new SLL();
my_list.insertAtBack(8);
my_list.insertAtBack(9);
my_list.insertAtBack(10);
console.log(my_list);

// let new_list = new SLL();
// new_list.seedFromArr([3, 4, 5, 6, 7, 8, 9]);

// for (let node = new_list.head; node !=null; node=node.next) {
//     console.log(node.value);
// }

console.log(my_list.removeBack()); // 10
console.log(my_list.removeBack()); // 9
console.log(my_list.removeBack()); // 8
console.log(my_list.removeBack()); // List empty


