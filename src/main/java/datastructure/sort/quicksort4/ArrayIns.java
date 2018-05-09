package datastructure.sort.quicksort4;

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
        if(left < right)
        {
            int partition = partitionIt(left, right);        // partition range
            recQuickSort(left, partition-1);    // sort left side
            recQuickSort(partition+1, right);   // sort right side
        }
    }

    private int partitionIt(int left, int right) {
        long pivot = theArray[right];
        int leftPtr = left - 1;
        for (int i = left; i < right; i++) {
            if (theArray[i] < pivot) {
                leftPtr = leftPtr + 1;
                swap(leftPtr, i);
            }
        }
        swap(leftPtr+1, right);               // restore pivot
        return leftPtr+1;                     // return pivot location
    }

    private void swap(int dex1, int dex2) {     // swap two elements
        long temp  = theArray[dex1];            // A into temp
        theArray[dex1] = theArray[dex2];        // B into A
        theArray[dex2] = temp;                  // temp into B
    }
}
