package concurrent;

/**
 * Created by Administrator on 2018/5/22.
 */
public class ThreadLocalDemo {
    private static ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>();

    public static final void begin() {
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static void main(String[] args) throws InterruptedException {
        begin();
        Thread.sleep(3000);
        System.out.println("起始时间: " + TIME_THREADLOCAL.get());
        System.out.println("结束时间: " + System.currentTimeMillis());
    }
}
