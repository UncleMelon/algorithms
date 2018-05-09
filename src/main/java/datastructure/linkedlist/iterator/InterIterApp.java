package datastructure.linkedlist.iterator;

/**
 * Created by Administrator on 2017/9/1.
 */
public class InterIterApp {

    public static void main(String[] args) {
        LinkList theList = new LinkList();      // new list
        ListIterator iter1 = theList.getIterator();     // new iter
        long value;

        iter1.insertAfter(20);          // insert items
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);

        theList.displayList();

        iter1.reset();
        while (!iter1.atEnd()) {        // until end,
            iter1.nextLink();           // go to next link,
            value = iter1.getCurrent().dData;      // display it
            System.out.println(value + " ");
        }
    }
}
