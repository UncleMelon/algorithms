package datastructure.linkedlist.sortedlist;

/**
 * Created by Administrator on 2017/8/31.
 */
public class SortedListApp {

    public static void main(String[] args) {
        SortedList theSortedList = new SortedList();    // create new list
        theSortedList.insert(20);           // insert 2 items
        theSortedList.insert(40);

        theSortedList.displayList();        // display list

        theSortedList.insert(10);           // insert 3 more items
        theSortedList.insert(30);
        theSortedList.insert(50);

        theSortedList.displayList();        // display list

        theSortedList.remove();             // remove an item

        theSortedList.displayList();        // display it
    }
}
