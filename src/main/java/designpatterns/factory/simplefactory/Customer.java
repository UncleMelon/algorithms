package designpatterns.factory.simplefactory;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Customer {

    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
