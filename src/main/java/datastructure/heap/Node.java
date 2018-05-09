package datastructure.heap;

/**
 * Created by Administrator on 2017/12/7.
 */
public class Node {
    private int iData;          // data item(key)

    public Node(int key) {      // constructor
        iData = key;
    }

    public int getKey() {
        return iData;
    }

    public void setKey(int id) {
        iData = id;
    }
}
