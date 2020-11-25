// MIN HEAP
/*
    PARENT LOCAITON = Math.floor(i / 2)
    LEFT CHILD = i * 2
    RIGHT CHILD = (i * 2) + 1
*/
class MinHeap{
    constructor(){
        this.heap = [];
    }



    printHorizontalTree(parentIdx = 1, spaceCnt = 0, spaceIncr = 10) {
        if (parentIdx > this.heap.length - 1) {
          return;
        }
    
        spaceCnt += spaceIncr;
        this.printHorizontalTree(parentIdx * 2 + 1, spaceCnt);
    
        console.log(
          " ".repeat(spaceCnt < spaceIncr ? 0 : spaceCnt - spaceIncr) +
            `${this.heap[parentIdx]} (${parentIdx})`
        );
    
        this.printHorizontalTree(parentIdx * 2, spaceCnt);
    }
    printArr(...appendedMsgs) {
        const arrStr = `\n[${["null", ...this.heap.slice(1)].join(", ")}]`;
        const msgLen = arrStr.length + appendedMsgs.toString().length;
        console.log("-".repeat(msgLen), arrStr, ...appendedMsgs);
    }
}

// MON


// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// TUE
/*
    Inserting a new value in to the heap requires you to push
    the value to the back of the array and then shiftUp, the value
    to the correct index
*/
insert(value){

    this.shiftUp()
}

shiftUp(){
    
}

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// WED
/*
    Extracting a value from a heap takes our "ROOT" and returns that value
    But since this is a min heap, we need to rearrange our heap by taking the max
    to the "ROOt" and then shiftDown
    1. Save the "ROOT" number so that we can return it
    2. Pop number in arr and replace "ROOT" number with it
    3. trigger shiftDown() to make a min heap again
*/
extract(){

}
shiftDown(){

}

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// THUR
heapify(arr, length, i){
    // 1. CHECK TO SEE IF CHILDREN NODE OF i IS SMALLER
    // AND SWAP WITH SMALLER CHILD

    // 2. RECURSIVELY CALL ON THE SMALLER CHILD

    // 3. RETURN IF NO NODES WERE SWAPPED

}

heapSort(arr){
    // HEAPIFIES THE ARR
    // 1. FIND THE MIDDLE POINT OF OUR DATA
    // 2. HEAPIFY FROM THAT DATAPOINT TO INDEX 1

    // 2. SORT THE ARRAY W/ HEAPIFTY
}

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//

// FRI

// -----------------------------------------------------------------------------------------------//
// -----------------------------------------------------------------------------------------------//