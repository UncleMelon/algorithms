package concurrent.statictest2;



/**
 * Created by Administrator on 2018/4/4.
 */
public class ThreadCount implements Runnable {
    StaticTest staticTest;

    public ThreadCount(StaticTest staticTest) {
        this.staticTest = staticTest;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ":" + staticTest.sum(100));

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
