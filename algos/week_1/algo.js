// MON
class SLNode{
    constructor(value){
        this.value = value
        this.next = null
    }
}
class SLL{
    constructor(){
        this.head = null
    }
    
}


// WED

// contains(value)
// GIVEN THE VALUE RETURN TRUE OR FALSE ON WHETHER THE VALUE EXISTS
// ITERATE THROUGH THE LIST AND CHECK EACH NODE FOR THE VALUE GIVEN
// pop()
// REMOVE THE LAST NODE WITHIN THE SLL
// remove(value)
// IF THE GIVEN VALUE EXISTS WITHIN THE LIST, REMOVE SAID NODE FROM SLL
// REMOVE THE FIRST OCCURANCE OF THE VALUE, THE NODE CAN BE IN THE BEGINNING, MIDDLE, OR END
// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// THUR

// partition(num)
// PARTITION A LINKED LIST AROUND A VALUE X, SUCH THAT ALL NODE LESS THAN X
// COME BEFORE ALL NODES GREATER THAN OR EQUAL TO X
// 1. CREATE A NEW SLL WITH THE REARRANGED VALUES
// 2. REARRANGE THE CURRENT SLL (HINT: YOU CAN SPLIT THE SLL IN TWO, THEN COMBINE THEM BACK AGAIN)
// partition(5)
// INPUT: 3->5->8->5->10->2->1
// OUTPUT: 3->1->2 -> 10->5->5->8
// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// FRI

// reverseNew()
// reverese()
// 1. CREATE A NEW SLL THEN SET THAT AS THE LIST
// ITERATE THROUGH THE CURRENT LIST, ADD THE VALUES TO AN ARRAY
// LOOP THROUGH ARRAY BACKWARDS AND CREATE A NEW LIST
// SET THE NEW LIST TO THE HEAD
// 2. REARRANGE THE CURRENT LIST WITHOUT CREATING ANY NEW NODES (HINT: 3 RUNNERS)
// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//