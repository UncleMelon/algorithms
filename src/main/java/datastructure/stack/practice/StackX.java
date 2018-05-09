package datastructure.stack.practice;

/**
 * Created by Matthew on 8/26/2017.
 */
public class StackX {
    private int maxSize;            // size of stack array
    private long[] stackArray;
    private int top;                // top of stack

    public StackX(int s) {          // constructor
        maxSize = s;                // set array size
        stackArray = new long[maxSize];     // create array
        top = -1;                   //no items yet
    }

    public void push(long j) {      // put item on top of stack
        stackArray[++top] = j;      // increment top, insert item
    }

    public long pop() {             // take item from top of stack
        return stackArray[top--];       // access item, decrement top
    }

    public long peek() {            // peek at top of stack
        return stackArray[top];
    }

    public boolean isEmpty() {      // true if stack is empty
        return (top == -1);
    }

    public boolean isFull() {       // true if stack is full
        return (top == maxSize-1);
    }







}
