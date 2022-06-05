/** NEW CLASS!! MIN HEAP *****
 * 
 * Class to represent a MinHeap which is a Priority Queue optimized for fast
 * retrieval of the minimum value. It is implemented using an array but it is
 * best visualized as a tree structure where each 'node' has left and right
 * children except the 'node' may only have a left child.
 * - parent is located at: Math.floor(i / 2)
 * - left child is located at: 2i
 * - right child is located at: 2i + 1
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
    getMin() {
        
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
        // 1. PUSH THE VALUE INTO THE ARRAY
        // 2. CHECK FOR PARENT VALUES, IS IT GREATER OR SMALLER?
        // 3. SWAP IF NECESSARY
    }

    extract() {
      // TO SAVE THE MIN NUMBER THAT WE WANT TO RETURN
      // SWAP THE FIRST AND LAST NUMBER IN ARR
      // POP THE LAST NUMBER

      // THE INDEX OF THE VALUE THAT WE ARE SWAPPING
      var index = 1;
      var leftIdx = index * 2
      var rightIdx = leftIdx + 1

      while( leftIdx < this.heap.length){
        // IS A SWAP NECESSARY
        // WHICH CHILD VALUE DO WE SWAP WITH

        // LOGIC FOR THE ACTUAL SWAP IF NECESSARY

        // RESETING THE INDEXES FOR THE NEXT STEP OF SWAPS
      }
      // RETURN THE MIN NUMBER
    }
}