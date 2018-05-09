package datastructure.graph.bfs;

/**
 * Created by Administrator on 2018/1/10.
 */
public class Vertex {
    public char label;          // label
    public boolean wasVisited;

    public Vertex(char lab) {   // constructor
        label = lab;
        wasVisited = false;
    }
}
