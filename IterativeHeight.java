import java.util.LinkedList;
import java.util.Queue;


public class IterativeHeight {

	
	public static int height(Node node){
		
		if(null == node)
			return 0;
		
		int nodeCount=0;
		int height=0;
		Queue<Node> q = new LinkedList<Node>();
		q.add(node);
		
		while(true){
			
			
			nodeCount = q.size();			
			if(nodeCount == 0 || q.contains(null))
			return height;
			
			height++;
			
			while(nodeCount >0){
				Node temp = q.peek();
				q.remove();
				
					
					if(temp.left != null)
						q.add(temp.left);
					
					if(temp.right != null);
					q.add(temp.right);
					
					nodeCount--;	
			
						
			}  
			
		}
	}
	
	
	public static void main (String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.right.left= new Node(7);
		
		System.out.println("Height iteratively is "+height(root));
	}
	
}
