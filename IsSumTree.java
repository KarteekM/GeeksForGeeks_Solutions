
public class IsSumTree {

	public static int sum(Node node){
		
		if(node == null)
			return 0;
		
		return node.data +sum(node.left)+sum(node.right);
		
	}
	
	public static boolean sumCheck(Node node){
		
		if(node == null || (node.left == null && node.right==null))
			return true;
		
		int ls=0,rs=0;
		
		ls=sum(node.left);
		rs = sum(node.right);
		
		if(node.data == ls+rs && sumCheck(node.left) && sumCheck(node.right))
			return true;
		
		else 
			return false;
	}
	
	public static void main(String args[]){
		
		Node root = new Node(26);
		root.left = new Node(10);
		root.right = new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(6);
		root.right.right=new Node(3);
		
		if(sumCheck(root))
		System.out.println("Tree is sum tree");
		
		else
			System.out.println("Tree is not a sum tree");
		
		
	}
	
}
