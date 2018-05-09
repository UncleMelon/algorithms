package concurrent.version3;

import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2018/3/23.
 */
public class Producer implements Runnable{
    private List<PCData> queue;
    private int length;

    public Producer(List<PCData> queue, int length) {
        this.queue = queue;
        this.length = length;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (Thread.currentThread().isInterrupted())
                    break;
                Random r = new Random();
                long temp = r.nextInt(100);
                System.out.println(Thread.currentThread().getId() + "生产了:" + temp);
                PCData data = new PCData();
                data.set(temp);
                synchronized (queue) {
                    while (queue.size() >= length) {
                        queue.wait();
                    }
                    queue.add(data);
                    queue.notifyAll();
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
