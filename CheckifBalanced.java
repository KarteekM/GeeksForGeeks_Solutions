
public class CheckifBalanced {

	public static int height(Node node){
		
		if(node == null)
			return 0;
		
		int lheight = height(node.left);
		int rheight = height(node.right);
		
		if(lheight > rheight)
		{
			return lheight+1;			
		}
		
		else
		{
			return rheight+1;
		}
	}
	
	public static boolean checkBalance(Node node){
		
		int lh;
		int rh;
		if(node == null)
			return true;
		
		lh = height(node.left);
		rh = height(node.right);
		
		
		if(Math.abs(lh -rh) <= 1){
			
			return true && checkBalance(node.left) && checkBalance(node.right);
			
		}
		
		else
		{
			return false;
		}
		
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left =new Node(2);
		root.left.left =new Node(3);
		root.left.left.left=new Node(4);
		
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		
		System.out.println("BAlance is  "+checkBalance(root2));
		
	}
}
