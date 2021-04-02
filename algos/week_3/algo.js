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
    /* 
        CHECK TO SEE IF BST IS EMPTY
    */
    isEmpty(){
        if(this.root == null){
            return true
        }
        else{
            return false
        }
    }
    /* 
        RETURN THE MINIMUM VALUE STORED IN THE BST
    */
    min(){
        // CHECK TO SEE IF BST IS EMPTY
        if(this.isEmpty()){
            return null
        }
        // SET A RUNNER AND MOVE DOWN LEFT SIDE OF BST
        var runner = this.root
        while(runner.left != null){
            runner = runner.left
        }
        return runner.value
    }
    /* 
        RETURN THE MAXIMUM VALUE STORED IN THE BST
    */
    max(){
        if(this.isEmpty()){
            return null
        }
        // SET A RUNNER AND MOVE DOWN RIGHT SIDE OF BST
        var runner = this.root
        while(runner.right != null){
            runner = runner.right
        }
        return runner.value
    }
    /* 
        RETURN THE RANGE OF BST, MAX - MIN
    */
    range(){
        return this.max() - this.min()
    }
    /* 
        CREATE A NODE IN THE BST AT THE RIGHT PLACE
    */
    insert(value){
        // BST IS EMPTY
        if(this.isEmpty()){
            this.root = new BSTNode(value)
            return
        }
        var runner = this.root
        while(runner != null){
            if(value < runner.value){
                if(runner.left == null){
                    runner.left = new BSTNode(value)
                    return
                }
                else{
                    runner = runner.left
                }
            }
            else{
                if(runner.right == null){
                    runner.right = new BSTNode(value)
                    return
                }
                else{
                    runner = runner.right
                }
            }
        }

    }
    /* 
        RETURNS TRUE IF THE VALUE EXISTS WITHIN THE BST
    */
    contains(value){
        if(this.isEmpty()){
            return false
        }
        if(this.root.value == value){
            return true
        }
        else{
            var runner = this.root
            while(runner != null){
                if(runner.value == value){
                    return true
                }
                else{
                    if(value < runner.value){
                        runner = runner.left
                    }
                    else{
                        runner = runner.right
                    }
                }
            }
            return false
        }
    }
    sortedArrtoBST(arr){
        this.root = this.sortedArrtoBSTHelper(arr)
    }
    sortedArrtoBSTHelper(arr){
        // 1. BASE CASE
        if(arr.length < 1){
            return null
        }
        // CHOOSING MIDDLE INDEX AND CREATING NODE WITH MID NUMBER
        var midInd = Math.floor(arr.length/2)
        var root = new BSTNode(arr[midInd])
        // 2. FORWARD PROGRESS(SLICING THE ARR)
        // 3. RECRUSIVE CALL
        root.left = this.sortedArrtoBSTHelper(arr.slice(0, midInd))
        root.right = this.sortedArrtoBSTHelper(arr.slice(midInd + 1, arr.length))
        return root
    }
    /* 
        RETURNS THE HEIGHT OF THE BST
    */
    height(){
        return this.heightHelper(this.root)
    }
    heightHelper(node){
        // BASE CASE
        if(node == null){
            return 0
        }
        // FORWARD PROGRESS & RECURSIVE
        var leftHeight = this.heightHelper(node.left)
        var rightHeight = this.heightHelper(node.right)
        if(leftHeight > rightHeight){
            return leftHeight + 1
        }
        else{
            return rightHeight + 1
        }
    }
    /* 
        CHECK IF THE BST IS CURRENTLY BALANCED
        REQUIREMENTS FOR BEING BALANCED:
        1. DIFFERENCE OF HEIGHT IN LEFT AND RIGHT NODE MUST 1 OR LESS
        2. ALL NODES WITHIN BST MUSBT BE BALANCED, NOT JUST THE ROOT
    */
    isBalanced(){
        return this.isBalancedHelper(this.root)
    }
    isBalancedHelper(node){
        if(node == null){
            return true
        }
        var leftHeight = this.height(node.left)
        var rightHeight = this.height(node.right)
        // if( DIFFERENCE IN LEFT AND RIGHT HEIGHT IS LESS THAN 1 && LEFT NODE IS BALANCED && RIGHT NODE IS BALANCED )
        if( Math.abs(leftHeight-rightHeight) <= 1 && this.isBalancedHelper(node.left) && this.isBalancedHelper(node.right) ){
            return true
        }
        else{
            return false
        }
        
    }
    /* 
        DELETE THE NODE CONTAING VALUE GIVEN, IF VALUE DOESN'T EXIST WITHIN TREE RETURN FALSE
    */
    delete(value){
        return this.recDelete(this.root,value)
    }

    recDelete(node, value){
        if(node == null){
            return
        }
        else if(value < node.value){
            node.left = this.recDelete(node.left, value)
        }
        else if(value > node.value){
            node.right = this.recDelete(node.right, value)
        }
        else{
            // CASE 1: Deleting a node with ONE or NO child node(NOT RECURRSIVE)
            if(node.left == null){
                var temp = node.right
                node = null
                return temp
            }
            else if(node.right == null){
                var temp = node.left
                node = null
                return temp
            }
            // CASE 2: Deleting a node with TWO child nodes(RECURSIVE)
            else{
                // GRAB MAX OF THE LEFT SIDE OR MIN OF THE RIGHT SIDE
                // REPLACE VALUE WITH THE NEW VALUE
                // DELETE THE OLD VALUE
                var tempValue = this.min(node.right)
                node.value = tempValue
                node.right = this.recDelete(node.right, tempValue)
            }
        }
        return node
    }
}
var newBST = new BST()
newBST.sortedArrtoBST([1,2,3,4,5,6,7,8,9])
console.log(newBST.height())


