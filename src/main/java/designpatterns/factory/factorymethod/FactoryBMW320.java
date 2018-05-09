package designpatterns.factory.factorymethod;

/**
 * Created by Administrator on 2017/12/1.
 */
public class FactoryBMW320 implements FactoryBMW {

    public BMW320 createBMW() {
        return new BMW320();
    }
}
