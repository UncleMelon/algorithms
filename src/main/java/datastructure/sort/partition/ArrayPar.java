package main.java.sort.partition;

/**
 * Created by Administrator on 2017/9/6.
 */
public class ArrayPar {
    private long[] theArray;        // ref to array theArray
    private int nElems;             // number of data items

    public ArrayPar(int max) {      // constructor
        theArray = new long[max];   // create the array
        nElems = 0;                 // no items yet
    }

    public void insert(long value) {    // put element into array
        theArray[nElems] = value;       // insert it
        nElems++;                       // increment size
    }

    public int size() {                 // return number of items
        return nElems;
    }

    public void display() {             // display array contents
        System.out.print("A=");
        for(int j=0; j<nElems; j++) {   // for each element,
            System.out.print(theArray[j] + " ");    // display it
        }
        System.out.println("");
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;         // right of first elem
        int rightPtr = right + 1;       // left of pivot
        while (true) {

            while (leftPtr < right && theArray[++leftPtr] < pivot) // find bigger item
            ;

            while (rightPtr > left && theArray[--rightPtr] > pivot) // find smallar item
            ;

            if(leftPtr >= rightPtr)             // if pointers cross,
                break;
            else
                swap(leftPtr, rightPtr);
        }
        return leftPtr;                         // return partition
    }


    private void swap(int dex1, int dex2) {     // swap two elements
        long temp;
        temp = theArray[dex1];          // A into temp
        theArray[dex1] =  theArray[dex2];       // B into A
        theArray[dex2] = temp;          // temp into B
    }

}
