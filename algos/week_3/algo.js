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
}


// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// TUE
/* 
    RETURN THE RANGE OF BST, MAX - MIN
*/
range(){

}
/* 
    CREATE A NODE IN THE BST AT THE RIGHT PLACE
*/
insert(value){

}
/* 
    RETURNS TRUE IF THE VALUE EXISTS WITHIN THE BST
*/
contains(value){

}

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// WED
// 
/* 
    TAKES IN A SORTED ARR AND CREATES A BST WITH NUMBERS
    FROM ARRAY
*/
sortedArrtoBST(arr){

}

/* 
    RETURNS THE HEIGHT OF THE BST
*/
height(){

}

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// THUR
/* 
    CHECK IF THE BST IS CURRENTLY BALANCED
    REQUIREMENTS FOR BEING BALANCED:
    1. DIFFERENCE OF HEIGHT IN LEFT AND RIGHT NODE MUST 1 OR LESS
    2. ALL NODES WITHIN BST MUSBT BE BALANCED, NOT JUST THE ROOT
*/
isBalanced(node){

}

/* 
    DELETE THE NODE CONTAING VALUE GIVEN, IF VALUE DOESN'T EXIST WITHIN TREE RETURN FALSE
*/
delete(value){

}

recDelete(node, value){
    // CASE 1: Deleting a node with ONE or NO child node(NOT RECURRSIVE)

    // CASE 2: Deleting a node with TWO child nodes(RECURSIVE)
}

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// FRI

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//