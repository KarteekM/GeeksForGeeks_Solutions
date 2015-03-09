
public class SubTreeCheck {
	
	public static boolean checkTree(Node root,Node subtree){
		
		if(root == null && subtree == null)
			return true;
		
		if(root == null || subtree == null)
			return false;
		
		return ( (root.data == subtree.data) && checkTree(root.left,subtree.left)
				  && checkTree(root.right,subtree.right));
	}
	
	public static boolean subTreeCheck(Node root,Node subtree){
		   
		if(root == null)
			return false;
		
		if(subtree == null)
			return true;
		
		if(checkTree(root,subtree)){
			return true;
		}
		
		else
		{
		return	checkTree(root.left,subtree) || checkTree(root.right,subtree);
		}
		
		
}

	
	public static void main(String args[]){
		
		Node root = new Node(26);
		root.right= new Node(3);
		root.left= new Node(10);
		root.right.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.right= new Node(30);
		root.left.right = new Node(6);
		
		Node subtree = new Node(10);
		subtree.right = new Node(6);
		subtree.left = new Node(4);
		subtree.left.right = new Node(30);
		
		if(subTreeCheck(root,subtree))
		{
			System.out.println("Its a subtree");
		}
		
		else
		{
			System.out.println("Its not a subtree");
		}
	}
}
	
	
