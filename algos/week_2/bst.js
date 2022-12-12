/**
 * Class to represent a Node in a Binary Search Tree (BST).
 */
class BSTNode {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    constructor() {
        this.root = null;
    }

    isEmpty() {
        return this.root === null;
    }

    min(current = this.root) {
        // BST IS EMPTY
        if (this.isEmpty()) {
            return null;
        }
        // BST IS NOT EMPTY
        let runner = current;
        while (runner.left != null) {
            runner = runner.left
        }
        return runner.data
    }

    minRecursive(current = this.root) {
        // BASE CASE
        if (current.left === null) {
            return current.data
        }
        // FORWARD PROGRESS
        // RECURSIVE CALL
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
    max(current = this.root) { }

    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    maxRecursive(current = this.root) { }

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
    // ------------------- TUESDAY --------------------------//
    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    contains(searchVal) {
        // BST IS EMPTY

        // BST IS NOT EMPTY
        // SET RUNNER AT ROOT
        // while loop
        // searchVal is EQUAL to runner data
        // searchVal is LESS THAN to runner data
        // searchVal is GREATER THAN to runner data
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

    // ------------------- WEDNESDAY --------------------------//
    /**
     * Inserts a new node with the given newVal in the right place to preserver
     * the order of this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} newVal The data to be added to a new node.
     * @returns {BinarySearchTree} This tree.
     */
    insert(newVal) {
        const node = new BSTNode(newVal);

        if (this.isEmpty()) {
          this.root = node;
          return this;
        }
    
        let current = this.root;
    
        while (true) {
          if (newVal <= current.data) {
            if (current.left === null) {
              current.left = node;
              return this;
            }
    
            current = current.left;
          } else {
            // newVal is greater than current.data
            if (current.right === null) {
              current.right = node;
              return this;
            }
    
            current = current.right;
          }
        }
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

    // ------------------- THRUSDAY --------------------------//
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
        if(node !== null){
            vals = this.toArrInorder(node.left, vals)
            vals.push(node.data)
            vals = this.toArrInorder(node.right, vals)
        }
        return vals
    }
    // preorder
    toArrPreorder(node = this.root, vals = []) { 
        if(node !== null){
            vals.push(node.data)
            vals = this.toArrInorder(node.left, vals)
            vals = this.toArrInorder(node.right, vals)
        }
        return vals
    }
    // postorder
    toArrPostorder(node = this.root, vals = []) { 
        if(node !== null){
            vals = this.toArrInorder(node.left, vals)
            vals = this.toArrInorder(node.right, vals)
            vals.push(node.data)
        }
        return vals
    }

    // ------------------- FRIDAY --------------------------//
    /**
     * Recursively counts the total number of nodes in this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} node The current node during the traversal of this tree.
     * @returns {number} The total number of nodes.
     */
    size(node = this.root) {
      // BASE CASE
      if(node === null){
        return 0
      }
      return 1 + this.size(node.left) + this.size(node.right)
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
      // BASE CASE
      if(node === null){
        return 0
      }
      // COMPARE THE LEFT HEIGHT AND RIGHT HEIGHT
      let left = this.height(node.left)
      let right = this.height(node.right)
      if(left < right){
        return right + 1
      }
      return left + 1
      // WHICHEVER HEIGHT IS BIGGER ADD ONE MORE TO THAT HEIGHT
    }

    /**
     * Determine whether the BST is balanced, for a BST to be balanced,
     * a Node's left and right height must have a max difference of 1 AND
     * all Nodes in the tree must be balanced as well.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} node The current node during traversal of this tree.
     * @returns {boolean} 
     */
    isBalanced(node = this.root) {
      if(node === null){
        return true
      }
      let left = this.height(node.left)
      let right = this.height(node.right)
      if(Math.abs(left - right) < 2 && this.isBalanced(node.left) && this.isBalanced(node.right) ){
        return true
      }
      return false
    }

}
/* fullTree
                    root
                <-- 25 -->
              /            \
            15             50
          /    \         /    \
        10     22      35     70
      /   \   /  \    /  \   /  \
    4    12  18  24  31  44 66  90


*/
const fullTree = new BinarySearchTree();
fullTree
    .insert(25)
    .insert(15)
    .insert(10)
    .insert(22)
    .insert(4)
    .insert(12)
    .insert(18)
    .insert(24)
    .insert(50)
    .insert(35)
    .insert(70)
    .insert(31)
    .insert(44)
    .insert(66)
    .insert(90);
fullTree.print();
console.log(fullTree.toArrInorder());
console.log(fullTree.toArrPreorder());
console.log(fullTree.toArrPostorder());
console.log(fullTree.isBalanced())


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
    2   6  13  
           /
          11
*/
const threeLevelTree = new BinarySearchTree();
threeLevelTree.root = new BSTNode(10);
threeLevelTree.root.left = new BSTNode(5);
threeLevelTree.root.left.left = new BSTNode(2);
threeLevelTree.root.left.right = new BSTNode(6);
threeLevelTree.root.right = new BSTNode(15);
threeLevelTree.root.right.left = new BSTNode(13);
threeLevelTree.root.right.left.left = new BSTNode(11);

// console.log(threeLevelTree.contains(6))

// console.log(threeLevelTree.min())
// threeLevelTree.print()