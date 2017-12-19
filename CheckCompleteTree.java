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
public class CheckCompleteTree {

	public static int count(Node node){
		
		if(null == node){
			return 0;
		}
		
		return (1 + count(node.left) + count(node.right));
		
	}
	
	public static  boolean checkComplete(Node node,int index,int count){
		
		if(node == null)
			return true;
		
		if(index >=count)
			return false;
		
		return checkComplete(node.left,2*index+1,count) && checkComplete(node.right,2*index+2,count);
		
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		
		System.out.println("Complete binary tree statement stands "+checkComplete(root,0,count(root)));
		
	}
}
