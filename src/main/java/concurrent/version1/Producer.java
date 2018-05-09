package concurrent.version1;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2018/3/23.
 */
public class Producer implements Runnable {
    private volatile boolean isRunning = true;
    private BlockingQueue<PCData> queue;        //内存缓冲区
    private static AtomicInteger count = new AtomicInteger();   // 总数 原子操作
    private static final int SLEEPTIME = 1000;

    public Producer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    public void run() {
        PCData data = null;
        Random r = new Random();
        System.out.println("start producting id:" + Thread.currentThread().getId());
        try {
            while (isRunning) {
                Thread.sleep(r.nextInt(SLEEPTIME));
                data = new PCData(count.incrementAndGet());
                System.out.println(data + " 加入队列 " + Thread.currentThread().getId());
                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {      // 2秒钟如果还不能往队列中加入BlockingQueue， 返回false
                    System.err.println(data + " 加入队列失败");
                }
            }
            System.out.println("stop producting id:" + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

    }

    public void stop() {
        isRunning = false;
    }

}
