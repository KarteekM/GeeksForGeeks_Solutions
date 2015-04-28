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

public class RemoveHalfNode {
	
	public static Node removehalf(Node node){
		
		if(null == node){
			return node;
		}
		
		node.left = removehalf(node.left);
		node.right = removehalf(node.right);
		
		if(node.left == null && node.right == null){
			return node;
		}
		
		if(null == node.left){
			
			Node local = node.right;
			node =null;
			return local;
		}
		
		if(null == node.right){
			Node local = node.left;
			node = null;
			return local;
		}
		
		return node;
		
	}
	
	
	public static void  printInorder(Node node){
		
		if(null == node)
			return;
		
		printInorder(node.left);
		System.out.println(node.data);
		printInorder(node.right);
		
	}
	public static void main(String args[]){
		
		Node root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(5);
		root.left.right = new Node(6);
		root.left.right.left=new Node(1);
	    root.left.right.right=new Node(11);
	    root.right.right=new Node(9);
	    root.right.right.left=new Node(4);
	    
	    printInorder(root);
	    
	    Node newroot = removehalf(root);
	    
	    System.out.println("After removing");
	    printInorder(newroot);
		
	}

}
