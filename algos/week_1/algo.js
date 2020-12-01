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
    insertAtFront(value){
        // CHECK TO SEE IF LIST IS EMPTY
        // IF EMPTY, CREATE NODE AND SET HEAD TO NEW NODE
        if(this.head == null){
            var newNode = new SLNode(value)
            this.head = newNode
        }
        // IF LIST IS NOT EMPTY
        else{
            // CREATE THE NEW NODE
            var newNode = new SLNode(value)
            // POINT NEW NODE'S .NEXT TO THE HEAD
            newNode.next = this.head
            // CHANGE THE HEAD POINTER TO NEW NODE
            this.head = newNode
        }
    }
    removeAtFront(){
        // MOVE HEAD POINTER TO SECOND NODE
        if(this.head == null){
            console.log("LIST IS EMPTY")
        }
        // LIST IS NOT EMPTY
        else{
            var value = this.head.value
            this.head = this.head.next
            return value
        }
    }
    printValues(){
        var runner = this.head
        while(runner.next != null){
            console.log(runner.value)
            runner = runner.next
        }
        console.log(runner.value)
    }
    contains(value){
        if(this.head == null){
            return false
        }
        var runner = this.head
        while(runner.next != null){
            if(runner.value == value){
                return true
            }
            runner = runner.next
        }
        if(runner.value == value){
            return true
        }
        else{
            return false
        }
    }
    pop(){
        if(this.head == null){
            return false
        }
        var runner = this.head
        while(runner.next.next != null){
            runner = runner.next
        }
        runner.next = null
    }
    remove(value){
        if(this.head == null){
            return false
        }
        // THE VALUE TO REMOVE IS THE BEGINNING OF THE LIST
        if(this.head.value == value){
            this.removeAtFront()
            return true
        }
        // THE VALUE TO REMOIVE IS IN THE MIDDLE OF THE LIST
        // THE VALUE TO REMOIVE IS IN THE END OF THE LIST
        var runner = this.head
        while(runner.next != null){
            if(runner.next.value == value){
                runner.next = runner.next.next
                return true
            }
            runner = runner.next
        }
        return false
    }
}
var list = new SLL()
list.insertAtFront(1)
list.insertAtFront(2)
list.insertAtFront(3)
list.printValues()
list.removeAtFront()
list.printValues()

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
// partition(5)
// INPUT: 3->5->8->5->10->2->1
// OUTPUT: 3->1->2 -> 10->5->5->8
// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// FRI

// reverseNew()
// reverese()
// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//