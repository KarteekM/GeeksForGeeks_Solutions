class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class MorrisInOrder {
	
	public static void M_Inorder(Node root){
		
		Node pre=null;
		if (root == null)
			return;
		
		Node current =root;
		
		while(current != null){
			
			if(current.left == null){
				System.out.println(current.data);
				current =current.right;
			}
			
			else
			{
				
				pre=current.left;
				
				while(pre.right != null && pre.right != current){
					pre=pre.right;
				}
				
				if(pre.right == null){
					pre.right=current;
					current=current.left;
				}
				
				else
				{
					pre.right = null;
					System.out.println(current.data);
					current= current.right;
				}
				
			}
			
		}
		
	
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		M_Inorder(root);
	}

}
