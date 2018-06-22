package concurrent.thread;

/**
 * 同样一个线程对象用来起两个线程
 */
public class TestThread2 {
    public static void main(String[] args) {
        Runner2 r2 = new Runner2();
        Thread t1 = new Thread(r2);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

}

class Runner2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("No. " + i);
        }
    }
}