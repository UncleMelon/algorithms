package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by Administrator on 2018/3/26.
 */
public class SemapDemo implements Runnable{

    final Semaphore semp = new Semaphore(5);
    public void run(){
        try{
            semp.acquire();
            System.out.println(Thread.currentThread().getName() + " start at " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " stop at " + System.currentTimeMillis());
            semp.release();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        SemapDemo semapDemo = new SemapDemo();
        for(int i=0;i<20;i++){
            executorService.submit(semapDemo);
        }
        executorService.shutdown();
    }
}
