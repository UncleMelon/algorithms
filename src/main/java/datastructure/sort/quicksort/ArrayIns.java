package datastructure.sort.quicksort;

/**
 * Created by Administrator on 2017/9/6.
 */
public class ArrayIns {
    private long[] theArray;        // ref to array theArray
    private int nElems;             // number of data items

    public ArrayIns(int max) {      // constructor
        theArray = new long[max];   // create the array
        nElems = 0;                 // no items yet
    }

    public void insert(long value) {    // put element into array
        theArray[nElems] = value;       // insert it
        nElems++;
    }

    public void display() {         // displays array contents
        System.out.print("A=");
        for (int j=0; j<nElems; j++)    // for each element,
            System.out.print(theArray[j] + " ");    // display it
        System.out.println("");
    }

    public void quickSort() {
        recQuickSort(0, nElems-1);
    }

    private void recQuickSort(int left, int right) {
        if(right - left <= 0)       // if size <= 1,
            return;                 // already sorted
        else {                      // size is 2 or larger
            long pivot = theArray[right];   // rightmost item
            int partition = partitionIt(left, right, pivot);        // partition range
            recQuickSort(left, partition-1);    // sort left side
            recQuickSort(partition+1, right);   // sort right side
        }
    }

    private int partitionIt(int left, int right, long pivot) {
        int leftPtr = left-1;       // left (after ++)
        int rightPtr = right;       // right-1 (after --)
        while (true) {
            while (theArray[++leftPtr] < pivot);        // find bigger item

            while (rightPtr > 0 && theArray[--rightPtr] > pivot);       // find smaller item

            if(leftPtr >= rightPtr)         // if pointers cross,
                break;                      // partition done
            else                            // not croessed, so
                swap(leftPtr, rightPtr);    // swap elements
        }
        swap(leftPtr, right);               // restore pivot
        return leftPtr;                     // return pivot location
    }

    private void swap(int dex1, int dex2) {     // swap two elements
        long temp  = theArray[dex1];            // A into temp
        theArray[dex1] = theArray[dex2];        // B into A
        theArray[dex2] = temp;                  // temp into B
    }
}
