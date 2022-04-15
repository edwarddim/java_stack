class BSTNode {
    constructor(data) {
        this.data = data
        this.left = null
        this.right = null
    }
}

class BinarySearchTree {
    constructor() {
        this.root = null
    }

    /**
     * Determines if this tree is empty.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {boolean} Indicates if this tree is empty.
     */
    isEmpty() {
        if (this.root === null) {
            return true
        }
        else {
            return false
        }
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
        // 1. BST IS EMPTY
        if (this.isEmpty()) {
            console.log("BST IS EMPTY")
            return
        }
        // 2. BST IS NOT EMPTY
        var runner = this.root
        while (runner.left != null) {
            runner = runner.left
        }
        return runner.data
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
        // 1. BASE CASE
        if (current === null) {
            return null
        }
        if (current.left === null) {
            return current.data
        }
        // 2. FORWARD PROGRESS
        // 3. RECURSIVE CALL
        return this.minRecursive(current.left)
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
        // 1. BST IS EMPTY
        if (this.isEmpty()) {
            console.log("BST IS EMPTY")
            return
        }
        // 2. BST IS NOT EMPTY
        var runner = this.root
        while (runner.right != null) {
            runner = runner.right
        }
        return runner.data
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
        // 1. BASE CASE
        if (current === null) {
            return null
        }
        if (current.right === null) {
            return current.data
        }
        // 2. FORWARD PROGRESS
        // 3. RECURSIVE CALL
        return this.minRecursive(current.right)
    }

    // Logs this tree horizontally with the root on the left.
    print(node = this.root, spaceCnt = 0, spaceIncr = 10) {
        if (!node) {
            return;
        }

        spaceCnt += spaceIncr;
        this.print(node.right, spaceCnt);

        console.log(
            " ".repeat(spaceCnt < spaceIncr ? 0 : spaceCnt - spaceIncr) +
            `${node.data}`
        );

        this.print(node.left, spaceCnt);
    }
    // TUESDAY -------------------------------------------------------------------//

    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    contains(searchVal) {
        // 1. BST IS EMPTY
        // 2. BST IS NOT EMPTY

        // If the searchVal is less than the runner data, go left
        // If the searchVal is greater than the runner data, go right
        var runner = this.root
        while (runner != null) {
            if (searchVal < runner.data) {
                runner = runner.left
            }
            else if (searchVal > runner.data) {
                runner = runner.right
            }
        }
    }

    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    containsRecursive(searchVal, current = this.root) { }

    /**
     * Calculates the range (max - min) from the given startNode.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} startNode The node to start from to calculate the range.
     * @returns {number|null} The range of this tree or a sub tree depending on if the
     *    startNode is the root or not.
     */
    range(startNode = this.root) { }


    // WEDNESDAY -------------------------------------------------------------------//
    /**
     * Inserts a new node with the given newVal in the right place to preserver
     * the order of this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} newVal The data to be added to a new node.
     * @returns {BinarySearchTree} This tree.
     */
    insert(newVal) {
        var newNode = new BSTNode(newVal)
        // 1. BST IS EMPTY
        if (this.isEmpty()) {
            this.root = newNode
            return
        }
        // 2. BST IS NOT EMPTY
        // AS THE RUNNER GOES THROUGH THE BST
        // CHECK TO SEE WHETHER THE newNode needs to go on the left or the right
        // CHECK TO SEE IF THERE IS NO NODE => INSERT THE newNode
        // IF THERE ALREADY IS A NODE, WE NEED TO TRAVERSE FURTHER INTO BST

    }

    /**
     * Inserts a new node with the given newVal in the right place to preserver
     * the order of this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} newVal The data to be added to a new node.
     * @param {Node} curr The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {BinarySearchTree} This tree.
     */
    insertRecursive(newVal, curr = this.root) { }

