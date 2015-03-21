class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class HalfTree {
	
	public static Node RemoveHalf(Node node){
		
		if(node == null)
			return null;
		
		node.left =RemoveHalf(node.left);
		node.right = RemoveHalf(node.right);
		
		if(node.left == null && node.right == null)
			return node;
		
		Node x = null;
		if(node.left == null && node.right !=null){		 	
		 	x=node;
		    node =node.right;
		    x =null;
			
		}
	   
		if(node.left != null && node.right ==null){		 	
		 	x=node;
		    node =node.left;
		    x =null;
			
		}
		 return node;
	}
	
	public static void PreOrder(Node node){
		
		if(null == node)
			return;
		System.out.println(node.data);
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public static void main(String args[]){
		
	
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.right.right = new Node(5);
		node.left.left.left = new Node(6);
		node.left.left.right = new Node(7);
		node.right.right.left = new Node(8);
		node.right.right.right =new Node(9);
		
		PreOrder(node);
		RemoveHalf(node);
	   System.out.println("After removal");
		PreOrder(node);
		
	}

}
