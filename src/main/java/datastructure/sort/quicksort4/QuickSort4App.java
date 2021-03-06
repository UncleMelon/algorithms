package datastructure.sort.quicksort4;

/**
 * Created by Administrator on 2017/9/6.
 */
public class QuickSort4App {

    public static void main(String[] args) {
        int maxSize = 16;       // array size
        ArrayIns arr;
        arr = new ArrayIns(maxSize);    // create array

        for(int j=0; j<maxSize; j++) {      // fill array with random numbers
            long n = (int) (Math.random() * 99);
            arr.insert(n);
        }

        arr.display();          // display items
        arr.quickSort();        // quicksort them
        arr.display();          // display them again
    }
}
