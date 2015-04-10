
public class BinaryTreetoLinkedList {
	
	public static Node convert(Node node){
		
		if(null == node){
			return node;			
		}
		
		if(node.left!= null)
		{
			Node left = convert(node.left);
			
			while(left.right != null){
				left=left.right;
			}
			
			left.right=node;
			node.left=left;
		}
		
		if(node.right != null){
			
			Node right = convert(node.right);
			 
			while( right.left != null)
				right =right.left;
			
			right.left=node;
			node.right=right;
			
		}
		
		return node;
	}
	
	public static Node BinaryTreetoLL(Node node){
		
		if(null == node){
			return node;
		}
		
		node =convert(node);
		
		while(node.left != null){
			node =node.left;
		}
		return node;
	}
	
	
	public static void main(String args[]){
		
		Node n = new Node(10);
		n.left = new Node(12);
		n.right = new Node(15);
		n.left.left = new Node(25);
		n.left.right = new Node(30);
		n.right.right = new Node(36);
		
		Node converted = BinaryTreetoLL(n);
		
		while(converted != null){
			System.out.println(converted.data);
			converted = converted.right;
			
		}
	}

}
