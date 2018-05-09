package concurrent.version1;

import concurrent.Message;

import java.beans.ParameterDescriptor;
import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Administrator on 2018/3/23.
 */
public class Consumer implements Runnable {
    private volatile boolean isRunning = true;
    private BlockingQueue<PCData> queue;
    private static final int SLEEPTIME = 1000;

    public Consumer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    public void run() {
        System.out.println("start consumter id :" + Thread.currentThread().getId());
        Random r = new Random();
        try{
            while (isRunning) {
                PCData data =  queue.take();
                if (data != null) {
                    int re = data.getData() * data.getData();
                    System.out.println(MessageFormat.format("{0}*{1}={2}", data.getData(), data.getData(), re));
                    Thread.sleep(r.nextInt(SLEEPTIME));
                }
            }
            System.out.println("stop consumer id:" + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public void stop() {
        isRunning = false;
    }
}
