import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/5/9.
 */
public class Test {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();
        service.execute(runner1);
        try {
            service.shutdown();
            service.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Thread thread1 = new Thread(runner1);
//        Thread thread2 = new Thread(runner2);
//        thread1.start();
//        thread2.start();
    }
}


class Runner1 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 10) return;
            System.out.println("进入Runner1的运行状态---------- " + i);
            i++;
        }

    }
}

class Runner2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("进入Runner2的运行状态---------- " + i);
        }
    }
}