    // THURSDAY -------------------------------------------------------------------//
    /**
     * DFS Inorder: (Left, CurrNode, Right)
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
            // RECURSIVELY CALL THE LEFT SIDE OF THE NODE
            this.toArrInorder(node.left, vals)
            // ADDING THE CURRENT NODE'S NUMBER TO ARR
            vals.push(node.data)
            // RECURSIVELY CALL THE RIGHT SIDE OF THE NODE
            this.toArrInorder(node.right, vals)
        }
        return vals
        // 1. BASE CASE
        // 2. FORWARD PROGRESS
        // 3. RECURSIVE CALL
    }


    /**
     * DFS Preorder: (CurrNode, Left, Right)
     * Converts this BST into an array following Depth First Search preorder.
     * Example on the fullTree var:
     * [25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90]
     * @param {Node} node The current node during the traversal of this tree.
     * @param {Array<number>} vals The data that has been visited so far.
     * @returns {Array<number>} The vals in DFS Preorder once all nodes visited.
     */
    toArrPreorder(node = this.root, vals = []) {
        if (node) {
            // ADDING THE CURRENT NODE'S NUMBER TO ARR
            vals.push(node.data)
            // RECURSIVELY CALL THE LEFT SIDE OF THE NODE
            this.toArrInorder(node.left, vals)
            // RECURSIVELY CALL THE RIGHT SIDE OF THE NODE
            this.toArrInorder(node.right, vals)
        }
        return vals
    }

    /**
     * DFS Postorder (Left, Right, CurrNode)
     * Converts this BST into an array following Depth First Search postorder.
     * Example on the fullTree var:
     * [4, 12, 10, 18, 24, 22, 15, 31, 44, 35, 66, 90, 70, 50, 25]
     * @param {Node} node The current node during the traversal of this tree.
     * @param {Array<number>} vals The data that has been visited so far.
     * @returns {Array<number>} The vals in DFS Preorder once all nodes visited.
     */
    toArrPostorder(node = this.root, vals = []) {
        if (node) {
            // RECURSIVELY CALL THE LEFT SIDE OF THE NODE
            this.toArrInorder(node.left, vals)
            // RECURSIVELY CALL THE RIGHT SIDE OF THE NODE
            this.toArrInorder(node.right, vals)
            // ADDING THE CURRENT NODE'S NUMBER TO ARR
            vals.push(node.data)
        }
        return vals
    }
    // FRIDAY -------------------------------------------------------------------//
    /**
     * Recursively counts the total number of nodes in this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} node The current node during the traversal of this tree.
     * @returns {number} The total number of nodes.
     */
    size(node = this.root) { 
        // 1. BASE CASE
        if(node === null){
            return 0
        }
        return 1 + this.size(node.left) + this.size(node.right)
        // 2. FORWARD PROGRESS
        // 3. RECURSIVE CALL
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
        if(node === null){
            return 0
        }
        return 1 + Math.max(this.height(node.left) , this.height(node.right))
    }
}

//==========================//
//         TESTING          //
//==========================//


const emptyTree = new BinarySearchTree();



const oneNodeTree = new BinarySearchTree();
oneNodeTree.root = new BSTNode(10);

/* twoLevelTree
        root
        10
      /   \
    5     15
*/
const twoLevelTree = new BinarySearchTree();
twoLevelTree.root = new BSTNode(10);
twoLevelTree.root.left = new BSTNode(5);
twoLevelTree.root.right = new BSTNode(15);

/* threeLevelTree 
                      root
                      10
                    /   \
                   5     15
                  / \    / \
                 2   6  13  20
*/





const threeLevelTree = new BinarySearchTree();
threeLevelTree.root = new BSTNode(10);
threeLevelTree.root.left = new BSTNode(5);
threeLevelTree.root.left.left = new BSTNode(2);
threeLevelTree.root.left.right = new BSTNode(6);
threeLevelTree.root.right = new BSTNode(15);
threeLevelTree.root.right.right = new BSTNode(20);
threeLevelTree.root.right.left = new BSTNode(13);

console.log(threeLevelTree.toArrInorder())


// console.log(threeLevelTree.max())
// console.log(threeLevelTree.min())
console.log(threeLevelTree.contains(13)) // return true
console.log(threeLevelTree.contains(30)) // return false
console.log(threeLevelTree.range()) // return 18