package concurrent;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by Administrator on 2018/5/22.
 */
public class ExecutorDemo2 {
    public static void main(String[] args) {
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ExecutorService service = Executors.newCachedThreadPool(myThreadFactory);
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程自定义名称为: " + Thread.currentThread().getName());
            }
        });
    }
}

class MyThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("自定义名称: " + new Date());
        return thread;
    }
}