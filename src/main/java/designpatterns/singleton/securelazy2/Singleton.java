package designpatterns.singleton.securelazy2;

/**
 * Created by Administrator on 2017/12/1.
 * 双重检查锁定
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
