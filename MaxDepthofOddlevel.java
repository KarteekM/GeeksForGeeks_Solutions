
public class MaxDepthofOddlevel {
	
	
	public static int max(int one,int two){	
		
		return (one>=two) ? one :two;
		
	}
	
	
	public static int calculate(Node node,int level){
	
		if(null == node)
		{
			return 0;			
		}
		
		if(node.left == null && null == node.right && level%2 == 1){
			return level;
		}
		
		return max(calculate(node.left,level+1),calculate(node.right,level+1));
	}
	
	public static  int findlevel(Node node){
		int level=1;
		return calculate(node,level);
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.right = new Node(7);
		root.right.right.right = new Node(8);
		root.right.left.right.left = new Node(9);
		root.right.right.right.right = new Node(10);
		root.right.right.right.right.left = new Node(11);
		
		System.out.println("Level is "+findlevel(root) );
		
	}

}
