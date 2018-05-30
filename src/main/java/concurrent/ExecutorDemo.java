package concurrent;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/5/22.
 */
public class ExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            service.execute(new MyRunnable(" " + (i + 1)));
        }
        Thread.sleep(3000);
        System.out.println();
        System.out.println();

        for (int i = 0; i < 5 ; i++) {
            service.execute(new MyRunnable(" " + (i + 1)));
        }
    }
}

class MyRunnable implements Runnable {
    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " username=" + username + " begin " + System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName() + " username=" + username + " end " + System.currentTimeMillis());
    }
}
