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

public class Root2LeafSum {
	
	
	
	public static boolean root2leafsum(Node node,int calsum,int value){
		
		boolean x=false;
		if(node == null)
			return true;
		
		calsum =calsum+node.data;		
		if(node.left == null && node.right == null){
			
			if(calsum == value){
				return true;
			}
			else
				return false;
		}
		
		else
		{
			if(node.left !=null){
				x=x ||root2leafsum(node.left,calsum,value);
			}
			
			if(node.right != null){
				x=x ||root2leafsum(node.right,calsum,value);
			}
			
			return x;
		}
		
	}
	
	public static void main(String args[]){
		Node root = new Node(10);
		root.left=  new Node(8);
				root.right =new Node(2);
				root.left.left=new Node(3);
				root.left.right=new Node(5);
				root.right.left=new Node(2);
				
		if(root2leafsum(root,0,14)){
			System.out.println("Sum exists in the path");
		}
		else
		{
			System.out.println("Sum doesn't exist in the path");
		}
	}
		

}
