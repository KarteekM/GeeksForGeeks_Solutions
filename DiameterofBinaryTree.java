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


/*
 *max(Diameter of LST,
 *Diameter of RST,
 *Height of LST+RST+1)
 **/
public class DiamaterofBinaryTree {

	public static int height(Node node){
		
		int lh,rh;
		if(node == null)
			return 0;
		lh = height(node.left);
		rh = height(node.right);
		
		if(lh > rh)
			return lh+1;
		else
			return rh+1;
	}
	
	public static int max(int a ,int b){
		
		if(a>=b)
			return a;
		else 
			return b;
	}
	
	public static int diameter(Node node){
		
		int lh,rh,ldiameter,rdiameter;
		if(node == null)
			return 0;
		
		lh = height(node.left);
		rh = height(node.right);
		
		ldiameter = diameter(node.left);
		rdiameter = diameter(node.right);
		
		return max(lh+rh+1, max(ldiameter,rdiameter));	
		
	}
	
	public static void main(String args[]){
		Node root = new Node(1);
		root.left =new Node(2);
		root.left.left =new Node(3);
		root.left.left.left=new Node(4);
		root.right = new Node(5);
		
		System.out.println("Diameter of a tree is " +diameter(root));
	}
}
