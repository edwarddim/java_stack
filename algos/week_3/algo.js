// MON
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


    // Inserts a value into the tree
    // positioning based on it's value.
    // RECURSIVE
    insert(val, runner=this.root) {
        if (!this.root) {
            this.root = new BSTNode(val);
            return this;
        }  
        if (!runner.left && val < runner.value) {
            runner.left = new BSTNode(val);
            return this;
        }
        else if (!runner.right && val >= runner.value) {
            runner.right = new BSTNode(val);
            return this;
        }
        else return val >= runner.value? 
            this.insert(val, runner.right):
            this.insert(val, runner.left); 
    }

    insertIterative(val) {
        if (!this.root) {
            this.root = new BSTNode(val);
            return this;
        }
        let runner = this.root;
        while (
            (runner.left && val < runner.value) || 
            (runner.right && val >= runner.value)) {
                
                // Move runner left or right - ternary statement (shortened if block)
                runner = val < runner.value ? runner.left: runner.right;
            }
        if (val < runner.value) {
            runner.left = new BSTNode(val);
        }
        else runner.right = new BSTNode(val);
        return this;
    }

    /**
     * Determines if this tree is empty.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {boolean} Indicates if this tree is empty.
     */
    isEmpty() {
        return this.root == null;
    }

    /**
     * Retrieves the smallest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The smallest integer from this tree.
     */
    min(current = this.root) {
        if(!current) {
            console.log("Root node of subtree empty");
            return null;
        }

        while (current.left) {
            current = current.left;
        }
        return current.value;
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
        if(!current) {
            return null;
        }
        if (!current.left) {
            return current.value;
        }
        return this.minRecursive(current.left);
    }

    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    max(current = this.root) {
        if(!current) {
            console.log("Root node of subtree empty");
            return null;
        }

        while (current.right) {
            current = current.right;
        }
        return current.value;
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
        if(!current) {
            return null;
        }
        if (!current.right) {
            return current.value;
        }
        return this.maxRecursive(current.right);
    }
        
}

let tree = new BST();
let testVals = [10, 5, 7, 20, 15, 15, 12, 13, 23, 2, 1];
/*
              10
             /   \
           5      20
          / \    /  \
         2   7  15   23
        /      /  \
       1      12   15
                \
                13
*/      
for (let val of testVals) {
    tree.insert(val);
}

// Consider running this code in your browser through the inspect console.
// Chrome dev tools will log to the console nested objects that you can expand
// to see the whole tree represented..
console.log(tree); 

console.log(`Min of tree (recursive): ${tree.minRecursive()}`); // 1
console.log(`Min of right subtree (recursive): ${tree.minRecursive(tree.root.right)}`); // 12
console.log(`Max of tree (recursive): ${tree.maxRecursive()}`); // 23
console.log(`Max of left subtree (recursive): ${tree.maxRecursive(tree.root.left)}`); // 7



