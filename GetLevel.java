
public class GetLevel {
	
	public static int getLevel(Node node,int value,int level){
		
		if(node == null)
			return 0;
		
		if(node.data == value)
		{
			return level;
		}
		
	
			int downlevel=getLevel(node.left,value,level+1);
			if(downlevel != 0)
				return downlevel;
			downlevel=getLevel(node.right,value,level+1);
			
			return downlevel;
		
	}
	
	public static void main(String args[]){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		System.out.println(getLevel(root,5,1));
	}

}
