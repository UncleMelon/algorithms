package datastructure.sort.heap;

import datastructure.heap.Node;

/**
 * Created by Administrator on 2017/12/11.
 */
public class HeapSortApp {
    public static void main(String[] args) {
        int size = 10;
        HeapSort theHeap = new HeapSort(size);
        for (int j=0; j<size; j++) {
            int random = (int)(java.lang.Math.random()*100);
            Node newNode = new Node(random);
            theHeap.insertAt(j, newNode);
            theHeap.incrementSize();
        }

        System.out.print("Random: ");
        theHeap.displayHeap();

        for (int j = size/2 - 1; j>=0; j--) {
            theHeap.trickleDown(j);
        }

        theHeap.displayArray();
        theHeap.displayHeap();

        for (int j = size-1; j>=0; j--) {
            Node biggestNode = theHeap.remove();
            theHeap.insertAt(j, biggestNode);
        }
        System.out.print("Sorted: ");
        theHeap.displayArray();
    }
}
