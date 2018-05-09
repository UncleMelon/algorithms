package datastructure.binarytree;

/**
 * Created by Administrator on 2017/12/29.
 */
public class Node {
    int iData;          // data item (key)
    double dData;       // data item
    Node leftChild;     // this node's left child
    Node rightChild;    // this node's right child

    public void displayNode() {     // display ourself
        System.out.print("{");
        System.out.print(iData);
        System.out.print(": ");
        System.out.print(dData);
        System.out.print("} ");
    }
}
