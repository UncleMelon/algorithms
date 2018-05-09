package algorithms.recursion;

/**
 * Created by Administrator on 2017/9/5.
 */
public class StackTriangleApp {
    static int theNumber;
    static int theAnswer;
    static StackX theStack;

    public static void main(String[] args) {
        theNumber = 5;
        stackTriangle();
    }

    public static void stackTriangle() {
        theStack = new StackX(10000);       // make a stack

        theAnswer = 0;                      // initialize answer

        while (theNumber > 0) {             // until n is 1,
            theStack.push(theNumber);       // push value
            --theNumber;                    // decrement value
        }

        while (!theStack.isEmpty()) {       // until stack empty,
            int newN = theStack.pop();      // pop value,
            theAnswer += newN;              // add to answer
        }

        System.out.println(theAnswer);
    }
}