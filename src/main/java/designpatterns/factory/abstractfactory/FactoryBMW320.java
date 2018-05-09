package designpatterns.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/1.
 */
//为宝马320系列生产配件
public class FactoryBMW320 implements AbstactFactory{

    public Engine createEngine() {
        return new EngineA();
    }

    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
