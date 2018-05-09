package datastructure.linkedlist.basiclinkedlist1;


/**
 * Created by Administrator on 2017/8/30.
 */
public class LinkListApp {

    public static void main(String[] args) {
        LinkList theList = new LinkList();      // make new list

        theList.insertFirst(22);          // insert four items
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);

        theList.displayList();                         // display list

        while (!theList.isEmpty()) {                   // until it's empty,
            Link aLink =  theList.deleteFirst();       // delete link
            System.out.print("Deleted");               // display it
            aLink.displayLink();
            System.out.println("");
        }

        theList.displayList();                  // display list
    }
}
