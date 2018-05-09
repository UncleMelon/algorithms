package designpatterns.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Customer {
    public static void main(String[] args) {
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 =  new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马532系列配件
        FactoryBMW523 factoryBMW523 =  new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();
    }
}
