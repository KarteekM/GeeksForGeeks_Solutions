
public class BST {
	
	public static void inOrder(Node node){
		
		if(node == null)
			return;
		
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}

	public static void create(Node root,int data){
		
		if(null == root)
			return;
		
		//Node temp=root;
		Node x=null;
		int flag=-1;
		while(root!=null){
			
			if(data<root.data){
				x=root;
				root=root.left;
				flag=0;
				
			}
			
			else{
				x=root;
				root=root.right;
				flag=1;
			}
			
		}
		
		Node newNode = new Node(data);
		
		if(flag ==1){
			
		x.right = newNode;
		}
		
		else
		{
			x.left= newNode;
		}
	}
	
	public static void main(String args[]){
		Node node = new Node(20);
	    create(node,10);
	    create(node,30);
	    create(node,5);
	    create(node,40);
	    
	    inOrder(node);
	}
}
