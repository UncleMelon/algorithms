package designpatterns.strategy;

/**
 * 孙夫人断后，挡住追兵
 */
public class BlackEnemy implements IStrategy {

    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
