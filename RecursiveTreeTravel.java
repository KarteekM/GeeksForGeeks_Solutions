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
public class RecursiveTreeTravel {
	
	public static void preOrder(Node root){
		
		if(root == null)
			return;
		else
		{
			System.out.print(root.data);
			System.out.print("  ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void inOrder(Node root){
		
		if(root == null)
			return;
		else
		{
			inOrder(root.left);
			System.out.print(root.data);
			System.out.print("  ");			
			inOrder(root.right);
		}
	}
	
public static void postOrder(Node root){
		
		if(root == null)
			return;
		else
		{
			postOrder(root.left);				
			postOrder(root.right);
			System.out.print(root.data);
			System.out.print("  ");	
		}
	}
	
public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		System.out.println("Preorder of tree is");
		preOrder(root);
		System.out.println("");
		System.out.println("Inorder of tree is");
		inOrder(root);
		System.out.println("");
		System.out.println("PostOrder of tree is");
		postOrder(root);
	}
	
}
