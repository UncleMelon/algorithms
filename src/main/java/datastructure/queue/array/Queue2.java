package datastructure.queue.array;

/**
 * Created by Administrator on 2017/8/28.
 * 让数组容量比队列数据项个数的最大值还要大1
 * 解决在同一时间，队列似乎可能是满的，也可能是空的问题
 */
public class Queue2 {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public Queue2(int s) {              // constructor
        maxSize = s+1;                  // array is 1 cell larger
        queArray = new long[maxSize];   // than requested
        front = 0;
        rear = -1;
    }

    public void insert(long j) {        // put item at rear of queue
        if(rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
    }

    public long remove() {
        long temp = queArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public long peek() {
        return queArray[front];
    }

    public boolean isEmpty() {      // true if queue is empty
        return (rear + 1 == front || front + maxSize - 1 == rear);
    }


    public boolean isFull() {       // true if queue is full
        return  (rear + 2 == front || front + maxSize - 2 == rear);
    }

    public int size() {             // (assumes queue not empty)
        if (rear >= front)          // contiguous sequence
            return rear-front+1;
        else
            return (maxSize-front) + (rear+1);

    }

}
