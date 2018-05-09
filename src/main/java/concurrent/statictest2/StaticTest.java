package concurrent.statictest2;

/**
 * Created by Administrator on 2018/4/4.
 */
public class StaticTest {
    private int s = 0;
    public synchronized int sum(int n) {
//       int s = 0;
        for (int i = 0; i <=n; i++ ) {
            s += i;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return s;


    }

}
