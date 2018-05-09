package datastructure.linkedlist.sortedlist;

/**
 * Created by Administrator on 2017/8/30.
 */
public class Link {
    public long dData;          // data item
    public Link next;           // next link in list

    public Link(long d) {       // constructor
        dData = d;
    }

    public void displayLink() {     // display this link
        System.out.print(dData + " ");
    }
}
