
public class Node {


private int nodeId;
private boolean visited;

public Node(int nodeId) {
this.nodeId = nodeId;
this.visited = false;
}

public int getNodeId() {
return nodeId;
}

public boolean isVisited() {
return visited;
}

public void setVisited(boolean visited) {
this.visited = visited;
}

}
public class Edge {
Node node1, node2;
private int weight;

Edge(Node node1, Node node2, int weight) {
this.node1 = node1;
this.node2 = node2;
this.weight = weight;
}

public int getWeight() {
return weight;
}

public void setNodesVisited() {
node1.setVisited(true);
node2.setVisited(true);
}

public boolean areNodesVisited() {
return (node1.isVisited() & node2.isVisited());
}

}

import java.util.HashSet;

public class Graph {
int[][] adjMatrix;
Edge[] edges;
Node[] nodes;

Graph(int[][] adjMatrix) {
this.adjMatrix = adjMatrix;
this.setEdges();
}

public void setEdges() {
int length = (this.adjMatrix.length) * (this.adjMatrix.length – 1) / 2;
edges = new Edge[length];
length = this.adjMatrix.length;
nodes = new Node[length];
for (int i = 0; i < nodes.length; i++) {
nodes[i] = new Node(100 + i);
}
int counter = 0;
for (int i = 0; i < this.adjMatrix.length; i++) {
for (int j = 0; j < i; j++) {
edges[counter] = new Edge(nodes[i], nodes[j], adjMatrix[i][j]);
counter++;
}
}
this.sortEdges();
}

public void sortEdges() {
for (int i = 0; i < edges.length; i++) {
int minWeightEdge = edges[i].getWeight();
int index = i;
for (int j = i + 1; j < edges.length; j++) {
if (edges[j].getWeight() < minWeightEdge) {
minWeightEdge = edges[j].getWeight();
index = j;
}
}
if (index != i) {
Edge temp = edges[index];
edges[index] = edges[i];
edges[i] = temp;
}
}
}

public int computeMinimumSpanningTree() {
HashSet<Edge> mst = new HashSet<Edge>();
for (int i = 0; i < edges.length; i++) {
if (!edges[i].areNodesVisited()) {
mst.add(edges[i]);
edges[i].setNodesVisited();
}
}
Object[] newEdge = mst.toArray();
int totalCost=0;
for (int i = 0; i < newEdge.length; i++) {
totalCost+=((Edge) newEdge[i]).getWeight();
}
return totalCost;
}
}

public class Krushkals {

public static void main(String[] args) {
int[][] matrix = new int[5][];

for (int i = 0; i < matrix.length; i++) {
matrix[i] = new int[i + 1];
}

for (int i = 0; i < matrix.length; i++) {
for (int j = 0; j < i; j++) {
matrix[i][j] = (int) (Math.random() * 100);
}
}

System.out.println(“Graph is >>”);
for (int i = 0; i < matrix.length; i++) {
for (int j = 0; j < i; j++) {
System.out.print(matrix[i][j] + “,”);

System.out.println();
}
System.out.println();
Graph graph = new Graph(matrix);
System.out.println(“The Total Cost is : “ + graph.computeMinimumSpanningTree());
}

}
