
public class GreaterSum {
	
	public static void greaterSum(Node node,int sum){
		
		if(null == node)
			return;
		
		greaterSum(node.right,sum);
		
		sum = sum +node.data;
		node.data=sum;
		greaterSum(node.left,sum);
		
		
	}

	public static void inOrder(Node node){
		
		if(null == node)
			return;
		
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}
	
	public static void main(String args[]){
		Node node = new Node(5);
		node.left = new Node(4);
		node.right = new Node(10);
		
		
		inOrder(node);
	}
}
