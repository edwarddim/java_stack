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

console.log(myList.hasLoop());



/** NEW CLASS!! MIN HEAP *****
 * 
 * Class to represent a MinHeap which is a Priority Queue optimized for fast
 * retrieval of the minimum value. It is implemented using an array but it is
 * best visualized as a tree structure where each 'node' has left and right
 * children except the 'node' may only have a left child.
 * - parent is located at:      Math.floor(index/2)
 * - left child is located at:  parentIdx * 2
 * - right child is located at: parentIdx * 2 + 1
 */
 class MinHeap {
    constructor() {
      /**
       * 0th index not used, so null is a placeholder. Not using 0th index makes
       * calculating the left and right children's index cleaner.
       * This also effectively makes our array start at index 1.
       */
      this.heap = [null];
    }
  
    /**
     * Retrieves the top (minimum number) in the heap without removing it.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {?number} Null if empty.
     */
    getMin() {}
  
    /**
     * Inserts a new number into the heap and maintains the heaps order.
     * 1. Push new num to back then.
     * 2. Iteratively swap the new num with it's parent while it is smaller than
     *    it's parent.
     * - Time: O(log n) logarithmic due to shiftUp / iterative swapping.
     * - Space: O(1) constant.
     * @param {number} num The num to add.
     */
    insert(num) {}

    /**
     * Extracts the min num from the heap and then re-orders the heap to
     * maintain order so the next min is ready to be extracted.
     * 1. Save the first node to a temp var.
     * 2. Pop last node off and overwrite idx1 with it.
     * 3. Iteratively swap the old last node that is now at idx1 with it's
     *    smallest child IF the smallest child is smaller than it.
     * - Time: O(log n) logarithmic due to shiftDown.
     * - Space: O(1) constant.
     * @returns {?number} The min number or null if empty.
     */
    extract() {}

    /** BONUS CHALLENGE **/

    /**
     * Given an unsorted array, returns a heap instance version of the array.
     * - Time: ?
     * - Space: ?
     * @returns {MinHeap} a heap with the same numbers as the array.
     */
    // static allows this method to be executed directly on the class itself 
    // rather than needing to be executed on an instance or going through the .prototype
    // converts an array into a new heap
    static heapify(vals) {
        
    }

}

/** BONUS CHALLENGE **/
// Time: O(n log n) linearithmic because .insert is O(log n) and .insert is being done n times
function heapSort(nums) {
    
}
