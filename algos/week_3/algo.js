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

    ///         WEDNESDAY           ///

    // Predict the output, then rename the function
    // based on the outcome.
    printInOrder(node=this.root) {
        if (!node) {
            return;
        }
        this.printInOrder(node.left);
        console.log(node.value);
        this.printInOrder(node.right);
    }

        /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    contains(searchVal) {}

    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    containsRecursive(searchVal, current = this.root) {}

    // Extra for those hungry for more BST practice:
    /**
     * Calculates the range (max - min) from the given startNode.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} startNode The node to start from to calculate the range.
     * @returns {number|null} The range of this tree or a sub tree depending on      * if the start Node is the root or not.
     */
     range(startNode = this.root) {

     }

     ///        THURSDAY        ///

     /**
     * DFS Inorder: (Left, Parent, Right)
     * Converts this BST into an array following Depth First Search inorder.
     * See debugger call stack to help understand the recursion.
     * Example on the fullTree var:
     * [4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90]
     * @param {Node} node The current node during the traversal of this tree.
     * @param {Array<number>} vals The data that has been visited so far.
     * @returns {Array<number>} The vals in DFS Preorder once all nodes visited.
     */
    toArrInorder(node = this.root, vals = []) {
        if (node) {
            this.toArrInorder(node.left, vals);
            vals.push(node.value);
            this.toArrInorder(node.right, vals);
        }
        return vals;
        
    }

    /**
     * Recursively counts the total number of nodes in this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} node The current node during the traversal of this tree.
     * @returns {number} The total number of nodes.
     */
    size(node = this.root) {
        if (!node) {
            return 0;
          }
          // Translates into something like: 1 + 1 + 1 + 1 + 0 + 1 + 1 + 1 + 0
          // instead of using a sum variable.
          return 1 + this.size(node.left) + this.size(node.right);
    }

    /**
     * Calculates the height of the tree which is based on how many nodes from
     * top to bottom (whichever side is taller).
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} node The current node during traversal of this tree.
     * @returns {number} The height of the tree.
     */
    height(node = this.root) {
        if (!node) {
            return 0;
          }
          // base case returns 0 but then the + 1 starts incrementing for each recursive call
          return 1 + Math.max(this.height(node.left), this.height(node.right));
          
          // Note: You also could also use if statements and variables to compare 
          // and get the greater of the two sides rather than max -- but remember js hoisting.
          // Using the keyword var (instead of let) could result in unintended behavior 
          // regarding scope.
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

console.log(tree.toArrInorder());

// Consider running this code in your browser through the inspect console.
// Chrome dev tools will log to the console nested objects that you can expand
// to see the whole tree represented..
// console.log(tree); 

// console.log(`Min of tree (recursive): ${tree.minRecursive()}`); // 1
// console.log(`Min of right subtree (recursive): ${tree.minRecursive(tree.root.right)}`); // 12
// console.log(`Max of tree (recursive): ${tree.maxRecursive()}`); // 23
// console.log(`Max of left subtree (recursive): ${tree.maxRecursive(tree.root.left)}`); // 7



