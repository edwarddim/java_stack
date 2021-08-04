// MON

/* 
Intro to Singly Linked Lists
 - OOP
 - Array VS SLL

*/


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
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    printValues() {
        if(this.head == null){
            console.log("LIST EMPTY")
            return
        }
        // IF THE LIST IS NOT EMPTY
        var runner = this.head
        while(runner != null){
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
    insertAtBack(data){
        // 1. SLL IS EMPTY
        // 2. SLL IS NOT EMPTY
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
        // CREATE NEW NODE
        // POINT NEW NODE NEXT TO CURRENT HEAD
        // POINT HEAD TO THE NEW NODE
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
