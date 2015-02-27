public class Node {
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}

}

public class IsBinaryBST {

	static int x = Integer.MIN_VALUE;
	static int y = Integer.MAX_VALUE;
	
	public static boolean checkBST(Node node){
		return isBST(node,x,y);
	}
	
	public static boolean isBST(Node node,int x,int y){
		
		if(node == null)
			return true;
	
		if(node.data>=x && node.data<=y)
			return true && isBST(node.left,x,node.data-1) && isBST(node.right,node.data+1,y);
		
		else
			return false;
		
	}
	
	public static void main(String args[]){
		
		Node n = new Node(4);
		n.left = new Node(2);
		n.right = new Node(6);
		n.left.left = new Node(1);
		n.left.right = new Node(3);
		
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		
		 if(checkBST(n)){
			 
			 System.out.println("Its a BST");			 
		 }
		 
		 else
		 {
			 System.out.println("Not a BST");
		 }
		
	}
}
