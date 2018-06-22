package concurrent.thread;

public class TestThread6 {
    public static void main(String[] args) {
        Runner6 r = new Runner6();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 50; i++) {
            System.out.println("MainThread: " + i);
        }
    }
}

class Runner6 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
        for (int i = 0; i < 50; i++) {
            System.out.println("SubThread: " + i);
        }
    }
}