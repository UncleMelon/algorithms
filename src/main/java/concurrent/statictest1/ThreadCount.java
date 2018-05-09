package concurrent.statictest1;

/**
 * Created by Administrator on 2018/4/4.
 */
public class ThreadCount implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ":" + StaticTest.sum(100));

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
