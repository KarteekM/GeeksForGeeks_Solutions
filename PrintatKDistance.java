class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class PrintatKDistance {

	public static void printatK(Node node,int distance,int level){
		
		if(node == null)
			return;
		
	    if(level == distance){
	    	System.out.println(node.data);
	    }
	    
	    else
	    {
	    	printatK(node.left,distance,level+1);
	    	printatK(node.right,distance,level+1);
	    }
		
	}
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left=new Node(4);
		root.left.right= new Node(5);
		root.right.left = new Node(8);
		printatK(root,2,0);
	}
	
}
