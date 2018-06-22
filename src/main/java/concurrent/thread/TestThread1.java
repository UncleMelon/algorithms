package concurrent.thread;

public class TestThread1 {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Thread thread = new Thread(runner1);
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread:---------" + i);
        }
    }

}

class Runner1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println("Runner 1: " + i);
        }
    }
}