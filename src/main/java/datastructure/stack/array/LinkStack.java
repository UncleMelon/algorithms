package datastructure.stack.array;


/**
 * Created by Administrator on 2017/8/31.
 */
public class LinkStack {
    private LinkList theList;


    public LinkStack() {        // constructor
        theList = new LinkList();
    }

    public void push(long j) {  // put item on top of stack
        theList.insertFirst(j);
    }

    public long pop() {         // take item from top of stack
        return theList.deleteFirst();
    }

    public boolean isEmpty() {      // true if stack is empty
        return (theList.isEmpty());
    }

    public void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}
