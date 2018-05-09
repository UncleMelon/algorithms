package datastructure.sort.heap;

import datastructure.heap.Node;

/**
 * Created by Administrator on 2017/12/8.
 */
public class HeapSort {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public HeapSort(int mx) {
        maxSize = mx;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public Node remove() {
        Node root = heapArray[0];
        heapArray[0] =  heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void trickleDown(int index) {
        int largerChild;
        Node top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild  = leftChild + 1;
            if (rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }

            if (top.getKey() >= heapArray[largerChild].getKey()) {
                break;
            }

            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    public void displayHeap() {

        // heap format
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;                        // current item
        String dots = ".................................";
        System.out.println(dots + dots);    // dotted top line

        while (currentSize > 0) {       // for each heap item
            if (column == 0) {           // first item in row?
                for (int k = 0; k < nBlanks; k++)  // preceding blanks
                    System.out.print(" ");
            }
            System.out.print(heapArray[j].getKey());        // display item

            if (++j == currentSize)         // done?
                break;

            if (++column == itemsPerRow) {     // end of row?
                nBlanks /= 2;                   // half the blanks
                itemsPerRow *= 2;               // twice the items
                column = 0;                     // start over on
                System.out.println();           // new row
            } else {                            // next item on row
                for (int k = 0; k < nBlanks * 2 - 2; k++)
                    System.out.print(" ");      // interim blanks
            }
        }
        System.out.println("\n" + dots + dots);     // dotted bottom line
    }

    public void displayArray() {
        for (int m=0; m<maxSize; m++) {
                System.out.print(heapArray[m].getKey() + " ");
        }
        System.out.println();
    }

    public void insertAt(int index, Node newNode) {
        heapArray[index] = newNode;
    }

    public void incrementSize() {
        currentSize++;
    }


}
