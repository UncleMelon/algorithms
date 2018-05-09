package datastructure.sort.quicksort3;

/**
 * Created by Administrator on 2017/9/7.
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
        nElems++;                       // increment size
    }

    public void display() {             // displays array contents
        System.out.print("A=");
        for(int j=0; j<nElems; j++)     // for each element,
            System.out.print(theArray[j] + " ");        // display it
        System.out.println("");
    }

    public void quickSort() {
        recQuickSort(0, nElems-1);
        // insertionSort(0, nElems-1);      // the other option
    }

    private void recQuickSort(int left, int right) {
        int size = right-left+1;
        if(size < 10)                   // insertion sort if small
            insertionSort(left, right);
        else {                          // quicksort if large
            long median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }
    }


    private long medianOf3(int left, int right) {
        int center = (left+right)/2;
        if(theArray[left] > theArray[center])      // order left & center
            swap(left, center);
        if(theArray[left] > theArray[right])       // order left & right
            swap(left, right);
        if(theArray[center] > theArray[right])      // order center & right
            swap(center, right);

        swap(center, right-1);                      // put pivot on right
        return theArray[right-1];                   // return median value
    }

    private void swap(int dex1, int dex2) {         // swap two elements
        long temp = theArray[dex1];                 // A into temp
        theArray[dex1] = theArray[dex2];            // B into A
        theArray[dex2] = temp;                      // temp into B
    }


    private int partitionIt(int left, int right, long pivot) {
        int leftPtr = left;             // right of first elem
        int rightPtr = right - 1;       // left of pivot
        while (true) {
            while (theArray[++leftPtr] < pivot )        // find bigger
            ;
            while (theArray[--rightPtr] > pivot)        // find smaller
            ;
            if(leftPtr >= rightPtr)                     // if pointers cross,
                break;                                  // partition done
            else                                        // not crossed, so
                swap(leftPtr, rightPtr);                 // swap elements
        }
        swap(leftPtr, right-1);                         // restore pivot
        return  leftPtr;                                // return pivot location
    }

    public void insertionSort(int left, int right) {
        int in, out;

        for(out=left+1; out<=right; out++) {     // sorted on left of out
            long temp = theArray[out];          // remove marked item
            in = out;                           // start shifts at out

            while (in > left && theArray[in-1] >= temp) {
                theArray[in] = theArray[in-1];          // shift item to right
                --in;                                   // go left one position
            }

            theArray[in] = temp;                        // insert marked item
        }
    }
}
