package datastructure.graph.mst;

/**
 * Created by Administrator on 2018/1/10.
 */
public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];        // list of vertices
    private int adjMat[][];             // adjacency matrix
    private int nVerts;                 // current number of vertices
    private StackX theStack;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];     // adjacenncy matrix
        nVerts = 0;
        for (int j=0; j<MAX_VERTS; j++)             // set adjacency
            for (int k=0; k<MAX_VERTS; k++)         // matrix to 0
                adjMat[j][k] = 0;
        theStack = new StackX();
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    // returns an unvisited vertex adj to v
    public int getAdjUnvisitedVertex(int v) {
        for (int j=0; j<nVerts; j++)
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
                return j;
        return -1;
    }

    public void mst() {     // minimum spanning tree (depth first)  start at 0
        vertexList[0].wasVisited = true;        // mark it
        theStack.push(0);                       // push it

        while (!theStack.isEmpty()) {           // until stack empty
            int currentVertex = theStack.peek();
            // get next unvisited neighbor
            int v = getAdjUnvisitedVertex(currentVertex);
            if (v == -1)            // if no more neighbors
                theStack.pop();     // pop it away
            else {                    //  got a neighbor
                vertexList[v].wasVisited = true;    // mark it
                theStack.push(v);                   // push it
                // display edge
                displayVertex(currentVertex);       // from currentV
                displayVertex(v);                   // to v
                System.out.print(" ");
            }
        }

        // stack is empty, so we're done
        for (int j=0; j<nVerts; j++)            // reset flags
            vertexList[j].wasVisited = false;
    }
}
