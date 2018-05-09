package datastructure.stack.linkedlist;

import datastructure.linkedlist.doubleendedlist.FirstLastList;

/**
 * Created by Administrator on 2017/8/31.
 */
public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() {            // constructor
        theList = new FirstLastList();      // make a 2-ended list
    }

    public boolean isEmpty() {      // true if queue is empty
        return theList.isEmpty();
    }

    public void insert(long j) {    // insert, rear of queue
        theList.insertLast(j);
    }

    public long remove() {      // remove, front of queue
        return theList.deleteFirst();
    }

    public void displayQueue() {
        System.out.print("Queue (front --> rear): ");
        theList.displayList();
    }


}
