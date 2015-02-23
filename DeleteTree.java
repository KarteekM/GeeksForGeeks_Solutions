package Utility;

public class DeleteTree {
	
	public static void delete(Node node){
		
		if(node == null)
			return;
		
		else
		{
			delete(node.left);
			delete(node.right);
			
			System.out.println("Node being deleted is " +node.data);
			node = null;
		}
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		delete(root);
	}

}
