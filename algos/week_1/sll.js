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
    //  MONDAY -------------------------------------------------------------------//
    /**
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
     isEmpty(){
        if(this.head === null){
            return true
        }
        return false
    }
     printValues() {
        // SLL IS EMPTY
        if(this.isEmpty()){
            console.log("SLL IS EMPTY")
        }
        // SLL IS NOT EMPTY
        let runner = this.head
        while(runner != null){
            console.log(runner.value)
            runner = runner.next.next
        }
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
    insertAtBack(data) {
        // SLL IS EMPTY
            // CREATE A NEW NODE WITH THE GIVEN DATA
            // POINT THE HEAD TO THE NEW NODE
            // RETURN
        // SLL IS NOT EMPTY
            // CREATE A RUNNER AT THE HEAD
            // RUN THE RUNNER UNTIL IT GETS TO THE LAST NODE
            // CREATE A NEW NODE WITH THE GIVEN DATA
            // POINT THE RUNNER'S NEXT TO THE NEW NODE
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
        let NewNode = new SLNode(data)
        if(this.isEmpty()){
            console.log("SLL IS EMPTY")
            // POINT THE HEAD TO THE NEW NODE
            this.head = NewNode
            // RETURN
            return 
        }
        // SLL IS NOT EMPTY
        // CREATE A RUNNER AT THE HEAD
        let runner = this.head
        // RUN THE RUNNER UNTIL IT GETS TO THE LAST NODE
        while(runner.next != null){
            runner = runner.next
        }
        // POINT THE RUNNER'S NEXT TO THE NEW NODE
        runner.next = NewNode
        return
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
        // SLL IS EMPTY

        // SLL IS NOT EMPTY

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


let sll = new SLL();
sll.insertAtBack(1)
sll.insertAtBack(2)
sll.insertAtBack(3)
sll.insertAtBack(4)
sll.insertAtBack(5)

sll.printValues()
sll.seedFromArr([1,2,3,4,5,6])
// sll.insertAtFront(10)
// sll.removeAtFront()
// sll.printValues()


let slnode = new SLNode("a")
// let runner = slnode
// slnode.value = "b"
// console.log(runner)

// let newSLL = new SLL()

let slNode1 = new SLNode('a')
let slNode2 = new SLNode('b')
// newSLL.head = slNode1
// slNode1.next = slNode2