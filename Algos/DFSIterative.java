import java.util.Stack;

/*
 *Reference
 *http://www.mathcs.emory.edu/~cheung/Courses/323/Syllabus/Graph/dfs.html
 * 
*/
class Graph1{
	
	
	
	int[][] matrix;
	int noofNodes;
	boolean[] visited;
	int rootNode =0;
	
	Graph1(int[][] mat){
		
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
	

	public void dfs(){
	
		Stack<Integer> s = new Stack<Integer>();
		s.push(rootNode);
		visited[rootNode] =true;
		
		System.out.println(rootNode);
		
		while(!s.isEmpty()){
			
			   int n = s.peek();
			   int child =getChild(n);
			   
			   if(child != -1){
				   
				   visited[child] = true;
				   System.out.println(child);
				   s.push(child);
			   }
			   
			   else{
				   s.pop();
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

public class DFSIterative {

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
		
		Graph1 g = new Graph1(conn);
		
		g.clearVisited();
		g.dfs();
		
	}
}

