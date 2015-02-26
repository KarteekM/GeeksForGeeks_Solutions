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

public class MinimumValueBST {

	public static Node insert(Node node,int value){
		
		if(node == null)
		{
			Node x = new Node(value);
			return x;
		}
		
		else
		{
			if(value < node.data)
			{
				node.left=insert(node.left,value);
			}
			
			else
			{
				node.right=insert(node.right,value);
			}
		}
		return node;		
			
	}
	
	public static Node getMin(Node node){
		
		if(node == null)
			return null;
		
		while(node.left != null){
			node = node.left;
		}
		return node;
	}
	
	public static void main(String args[]){
		
		Node node = new Node(1);
		insert(node,2);
		insert(node,3);
		insert(node,6);
		insert(node,-1);
		insert(node,0);
		insert(node,-2);
		insert(node,-100);
		insert(node,-3);
		
		System.out.println("Least value in BST is "+getMin(node).data);
	}
	
}
