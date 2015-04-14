 class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class SumofAllthePaths {
	
	public static int sum(Node node,int value){
		
		if(null == node){
			return 0;
		}
		
		value = value*10 +node.data;
		
		if(node.left == null && node.right == null){
			return value;
		}
	
		return sum(node.left,value) + sum(node.right,value);
	}
	
	public static void main(String args[]){
		
		Node node = new Node(6);
		node.left = new Node(3);
		node.right = new Node(5);
		node.left.left = new Node(2);
		node.right.right = new Node(7);
		node.left.right = new Node(5);
		System.out.println(sum(node,0));
		
	}

}
