package concurrent.version3;

/**
 * Created by Administrator on 2018/5/21.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run of Runnable");
            }
        }).start();

        // Thread 匿名子类(匿名内部类)
        new Thread() {
            public void run() {
                System.out.println("Run of Thread");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run of Runnable");
            }
        }) {
            public void run() {
                System.out.println("Run of Thread");
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run of Runnable");
            }
        }) {
            // 匿名Tread类 override Thread类的 run方法
            public void run() {
                System.out.println("Run of Thread");
                //调用Thread类的原run方法, 看Thread类源码中的run方法就知道了
                super.run();
            }
        }.start();

    }
}
