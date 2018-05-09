package designpatterns.strategy;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Context {
    private IStrategy stragegy;

    // 构造函数，要你使用哪个妙计
    public Context(IStrategy stragegy) {
        this.stragegy = stragegy;
    }

    public void setStragegy(IStrategy stragegy) {
        this.stragegy = stragegy;
    }

    public void operate() {
        this.stragegy.operate();
    }
}
