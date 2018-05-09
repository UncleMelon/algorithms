package designpatterns.factory.abstractfactory;

/**
 * Created by Administrator on 2017/12/1.
 */
//创建工厂的接口
public interface AbstactFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
