// MON

/* 
Intro to Singly Linked Lists
 - OOP
 - Array VS SLL

*/

var arr = ['a','b','c','d','e']


// var a = new SLNode(6)
// var b = new SLNode(2)
// var c = new SLNode(1)

// console.log(a.value) // 6
// console.log(a.next) // null

// a.next = b
// b.next = c

// var head = a

// console.log(head)

// var runner = head
// while(runner.next != null){
//   runner = runner.next
// }


class SLNode {
  constructor(value) {
      this.value = value
      this.next = null
  }
}

class SLL{
  constructor(){
    this.head = null;
    return
  }
  printValues(){
    // 1. SLL IS EMPTY
    if(this.head === null){
      console.log("LIST IS EMPTY")
    }
    // 2. SLL IS NOT EMPTY
    var runner = this.head
    while(runner.next != null){
      console.log(runner.value)
      runner = runner.next
    }
    console.log(runner.value)
  }

  insertAtBack(data){

  }
  seedFromArr(vals) {

  }
}

var newList = new SLL()
newList.printValues()


