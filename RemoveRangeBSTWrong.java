
public class BSTOutsideRange {
	
	public static void inOrder(Node node){
		
		if(null ==  node)
			return;
		
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
		
	}
	
	public static Node eliminate(Node node,int min,int max){
		
		if(null == node)
			return null;
		
		node.left =eliminate(node.left,min,max);
		node.right =eliminate(node.right,min,max);
		
		if(node.data < min){
			
			Node temp = node.right;
			node = null;
			return temp;
		}
		
		if(node.data>max)
		{
			Node temp=node.left;
			node =null;
			return  temp;
		}		
		 
       return node;
	}
	
	public static Node insert(Node root,int key){
		
		if(root == null)
			return new Node(key);
		
		if(key >root.data){
			root.left = insert(root.left,key);
		}
		
		else
		{
			root.right =insert(root.right,key);
		}
		
		return root;
	}
	
	public static void main(String args[]){
		
		Node root =  null;
		root = insert(root,6);
		root = insert(root,-13);
		root = insert(root,14);
		root = insert(root,-8);
		root = insert(root,15);
		root = insert(root,13);
		root = insert(root,7);
		
		//inOrder(root);
		
		root = eliminate(root, -10, 13);
		
		inOrder(root);
	}
	
	
}
