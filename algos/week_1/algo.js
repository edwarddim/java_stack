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

// Algorithms Agenda:

// 	Review/Intro: 
// 		[ ] while loops

    // starting condition // end to the loop // something that changes // increment/decrement
    function someaction() {
        var i = 0
        while (i <= 10) {
            console.log(i);
            // increment/decrement inside while
            // VERY IMPORTANT or else infinite loop
            i++;
        }
        
    }
    someAction()

// 	[ ] OOP vs procedural programming
    // OOP Object Oriented Programming
    // classes
    //  blueprint
        // constructor
        // attributes:
            // make, model, year, doors
        // methods:
            // drive --> up the odometer, change coordinates

// 	Review:
// 		[ ] Array memory storage
// 		[ ] Drawbacks / Benefits
// 		[ ] Time complexity
	
// 	Intro to Linked Lists Data Structure
// 		[ ] Conceptual intro
// 		[ ] Drawbacks/benefits

// Part I

let a = new Node(7);
let b = new Node(3);
let c = new Node(1);
a.next = b;
b.next = c;

console.log('A:', a.val);
console.log('B:', b.val);
console.log('C:', c.val);
console.log(a.next.val);
console.log(a.next.next.val);
console.log(a.next.next.next.val);

// Part II 
// Note: Later the head variable shown here will be part of the SLL class

let head = new Node(1);
let runner_temp = head;
for (let i of [7,3,5,2]) {
    let new_node = new Node(i);
    runner_temp.next = new_node;
    runner_temp = new_node;
}
   
console.log(head.val);
console.log(head.next.val);
console.log(head.next.next.next.val);


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