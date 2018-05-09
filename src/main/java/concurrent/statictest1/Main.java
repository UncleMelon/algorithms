package concurrent.statictest1;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Main {

    public static void main(String[] args) {
        ThreadCount t1 = new ThreadCount();
        new Thread(t1).start();

        ThreadCount t2 = new ThreadCount();
        new Thread(t2).start();

        ThreadCount t3 = new ThreadCount();
        new Thread(t3).start();

    }
}
