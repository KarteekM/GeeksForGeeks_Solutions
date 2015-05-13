import java.util.*;


/*
Reference:http://ideone.com/U3pGNE 
This doesnt work for all inputs.Need to be enhanced to work for all inputs
*/
public class CheckCycle {

	HashMap<Integer,LinkedList<Integer>> adj;
	HashMap<Integer,Boolean> visited;
	
	public CheckCycle(int[] nodes){
		
		 adj = new HashMap<Integer,LinkedList<Integer>>();
		 visited = new HashMap<Integer,Boolean>();
		 
		 for(int i=0;i<nodes.length;i++){
			 adj.put(nodes[i], new LinkedList<Integer>());
			 visited.put(nodes[i], false);
		 }
		
	}
	
	public void addEdge(int x,int y){		
		adj.get(x).add(y);		
	}
	
	static boolean cyclic(CheckCycle c,int n){
		
		if(c.visited.get(n)){
			return true;
		}
		
		c.visited.put(n, true);
		Integer k = null;
		
		try{
			k=c.adj.get(n).element();
		}
		catch(Exception e){
			return false;
		}
		return cyclic(c,k);
	}
	
	public static void main(String args[]){
		
		int ar[] ={10,41,62,83};
		
		CheckCycle c1 = new CheckCycle(ar);
		c1.addEdge(10, 41);
		c1.addEdge(41,62);
		c1.addEdge(62, 10);
		
		boolean b = cyclic(c1,10);
		
		if(b){
			
			System.out.println("Graph is cyclic");
		}
		
		else
		{
			System.out.println("Graph is Acyclic");
		}
	}
}
