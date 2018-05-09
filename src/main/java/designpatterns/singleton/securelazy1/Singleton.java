package designpatterns.singleton.securelazy1;

/**
 * Created by Administrator on 2017/12/1.
 * 在getInstance方法上加同步
 */
public class Singleton {

    private Singleton() {

    }

    private static Singleton single = null;

    public static synchronized Singleton getInstance() {
        if(single == null) {
            single = new Singleton();
        }
        return single;
    }


}
