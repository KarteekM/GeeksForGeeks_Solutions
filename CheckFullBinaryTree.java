class Node{	
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class CheckFullBinaryTree {
	
	
	public static boolean checkFull(Node node){
		
		if(null ==  node)
			return true;
		
		if(null == node.left && null == node.right)
			return true;
		
		if(null!= node.left && null!= node.right){
			return checkFull(node.left) &&	checkFull(node.right);
		}
		
		return false;
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(20);
	    root.right = new Node(30);
	 
	    root.left.right = new Node(40);
	    root.left.left = new Node(50);
	    root.right.left = new Node(60);
	    root.right.right = new Node(70);
	 
	    root.left.left.left = new Node(80);
	    root.left.left.right = new Node(90);

	   // root.right.right.right.right = new Node(100);
	    if(checkFull(root))
	    	System.out.println("Tree is full");
	    else
	    	System.out.println("Tree is not full");
	 
	}

}
