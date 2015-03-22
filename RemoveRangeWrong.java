
public class RemoveRange {
	
	public static Node removeRange(Node node,int min,int max){
	
		 if(null == node){
			 return null;
		 }
		 
		 node.left = removeRange(node.left,min,max);
		 node.right = removeRange(node.right,min,max);
		 
		 if(node.data < min){
			Node rchild = node.right;
			node=null;
			return rchild;
			
		 }
		 
		 if(node.data > max){
			 Node lchild = node.left;
			 node=null;
			 return lchild;
		 }
		 
		 return node;
		
	}
	
	
	public static Node insert(Node node,int key){
		
		if(null == node)
		{
			
			node = new Node(key);
			node.left=null;
			node.right=null;
		}
		
		if(key<node.data){
			node.left=insert(node.left,key);
		}
		
		else
		node.right=insert(node.right,key);
		
		return node;
		
		
	}
	
	public static void inorder(Node node){
		
		if(null == node)
			return;
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
		
	}
	public static void main(String args[]){
		
		Node root = null;
		root = insert(root,6);
		root = insert(root,-13);
		root = insert(root,14);
		root = insert(root,-8);
		root = insert(root,15);
		root = insert(root,13);
		root = insert(root,7);
		
		inorder(root);
		removeRange(root,-10,13);
		inorder(root);
		
		
		
	}

}
