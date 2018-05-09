package concurrent.version1;


import java.util.concurrent.*;

/**
 * Created by Administrator on 2018/3/23.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<PCData> queue = new LinkedBlockingDeque<>(10);
        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Producer p3 = new Producer(queue);
        Consumer c1 = new Consumer(queue);
        Consumer c2 = new Consumer(queue);
        Consumer c3 = new Consumer(queue);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(p1);
        service.execute(p2);
        service.execute(p3);
        service.execute(c1);
        service.execute(c2);
        service.execute(c3);
        Thread.sleep(10*1000);
        p1.stop();
        p2.stop();
        p3.stop();
        Thread.sleep(3000); // 这里sleep的时间如果过长， consumer程序会进入堵塞状态， 从而不会执行后面的stop程序
        c1.stop();
        c2.stop();
        c3.stop();
        service.shutdownNow();

        boolean statu= service.awaitTermination(1, TimeUnit.SECONDS);
        while(!statu){
            Thread.sleep(1000);
            System.out.println("-----其实这里输出ExecutorService 并非 shutdow状态,而是Terminated状态-,子线程未结束---------");
        }
        System.out.println("--------------所有任务已经完成----------------");
    }
}
