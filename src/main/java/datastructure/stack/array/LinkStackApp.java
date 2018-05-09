package datastructure.stack.array;

/**
 * Created by Administrator on 2017/8/31.
 */
public class LinkStackApp {

    public static void main(String[] args) {
        LinkStack theStack = new LinkStack(); // make stack
        theStack.push(20);                    // push items
        theStack.push(40);

        theStack.displayStack();              // display stack

        theStack.pop();                       // pop items
        theStack.pop();

        theStack.displayStack();              // display stack
    }
}
