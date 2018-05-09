package datastructure.linkedlist.iterator;

/**
 * Created by Administrator on 2017/9/1.
 */
public class Link {
    public long dData;     // data item
    public Link next;      // next link in list

    public Link(long dd) {         // constructor
        dData = dd;
    }

    public void displayLink() {     // display ourself
        System.out.print(dData + " ");
    }
}
