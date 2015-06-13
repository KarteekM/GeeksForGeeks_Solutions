public class FloydWarshall {
	
	public static final int INF = 999999;
	
	public static void print(int a[][]){
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				
				 if (a[i][j] == INF){
					 System.out.print("INF");
					 System.out.print(" ");
				 }
		               
		            else{
		            	System.out.print(a[i][j]);
		            	System.out.print(" ");
		            }
			}
			System.out.println();
		}
	}
	
	public static void algoFloyd(int a[][]){
		
		int i=0,j=0,k=0;
		
		for(k=0;k<4;k++){
			for(i=0;i<4;i++){
				for(j=0;j<4;j++){
					
					if(a[i][k] + a[k][j] < a[i][j]){
						a[i][j] = a[i][k]+a[k][j];
					}
				}
			}
		}
		System.out.println("After applying FloydWarshall");
		print(a);
		
	}
	
	public static void main(String args[]){
		
		int graph[][] = { 
				{0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
		};
		System.out.println("Before applying FloydWarshall");
		print(graph);
		algoFloyd(graph);
				
	}
	
	

}
