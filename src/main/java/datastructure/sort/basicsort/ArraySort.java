package datastructure.sort.basicsort;

/**
 * Created by Matthew on 8/26/2017.
 */
public class ArraySort {
    private long[] a;           // ref to array a
    private int nElems;         // number of data items

    public ArraySort(int max) {  // constructor
        a =  new long[max];     // create the array
        nElems = 0;             // no item yet
    }

    public void insert(long value) {    // put element into array
        a[nElems] = value;              // insert it
        nElems++;                       // increment size
    }

    public void display() {
        for(int j=0; j<nElems;j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public void bubbleSort() {
        int out, in;
        for(out = nElems-1; out > 0; out--) {                   // outer loop (backward)
//            System.out.println("===========================");
            for(in = 0; in < out; in++) {                       // inner loop (forward)
                if(a[in] > a[in+1]){                            // out of order?
                    swap(in, in+1);                             // swap them
                }
            }
//            display();
        }
    }

    public void selectionSort() {
        int out, in, min;
        for(out = 0; out < nElems-1; out ++) {      // outer loop
            min = out;                              // minimum
            for (in = out+1; in < nElems; in++) {   // inner loop
                if (a[min] > a[in])                 // if min greater,
                    min = in;                       // we have a new min
            }
            swap(out, min);                         // swap them
        }
    }

    public void insertionSort() {
        int out, in;
        for(out=1; out< nElems; out++) {        // out is dividing line
            long temp = a[out];                 // remove marked item
            in = out;                           // start shifts at out
            while(in>0 && a[in-1] > temp) {     // until one is smaller,
                a[in] = a[in-1];                // shift item right,
                in--;                           // go left one position
            }
            a[in] = temp;                       // insert marked item
        }
    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
