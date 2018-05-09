package designpatterns.strategy;

/**
 * Created by Administrator on 2017/12/1.
 * Java设计模式之策略模式
 *
 * "策略"提供了一种用多个行为中的一个行为来配置一个类的方法。即一个系统需要动态地在几种算法中选择一种。
 *
 * 优点
 * 1、可以动态的改变对象的行为
 * 缺点
 * 1、客户端必须知道所有的策略类，并自行决定使用哪一个策略类
 * 2、策略模式将造成产生很多策略类
 *
 *
 * 组成
 * 环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
 * 抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某ConcreteStrategy定义的算法。
 * 具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
 *
 *
 * 应用场景如下，刘备要到江东娶老婆了，走之前诸葛亮给赵云三个锦囊妙计，说是按天机拆开能解决棘手问题。
 * 场景中出现三个要素：三个妙计（具体策略类）、一个锦囊（环境类）、赵云（调用者）
 */


public interface IStrategy {
    public void operate();
}


