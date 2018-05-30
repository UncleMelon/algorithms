package concurrent;

/**
 * Created by Administrator on 2018/5/21.
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        SecondThread secondThread = new SecondThread();
        SecondThread secondThread2 = new SecondThread();
        Thread t1 = new Thread(secondThread);
        Thread t2 = new Thread(secondThread, "Higgin");
        t1.start();
        t2.start();

        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "====" + i);
        }

    }

}

class SecondThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "=====" + i);
        }
    }
}
