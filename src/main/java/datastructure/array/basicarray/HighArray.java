package datastructure.array.basicarray;

/**
 * Created by Administrator on 2017/8/25.
 */
public class HighArray {
    private long[] a;           // ref to array a
    private int nElems;         // number of data items

    public HighArray(int max) {     // constructor
        a = new long[max];          // create the array
        nElems = 0;                 // no items yet
    }

    public boolean find(long searchKey) {           // find specified value
        int j;
        for(j = 0; j < nElems; j++) {           // for each element
            if(a[j] == searchKey) {             // found item?
                break;                          // exit loop before end
            }
        }
        if(j == nElems) {                       // gone to end?
            return false;                       // yes, can't find it
        } else {
            return true;                        // no, found it
        }
    }

    public void insert(long value) {            // put element into array
        a[nElems] = value;                      // insert it
        nElems++;                               // increment size
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {          // look for it
            if(a[j] == value) {
                break;
            }
        }
        if(j == nElems) {                       // can't find it
            return false;
        } else {                                // found it
            for (int k = j; k < nElems; k++) {  // move higher ones down
                a[k] = a[k+1];
            }
            nElems --;                          // decrement size
            return true;
        }
    }

    public void display() {                     // display array contents
        for(int j=0; j<nElems;j++){             // for each element
            System.out.print(a[j] + " ");       // display it
        }
        System.out.println("");
    }
}
