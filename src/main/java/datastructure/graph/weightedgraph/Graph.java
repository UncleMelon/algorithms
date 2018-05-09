package datastructure.graph.weightedgraph;

/**
 * Created by Administrator on 2018/1/15.
 */
public class Graph {
    private final int MAX_VERTS = 20;
    private final int INFINITY = 1000000;
    private Vertex vertexList[];        // list of vertices
    private int adjMat[][];             // adjacency matrix
    private int nVerts;                 // current number of vertices
    private int currentVert;
    private PriorityQ thePQ;
    private int nTree;                  // number of verts in tree

    public Graph() {        // constructor
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];     // adjacency matrix
        nVerts = 0;
        for (int j=0; j<MAX_VERTS; j++)     // set adjacency
            for (int k=0; k<MAX_VERTS; k++)     // matrix to 0
                adjMat[j][k] = INFINITY;
        thePQ = new PriorityQ();
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] =  new Vertex(lab);
    }

    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight;
        adjMat[end][start] = weight;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    public void mstw() {        // minimum spanning tree
        currentVert = 0;        // start at 0

        while (nTree < nVerts - 1) {    // while not all verts in tree
            vertexList[currentVert].isInTree = true;    // put cuurentVert in tree
            nTree++;

            // insert edges adjacent to currentVert into PQ
            for (int j=0; j<nVerts; j++) {  // for each vertex,
                if (j == currentVert)       // skip if it's us
                    continue;
                if (vertexList[j].isInTree) // skip if in the tree
                    continue;
                int distance = adjMat[currentVert][j];
                if (distance == INFINITY)   // skip if no edge
                    continue;
                putInPQ(j, distance);       // put it in PQ (maybe)
            }
            if (thePQ.size() == 0) {        // no vertices in PQ?
                System.out.println(" GRAPH NOT CONNECTED");
                return;
            }
            // remove edge with minimum distance, from PQ
            Edge theEdge = thePQ.removeMin();
            int sourceVert = theEdge.srcVert;
            currentVert = theEdge.destVert;

            // display edge from source to current
            System.out.print( vertexList[sourceVert].label );
            System.out.print( vertexList[currentVert].label );
            System.out.print(" ");
        }

        // mst is complete
        for (int j=0; j<nVerts; j++)        // unmark vertices
            vertexList[j].isInTree = false;
    }

    public void putInPQ(int newVert, int newDist) {
        // is there another edge with the same destination vertex?
        int queueIndex = thePQ.find(newVert);
        if (queueIndex != -1) {     // got edge's index
            Edge tempEdge = thePQ.peekN(queueIndex);        // get edge
            int oldDist = tempEdge.distance;
            if (oldDist > newDist) {        // if new edge shorter,
                thePQ.removeN(queueIndex);      // remove old edge
                Edge theEdge = new Edge(currentVert, newVert, newDist);
                thePQ.insert(theEdge);      // insert new edge
            }
            // else no action; just leave the old vertex there
        }
        else {      // no edge with same destination vertex
            Edge theEdge = new Edge(currentVert, newVert, newDist);     // so insert new one
            thePQ.insert(theEdge);
        }
    }
}
