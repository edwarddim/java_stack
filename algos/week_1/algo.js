// MON

/* 
Intro to Singly Linked Lists
 - OOP
 - Array VS SLL

*/


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
    //  TUESDAY -------------------------------------------------------------------//
    /**
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    printValues() {
        var runner = this.head
        while (runner != null) {
            console.log(runner.value)
            runner = runner.next
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
        // 1. SLL IS EMPTY
        // CREATE A NEW NODE WITH THE DATA GIVEN
        // THE HEAD SHOULD POINT TO THE NEW NODE

        // 2. SLL IS NOT EMPTY
        // SET THE RUNNER AT THE HEAD
        // RUN THROUGH UNTIL IT REACHES THE LAST NODE
        // CREATE A NEW NODE
        // POINT THE LAST NODE TO THE NEW NODE
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
     * Creates a new node with the given data and inserts that node at the front
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data for the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtFront(data) {
        // SLL IS EMPTY
        // CREATE A NEW NODE WITH THE GIVEN DATA
        // POINT THE HEAD AT THE NEW NODE

        // SLL IS NOT EMPTY
        // CREATE A NEW NODE
        // POINT THE NEW NODE'S NEXT TO THE HEAD
        // POINT THE HEAD TO THE NEW NODE
    }

    /**
     * Removes the first node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the removed node.
     */
    removeAtFront() {
        // SLL IS EMPTY

        // SLL IS NOT EMPTY
        // CREATE A TEMP VARIABLE POINTING AT THE SECOND NODE IN THE LIST
        // TAKE THE FIRST NODE AND POINT IT TO NULL
        // POINT THE HEAD TO THE TEMP VARIABLE
    }

    // EXTRA
    /**
     * Calculates the average of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {number|NaN} The average of the node's data.
     */
    average() {
        // SLL IS EMPTY
        if (this.head == null) {
            return 0
        }
        // SLL IS NOT EMPTY
        var total = 0
        var count = 0
        var runner = this.head
        while (runner != null) {
            total += runner.value
            count++
            runner = runner.next
        }
        return total / count;
    }
    // THURSDAY --------------------------------------------------------------------//

    /**
     * Removes the last node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the node that was removed.
     */
    removeBack() {
        // SLL IS EMPTY

        // SLL HAS ONE NODE

        // SLL IS NOT EMPTY
    }
    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The data to search for in the nodes of this list.
     * @returns {boolean}
     */
    contains(target) {
        // CREATE A RUNNER AT THE HEAD
        // HAVE THE RUNNER GO THROUGH THE SLL
            // CHECK TO SEE IF THE RUNNER VALUE MATCHES THE TARGET
            // RETURN TRUE IF THE VALUE MATCHES THE TARGET
            // GO TO THE NEXT NODE
        // RETURN FALSE IF THE RUNNER GOES OUT OF BOUNDS
    }
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

    // FRIDAY ----------------------------------------------------------------------//

    /**
     * Removes the node that has the matching given val as it's data.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The value to compare to the node's data to find the
     *    node to be removed.
     * @returns {boolean} Indicates if a node was removed or not.
     */
    removeVal(val) {
        // LIST IS EMPTY
        // LIST HAS ONE NODE
        // LIST HAS MANY NODES
        // CREATE A RUNNER AT THE HEAD
        // RUN THROUGH THE SLL
            // CHECK FOR THE RUNNERS NEXT VALUE
            // IF THE VALUE IS FOUND
                // CREATE A TEMP VARIABLE POINTING TO THE RUNNERS NEXT NODE
                // POINT THE RUNNER POINT AND SKIP TO THE NEXT NEXT NODE
                // USING THE temp VARIABLE, POINT THE NEXT TO NULL
                // RETURN true
        // RETURN false
    }

    /**
     * Retrieves the data of the second to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the second to last node or null if there is no
     *    second to last node.
     */
    secondToLast() {

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

}

//==========================//
//         TESTING          //
//==========================//


var sll = new SLL();
sll.insertAtBack(1)
sll.insertAtBack(2)
sll.insertAtBack(3)
sll.insertAtBack(4)
sll.insertAtBack(5)

sll.printValues()
sll.insertAtFront(10)
sll.removeAtFront()
sll.printValues()
