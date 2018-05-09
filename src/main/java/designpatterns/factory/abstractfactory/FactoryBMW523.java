package designpatterns.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/1.
 */
//宝马523系列
public class FactoryBMW523 implements AbstactFactory {

    public Engine createEngine() {
        return new EngineB();
    }

    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
