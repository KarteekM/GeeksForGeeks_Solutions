
public class MorrisPreOrder {
	
	public static void M_PreOrder(Node root){
		
		if(null == root)
			return;
		
		Node current =root;
		Node pre=null;
		
		while(current != null){
			
			if(current.left == null){
				System.out.println(current.data);
				current = current.right;
			}
			
			else
			{
				pre=current.left;
				
				while(pre.right!=null && pre.right != current){
					
					pre=pre.right;
				}
				
				
				if(pre.right == current){
					
					pre.right=null;
					current=current.right;
					
				}
				
				else
				{
					System.out.println(current.data);
					pre.right =current;
					current=current.left;
					
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
		
		M_PreOrder(root);
	}
}
