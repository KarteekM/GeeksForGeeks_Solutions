/*
 *Reference
 *http://www.mathcs.emory.edu/~cheung/Courses/323/Syllabus/Graph/dfs.html
 * 
*/


class Graph{
	
	int[][] matrix;
	int noofNodes;
	boolean[] visited;
	
	Graph(int[][] mat){
		
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
	
	public void dfs(int n){
		
		int j;
		visited[n] =true;
		
		System.out.println("Node visited is "+n);
		
		for(j=0;j<noofNodes;j++){
			
			if(matrix[n][j]>0 && visited[j] != true){
				dfs(j);
			}
		}
		
	}
	
	public void clearVisited(){
		
		int i=0;
		for(i=0;i<visited.length;i++){
			visited[i]=false;
		}
	}
	
}

public class DFS {

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
		
		Graph g = new Graph(conn);
		
		g.clearVisited();
		g.dfs(0);
		
	}
}

