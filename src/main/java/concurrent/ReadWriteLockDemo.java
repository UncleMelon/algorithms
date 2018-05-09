package concurrent;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Administrator on 2018/3/26.
 */
public class ReadWriteLockDemo {
    private static Lock relock = new ReentrantLock();
    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static Lock readLock = readWriteLock.readLock();
    private static Lock writeLock = readWriteLock.writeLock();
    private int value;
    public Object handleRead(Lock lock) throws Exception{
        try{
            lock.lock();
            Thread.sleep(1000);
            return value;
        }finally {
            lock.unlock();
        }
    }


    public void handleWrite(Lock lock,int index) throws Exception{
        try{
            lock.lock();
            Thread.sleep(1000);
            value = index;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args){
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();
        Runnable readThread = new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("read:"+demo.handleRead(readLock));
//                    System.out.println("read:"+demo.handleRead(relock));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        Runnable writeThread = new Runnable() {
            @Override
            public void run() {
                try{
//                    demo.handleWrite(relock,new Random().nextInt());
                    demo.handleWrite(writeLock,new Random().nextInt(1000));
                    System.out.println("id:"+Thread.currentThread().getId()+" done!");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        for(int i=0;i<18;i++){
            new Thread(readThread).start();
        }
        for(int i=0;i<18;i++){
            new Thread(writeThread).start();
        }
    }

}
