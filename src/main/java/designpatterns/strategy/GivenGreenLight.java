package designpatterns.strategy;

/**
 * 求吴国太开绿灯放行
 */
public class GivenGreenLight implements IStrategy {

    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
