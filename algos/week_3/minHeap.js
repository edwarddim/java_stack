/**
 * Class to represent a MinHeap which is a Priority Queue optimized for fast
 * retrieval of the minimum value. It is implemented using an array but it is
 * best visualized as a tree structure where each 'node' has left and right
 * children except the 'node' may only have a left child.
 * - parent is located at: Math.floor(i / 2);
 * - left child is located at: i * 2
 * - right child is located at: i * 2 + 1
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
  top() { }

  /**
   * Inserts a new number into the heap and maintains the heaps order.
   * 1. Push new num to back then.
   * 2. Iteratively swap the new num with it's parent while it is smaller than
   *    it's parent.
   * - Time: O(log n) logarithmic due to shiftUp / iterative swapping.
   * - Space: O(1) constant.
   * @param {number} num The num to add.
   */
  insert(num) {
    // PUSH THE NUM TO THE ARRAY(this.heap)
    // SHIFT UP LOGIC
    // let startIndex = this.heap.length - 1

    // while( startIndex > 1)
    // FIND PARENT INDEX USING Math.floor(index / 2)
    // COMPARE PARENT VALUE > CHILD VALUE
    // SWAP THE PARENT AND CHILD
    // SET STARTINDEX TO PARENT INDEX
    // PARENT VALUE < CHILD VALUE
    // INSERT LOGIC IS DONE
  }
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
  extract() {
    // SWAP FIRST AND LAST ELEMENT
    // POP LAST ELEMENT AND STORE INSIDE VARIABLE

    let parentIdx = 1;
    let leftChildIdx = parentIdx * 2
    // START SHIFT DOWN LOGIC
    while(leftChildIdx < this.heap.length){
      // IS THERE A RIGHT CHILD??
      // CHECK TO SEE IF RIGHT CHILD INDEX EXISTS
      // IF BOTH LEFT AND RIGHT CHILD EXISTS
        // COMPARE THE CHILDREN VALUES, FIND THE LESSER VALUE
        // COMPARE AGAINST PARENT VALUE AND SWAP IF NECESSARY
      // IF ONLY THE LEFT CHILD EXISTS
        // COMPARE AGAINST PARENT VALUE AND SWAP IF NECESSARY
    }
    // RETURN THE MIN VARIABLE
  }
  /**
   * Logs the tree horizontally with the root on the left and the index in
   * parenthesis using reverse inorder traversal.
   */
  printHorizontalTree(parentIdx = 1, spaceCnt = 0, spaceIncr = 10) {
    if (parentIdx > this.heap.length - 1) {
      return;
    }

    spaceCnt += spaceIncr;
    this.printHorizontalTree(parentIdx * 2 + 1, spaceCnt);

    console.log(
      " ".repeat(spaceCnt < spaceIncr ? 0 : spaceCnt - spaceIncr) +
      `${this.heap[parentIdx]} (${parentIdx})`
    );

    this.printHorizontalTree(parentIdx * 2, spaceCnt);
  }
}