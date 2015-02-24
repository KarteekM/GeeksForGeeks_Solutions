class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
}

public class SizeofTree {
	
	public static int size(Node node){
		if(node == null)
			return 0;
		
		else
			return 1 + size(node.left) + size(node.right);
	}
	
	public static void main(String args[]){
		Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.right = new Node(5);
	
	System.out.println("Size of the tree is "+size(root));
		
		
		
	}

}
