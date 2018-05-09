package datastructure.graph.dfs;

/**
 * Created by Administrator on 2018/1/9.
 */
public class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char lab) {     // constructor
        label = lab;
        wasVisited = false;
    }
}
