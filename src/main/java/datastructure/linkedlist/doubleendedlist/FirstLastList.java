package datastructure.linkedlist.doubleendedlist;

/**
 * Created by Administrator on 2017/8/30.
 */
public class FirstLastList {
    private Link first;         // ref to first link
    private Link last;          // ref to last link

    public FirstLastList() {    // constructor
        first = null;           // no links on list yet
        last = null;
    }

    public boolean isEmpty() {  // true if no links
        return (first == null);
    }

    public void insertFirst(long dd) {      // insert at front of list
        Link newLink = new Link(dd);      // make new link

        if(isEmpty())                      // if empty list,
            last = newLink;                 // newLink <-- last
        newLink.next = first;               // newLink --> old first
        first = newLink;                    // first --> newLink
    }

    public void insertLast(long dd) {       // insert at end of list
        Link newLink = new Link(dd);      // make new link
        if(isEmpty())                       // first --> newLink
            first = newLink;
        else
            last.next = newLink;            // newLink <-- last
        last = newLink;
    }

    public long deleteFirst() {             // delete first link
        long temp = first.dData;            // (assumes non-empty list)
        if(first.next == null)              // if only one item
            last = null;                    // null <-- last
        first = first.next;                 // first --> old next
        return temp;
    }


    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;       // start at beginning of list
        while(current != null) {    // until end of list,
            current.displayLink();  // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
}
