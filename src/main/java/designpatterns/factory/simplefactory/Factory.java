package designpatterns.factory.simplefactory;

/**
 * Created by Administrator on 2017/12/1.
 */
public class Factory {
    public BMW createBMW(int type) {
        switch (type) {
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();
            default:
                break;
        }
        return null;
    }

}
