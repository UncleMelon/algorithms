package concurrent.version3;

import java.util.List;

/**
 * Created by Administrator on 2018/3/23.
 */
public class Consumer implements Runnable{

    private List<PCData> queue;

    public Consumer(List<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (Thread.currentThread().isInterrupted())
                    break;
                PCData data = null;
                synchronized (queue) {
                    while (queue.size() == 0) {
                        queue.wait();
                    }
                    data = queue.remove(0);
                    queue.notifyAll();
                }
                System.out.println(Thread.currentThread().getId() + " 消费了:" + data.get() + " result: " +
                data.get() * data.get());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
