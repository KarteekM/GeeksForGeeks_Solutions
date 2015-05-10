import java.util.LinkedList;
import java.util.Stack;

/*
 *Reference
 *http://www.mathcs.emory.edu/~cheung/Courses/323/Syllabus/Graph/bfs.html
 * 
*/
class Graph2{
	
	int[][] matrix;
	int noofNodes;
	
	boolean[] visited;
	int rootNode =0;
	
	Graph2(int[][] mat){
		
		noofNodes = mat.length;
		this.matrix =new int[noofNodes][noofNodes];
		visited = new boolean[noofNodes];
		
		int i=0,j=0;
		
		for(i=0;i<noofNodes;i++){
			for(j=0;j<noofNodes;j++){
				this.matrix[i][j] =mat[i][j];
			}
		}
	}
	



	public void bfs(){
	
	Queue<Integer> q = new Queue<Integer>();
	
	visited[rootNode]=true;
	q.enqueue(rootNode);
	System.out.println("BFS node is " +rootNode);
	while(q.size() != 0){
		
		int j;
		j = q.front();
		int child = getChild(j);
    
		if(child != -1){
			visited[child] = true;
			q.enqueue(child);
			System.out.println("BFS node is "+child);
		}
		
		else{
			q.dequeue();
		}
			
		
	}
		
	}
	
	public int getChild( int n){
		
		int j=0;
		
		for(j=0;j<noofNodes;j++){
			
			if(matrix[n][j]>0 && visited[j] == false)
				return j;
		}
		
		return -1;
	}
	
	public void clearVisited(){
		
		int i=0;
		for(i=0;i<visited.length;i++){
			visited[i]=false;
		}
	}
	
}

public class BFSIterative {

	public static void main(String args[]){
		
		int[][] conn = {  { 0, 1, 0, 1, 0, 0, 0, 0, 1 },  // 0
				{ 1, 0, 0, 0, 0, 0, 0, 1, 0 },  // 1
				{ 0, 0, 0, 1, 0, 1, 0, 1, 0 },  // 2
				{ 1, 0, 1, 0, 1, 0, 0, 0, 0 },  // 3
				{ 0, 0, 0, 1, 0, 0, 0, 0, 1 },  // 4
				{ 0, 0, 1, 0, 0, 0, 1, 0, 0 },  // 5
				{ 0, 0, 0, 0, 0, 1, 0, 0, 0 },  // 6
				{ 0, 1, 1, 0, 0, 0, 0, 0, 0 },  // 7
				{ 1, 0, 0, 0, 1, 0, 0, 0, 0 } };// 8
		
		Graph2 g = new Graph2(conn);
		
		g.clearVisited();
		g.bfs();
		
	}
}
class Queue<E> {
	
	 private LinkedList<E> list = new LinkedList<E>();

	 
	  public void enqueue(E item) {
	    list.addLast(item);
	    
	  }

	  public E dequeue() {
	    return list.poll();
	  }

	  public boolean hasItems() {
	    return !list.isEmpty();
	  }

	  public E front(){
		  return list.peek();
	  }
	  
	  public int size() {
	    return list.size();
	  }

	  public void addItems(Queue<? extends E> q) {
	    while (q.hasItems())
	      list.addLast(q.dequeue());
	  }
	 }
