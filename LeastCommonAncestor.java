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
public class LeastCommonAncestor {
	
	public static Node leastcommonAncestor(Node node,int n1,int n2){
		
		if(node == null)
			return null;
		
		if(node.data == n1 || node.data == n2){
			return node;
		}
		Node leftchild= leastcommonAncestor(node.left,n1,n2);
		Node rightchild =leastcommonAncestor(node.right,n1,n2);
		
		if(leftchild !=null && rightchild !=null)
			return node;
		
		return (leftchild != null)? leftchild:rightchild;
		
		
	}

	public static void main(String args[]){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.left = new Node(7);
		
		System.out.println("Least common Ancestor is "+leastcommonAncestor(root,2,4).data);
	}
}
