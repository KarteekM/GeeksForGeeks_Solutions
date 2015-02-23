package Utility;

public class MirrorTree {
	
	public static void inOrder(Node node){
		
		if(node == null)
			return;
		
		else
		{
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}
	
	public static void mirror(Node node){
		
		if (node == null)
			return;
		
		else
		{
			Node temp;
			mirror(node.left);
			mirror(node.right);
			
			temp = node.left;
			node.left = node.right;
			node.right = temp;
			
		}
	}

	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		inOrder(root);
		mirror(root);
		System.out.println("After mirror");
		inOrder(root);
		
	}
}
