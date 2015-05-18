class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
	
public class CreateSumTree {

	public static int createSum(Node node){
		
		if(node == null)
			return 0;
		
		int lsum=0,rsum=0,old_value=0;
		
		lsum = createSum(node.left);
		rsum = createSum(node.right);
		
		old_value=node.data;
		node.data = lsum+rsum;
		
		return old_value+node.data;
		
	}
	
	public static void inOrder(Node root){
		Stack y =  new Stack();
		Node current =root;
		int done =0;
		while(0 == done){
			
			if(current!=null){
				y.push(current);
				current = current.left;
			}
			
			else
			{
				if(y.top != -1){
					Node node = y.pop();
					System.out.print(node.data);
					System.out.print("  ");
					
					if(node.right != null){
						current=node.right;
					}
				}
				
				else
				{
					done =1;
				}
			}
		}
			
	}
	
	public static void main(String args[]){
		
		Node root = new Node(10);
		root.left= new Node(-2);
		root.right =new Node(6);
		root.left.left =new Node(8);
		root.left.right = new Node(-4);
		root.right.left = new Node(7);
		root.right.right = new Node(5);
		
		createSum(root);
		inOrder(root);
	}
}
