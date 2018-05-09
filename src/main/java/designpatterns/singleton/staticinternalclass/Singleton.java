package designpatterns.singleton.staticinternalclass;

/**
 * Created by Administrator on 2017/12/1.
 * 静态内部类
 */
public class Singleton {
    private Singleton() {
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
