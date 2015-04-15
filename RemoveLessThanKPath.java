
public class RemoveLessThanKPath {
	
	public static Node removepath(Node node,int sum){
		
		if(null == node)
			return null;
		
		node.left=removepath(node.left,sum-node.data);
		node.right=removepath(node.right,sum-node.data);
		
		if(node.left == null && node.right == null){
			
			if(node.data < sum)
			{
				node =null;
				return node;
			}
		}
		
		return node;
	}
	
	public static void inOrder(Node node){
		
		if(null == node)
			return;
		
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}
	
	public static void main(String args[]){
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		
		node=removepath(node,11);
		inOrder(node);
	}

}
