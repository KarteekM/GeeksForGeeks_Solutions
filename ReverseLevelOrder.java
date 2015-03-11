
public class ReverseLevelOrder {
	
	public static int height(Node node){
		
		if(null == node){
			return 0;
		}
		
		int lheight=0,rheight=0;
		
		lheight = height(node.left);
		rheight = height(node.right);
		
		if(lheight > rheight){
			return lheight+1;
		}
		
		else
			return rheight+1;
		
	}
	
	public static void print(Node node){
		
		int th = height(node);
		int i=0;
		for(i=th;i>=1;i--){
			printlevel(node,i);
		}
	}
	
	public static void printlevel(Node node,int height){
		
		if(node == null)
			return;
		
		if(height == 1){
			System.out.println(node.data);
		}
		
		else
		{
			printlevel(node.left,height-1);
			printlevel(node.right,height-1);
		}
		
	}
	
	public static void main(String args[]){
		
		Node root =new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		print(root);
		
	}

}
