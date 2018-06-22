package concurrent.thread;

public class TestJoin {
    public static void main(String[] args) {
        Mythread2 mythread2 = new Mythread2("abcde");
        mythread2.start();
        try {
            mythread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i am " + Thread.currentThread().getName());
        }
    }

}

class Mythread2 extends Thread {
    public Mythread2(String s) {
        super(s);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("i am "+ currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
