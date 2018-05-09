package concurrent.statictest2;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Main {

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();

        ThreadCount t1 = new ThreadCount(staticTest);
        new Thread(t1).start();

        ThreadCount t2 = new ThreadCount(staticTest);
        new Thread(t2).start();

       ThreadCount t3 = new ThreadCount(staticTest);
        new Thread(t3).start();

    }
}
