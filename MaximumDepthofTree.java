
class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
}
public class MaximumDepthofTree {
	
	public static int depth(Node node){
		
		if(node == null)
			return 0;
		
		else
		{
			int ldepth = depth(node.left);
			int rdepth = depth(node.right);
			
			if(ldepth >rdepth)
			{
				return ldepth+1;
			}
			else
				return rdepth+1;
		}
		
					
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		System.out.println("Maximum depth of the tree is "+depth(root));
	}
	
	

}
