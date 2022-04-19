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
  top() {
      if(this.heap.length > 1){
          return this.heap[1]
      }
      else{
          return null
      }
  }

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
      this.heap.push(num)
      this.shiftUp()
  }

  shiftUp(){
    // LAST INDEX OF THE ARRAY
    var indexToShift = this.heap.length - 1

    while(indexToShift > 1){
        var parentIndex = Math.floor(indexToShift / 2)

        if(this.heap[parentIndex] <= this.heap[indexToShift]){
            break
        }

        var temp = this.heap[parentIndex]
        this.heap[parentIndex] = this.heap[indexToShift]
        this.heap[indexToShift] = temp

        indexToShift = parentIndex
    }
  }

    /**
   * Extracts the min num from the heap and then re-orders the heap to
   * maintain order so the next min is ready to be extracted.
   * 1. Save the first node to a temp var.
   * 2. Pop last node off and set idx1 equal to the popped value.
   * 3. Iteratively swap the old last node that is now at idx1 with it's
   *    smallest child IF the smallest child is smaller than it.
   * - Time: O(log n) logarithmic due to shiftDown.
   * - Space: O(1) constant.
   * @returns {?number} The min number or null if empty.
   */
    extract() {
      // SWAP THE NUMBER TO REMOVE AND THE LAST NUMBER IN ARRAY
      // .pop() THE NUMBER TO REMOVE AND STORE IT IN A TEMP VARIABLE


      // shiftDown
      // LOOP UNTIL THE INDEX REACHES THE END OF THE ARRAY (this.heap.length - 1)
      // SWAP WITH THE LESSER OF THE TWO CHILDREN VALUES


      // RETURN THE TEMP VARIABLE
        
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


var minheap = new MinHeap()

minheap.insert(5)
minheap.insert(6)
minheap.insert(8)
minheap.insert(10)
minheap.insert(2)
minheap.insert(1)

minheap.printHorizontalTree()