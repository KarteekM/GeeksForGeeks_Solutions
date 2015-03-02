
public class Root2LeafSum {
	
	public static boolean  root2leafsum(Node node,int value){
		
		if(node == null)
			return (value ==0);
		
		else
		{
			boolean ans=false;
			
			int tempsum = value-node.data;
			
			if(tempsum ==0 && node.left == null && node.right == null)
				return true;
			
			
				if(node.left != null)
				ans = ans || root2leafsum(node.left,value);
				
				if(node.right != null)
					ans =ans || root2leafsum(node.right, value);
				
				return ans;
		}
		
		
			
	}
	
	public static void main(String args[]){
		Node root = new Node(10);
		root.left=  new Node(8);
				root.right =new Node(2);
				root.left.left=new Node(3);
				root.left.right=new Node(5);
				root.right.left=new Node(2);
				
		if(root2leafsum(root,21)){
			System.out.println("Sum exists in the path");
		}
		else
		{
			System.out.println("Sum doesn't exist in the path");
		}
	}
		

}
