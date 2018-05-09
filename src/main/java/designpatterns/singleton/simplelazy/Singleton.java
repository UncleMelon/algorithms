package designpatterns.singleton.simplelazy;

/**
 * Created by Administrator on 2017/12/1.
 *
 * 懒汉式单例
 *
 * 单例模式主要有3个特点，
 * 1. 类的内部包括一个类的实力，并且为static类型
 * 2. 构造函数为私有
 * 3. 通过提供一个获取实例的方法，比如getInstance，该方法也为static类型。
 * 调用的时候，我们可以通过Singleton instance = Singleton.getInstance();来得到其实例化
 *
 * 你也许会问，为什么要用单例模式呢？这是因为， 很多时候，我们只需要一个对象就可以了，
 * 不希望用户来构造对象，比如线程池，驱动，显示器等。如果把构造函数私有，那么很多程序都可以得到其实例，将会带来混乱。
 */
public class Singleton {

    /**
     * 由于private的缘故，被private修饰的构造函数无法在其他类中调用，也就是该类无法在其他类中实例化。
     *
     * 私有构造函数的第二个用途，就是防止实例化。你又要问了，一个类，不能实例化，还要它有啥用？！
     * 哈哈，那是你忘了static关键词了，static的意思是静态，什么是静态呢，
     * 如果一个变量或方法设置为static，那么它就不依赖其所在的对象
     *
     * 我们有一个工具类Utils，里面含有很多静态函数或者静态变量，由于静态的原因，我们完全可以通过类名来访问，
     * 这样，我们就没有必要实例化它们，所以我们可以将其构造函数设置为私有，这样就防止用户滥用。
     * 在Java的工具类中，有很多就是利用这种方法。
     */
    private Singleton() {
    }

    private static Singleton single = null;

    //静态工厂方法
    public static Singleton getInstance() {
        if(single == null) {
            single = new Singleton();
        }
        return single;
    }

}
