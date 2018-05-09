package datastructure.binarytree;

/**
 * Created by Administrator on 2018/1/2.
 */
public class TreeApp {
    public static void main(String[] args) {
        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);
        theTree.displayTree();
        theTree.insert(56, 1.5);
        theTree.displayTree();
        theTree.delete(37);
        theTree.displayTree();
    }
}
