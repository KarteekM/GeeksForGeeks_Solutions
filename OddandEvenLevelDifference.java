class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class OddandEvenLevelDifference {
	
	public static int diff(Node node){
		
		if(null  == node)
			return 0;
		
		return node.data -diff(node.left) -diff(node.right);
	};
	
	
	public static void main(String args[]){
		
		Node node  = new Node(5);
	    node.left = new Node(2);
	    node.right = new Node(6);
	    node.left.left  = new Node(1);
	    node.left.right = new Node(4);
	    node.left.right.left = new Node(3);
	    node.right.right = new Node(8);
	    node.right.right.right = new Node(9);
	    node.right.right.left = new Node(7);
			System.out.println("Difference is " +diff(node));
	}

}
