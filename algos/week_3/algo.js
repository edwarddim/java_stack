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

let tree2 = new BST();
for (let val of testVals) {
    tree2.insertIterative(val);
}
console.log(tree2);




