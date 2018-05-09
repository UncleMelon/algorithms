package algorithms.practice;

import datastructure.stack.array.LinkStack;

/**
 * Created by Administrator on 2018/3/8.
 * 用两个堆栈实现队列
 */
public class Queue {

    private LinkStack inStack, outStack;

    public Queue() {
        inStack = new LinkStack();
        outStack = new LinkStack();
    }

    public void insert(long j) {
        inStack.push(j);
    }

    public void remove() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        outStack.pop();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(1);
        q.insert(2);
        q.insert(10);
        q.inStack.displayStack();

        q.remove();
        q.insert(3);
        q.insert(4);
        q.inStack.displayStack();
        q.outStack.displayStack();

    }
}
