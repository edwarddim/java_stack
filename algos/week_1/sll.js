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

}

//==========================//
//         TESTING          //
//==========================//


var sll = new SLL();
// sll.insertAtBack(1)
// sll.insertAtBack(2)
// sll.insertAtBack(3)
// sll.insertAtBack(4)
// sll.insertAtBack(5)

// sll.printValues()
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