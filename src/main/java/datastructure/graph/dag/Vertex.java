package datastructure.graph.dag;

/**
 * Created by Administrator on 2018/1/16.
 */
public class Vertex {
    public char label;          // label
    public boolean isInTree;

    public Vertex(char lab) {   // constructor
        label = lab;
        isInTree = false;
    }
}
