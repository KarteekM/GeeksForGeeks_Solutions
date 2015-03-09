class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class Foldable {
	
	public static boolean foldCheck(Node n1,Node n2){
		
		if(n1 == null && n2 == null){
			return true;
		}
		
		if( n1 == null || n2 == null){
			return false;
		}
		
			return foldCheck(n1.left,n2.right) && foldCheck(n1.right,n2.left);
		
	}
	
	public static boolean foldable(Node node){
		
		return foldCheck(node.left,node.right);
	}

	public static void main(String args[]){
		
		Node root =  new Node(1);
		root.left =new Node(2);
		root.right =new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		
		System.out.println("Tree foldability is "+foldable(root));
	}
}
