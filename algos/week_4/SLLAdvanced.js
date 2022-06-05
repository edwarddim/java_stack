// SLL Advanced

class Node {
    constructor(val) {
        this.value = val;
        this.next = null;
    }
}


class SLL {
    constructor() {
        this.head = null;
    }

    // ADD A NEW NODE TO THE FRONT OF THE LIST AT THE HEAD
    push(val) {
        // create a new node with a name
        let new_node = new Node(val);

        // connect the new node to the head node
        // re-assign new_node's next to the head
        new_node.next = this.head;

        //Re-assign head to new node
        this.head = new_node; 
        return this;
    }

    /**
     * Reverses this list in-place without using any extra lists.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    reverse() {
        if (!this.head || !this.head.next) {
            return this;
        }

        let new_head;

        // Keep a temp var to hold the rest of the list
        // that still needs to be reveresed
        let current = this.head.next;
        // The head node will become the last node, so we
        // first need to point heads's next to null
        this.head.next = null;

        //  While there are still nodes left in the list to reverse
        while (current) {
            
            // Moving on to the next node.
            new_head = current;
            
            // keep a reference to the remaining node chain.
            // so new head can disconnect
            current = current.next;
            
            // connect the node to the current reversed list head.
            new_head.next = this.head;

            // make the node the new head of the reverse list.
            this.head = new_head;
        }
    }

    /**
     * Determines whether the list has a loop in it which would result in
     * infinitely traversing unless otherwise avoided. A loop is when a node's
     * next points to a node that is behind it.
     * - Time: (?).
     * - Space: (?).
     * @returns {boolean} Whether the list has a loop or not.
     */
    hasLoop() {

        let runner = this.head;
        let sprinter = this.head;

        while(sprinter && sprinter.next) {
            runner = runner.next;
            sprinter = sprinter.next.next;
            if(runner == sprinter) {
                return true;
            }
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
        
    }
}

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