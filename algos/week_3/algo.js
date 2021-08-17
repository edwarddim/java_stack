class BSTNode{
    constructor(value){
        this.value = value
        this.left = null
        this.right = null
    }
}

class BST{
    constructor(){
        this.root = null
    }
    search(val){
        // BST IS EMPTY
        if(this.root === null){
            return false;
        }
        // BST IS NOT EMPTY
        var runner = this.root

        while(runner != null){
            // IS THE VALUE WITHIN THE NODE
            if(runner.value === val){
                return true
            }
            else if(val < runner.value){
                runner = runner.left
            }
            else if(val > runner.value){
                runner = runner.right
            }
        }
        return false
    }

    insertIterative(val){
        // IS THE BST EMPTY?
        if(this.root === null){
            this.root = new BSTNode(val)
        }
        // HAVE YOUR RUNNER END UP IN THE COORECT SPOT
        // CREATE A NODE ON THE CORRECT SIDE OF THAT NODE
        while(runner != null){
            // CHECK TO SEE IF VALUE TO INSERT IS LESS THAN RUNNER VALES
            if(val < runner.value){
                // CHECK TO SEE IF THERE IS AN EMPTY PLACE TO CREATE NEW NODE
                if(runner.left === null){
                    runner.left = new BSTNode(val)
                    return
                }
                // IF THERE IS AN EXISTING NODE, KEEP ON RUNNING THROUGH BST
                runner = runner.left
            }
            // CHECK TO SEE IF VALUE TO INSERT IS GREATER THAN RUNNER VALES
            else if(val > runner.value){
                if(runner.right === null){
                    runner.right = new BSTNode(val)
                    return
                }
                runner = runner.right
            }
        }
    }
    insertRecursive(val){

    }


    /**
     * Determines if this tree is empty.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {boolean} Indicates if this tree is empty.
     */
     isEmpty() {

    }

    /**
     * Retrieves the smallest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The smallest integer from this tree.
     */
    min() {

    }

    /**
     * Retrieves the smallest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The smallest integer from this tree.
     */
    minRecursive(current = this.root) {
        // 1. BASE CASE - WHEN THE NODE GIVEN IS NULL
        // 2. FORWARD PROGRESS
        // 3. RECURSIVE CALL
    }

    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    max() {

    }

    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    maxRecursive(current = this.root) {

    }


}