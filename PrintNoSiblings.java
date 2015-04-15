class Node {
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class PrintNoSiblings {

	public static void printnosiblings(Node node){
		
		if(null == node)
			return;
		
		if(node.left!=null && node.right == null){
			
			System.out.println(node.left.data);
		}
		
		if(node.right!=null && node.left == null){
			System.out.println(node.right.data);
		}
		
		printnosiblings(node.left);
		printnosiblings(node.right);
		
	}
	
	public static void main(String args[]){

		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.right = new Node(4);
		node.right.left = new Node(5);
		node.right.left.left = new Node(6);
		printnosiblings(node);
	}
}
