package basic;

/**
 * Created by Administrator on 2018/5/21.
 */
public class Body implements Cloneable {
    public Head head;

    public Body(Head head) {
        this.head = head;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        Body newBody = (Body) super.clone();
        newBody.head = (Head) head.clone();
        return newBody;
    }
}
