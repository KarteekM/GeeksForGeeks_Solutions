class Node {
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}

}
public class LeafCount {
	
	public static int countLeaves(Node node){
		
		if(node == null)
			return 0;
         
		if(node.left == null && node.right == null)
			return 1+  countLeaves(node.left) +countLeaves(node.right);
		
		else
		return 0 + countLeaves(node.left) + countLeaves(node.right);
		
	}
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.right.left= new Node(7);
		
		System.out.println("Number of leaves are "+countLeaves(root));
		
	}
}
