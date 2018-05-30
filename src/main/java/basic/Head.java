package basic;

/**
 * Created by Administrator on 2018/5/21.
 */
public class Head  implements Cloneable {
    public Face face;

    public Head() {
    }

    public Head(Face face) {
        this.face = face;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Face {

}
