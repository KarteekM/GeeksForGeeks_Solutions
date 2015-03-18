class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class PrintPerFectBinaryTree {
	
	public static void perfectBinary(Node node){
		
		if(null == node)
			return;
		
		Queue q = new Queue();
		 
		System.out.println(node.data);
		
			q.insert(node.left);
			q.insert(node.right);
	
		
		while(true){
			
			Node n1 = q.remove();
			Node n2 = q.remove();
			
			if(n1!=null && n2 !=null ){
				
				System.out.println(n1.data);
				System.out.println(n2.data);
				q.insert(n1.left);
				q.insert(n2.right);
				q.insert(n1.right);
				q.insert(n2.left);
				
			}
			
			else
			{
				return ;
			}
			
		}
		
		
	}
	
	public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left.left =  new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		root.right.right.left =new Node(14);
		root.right.right.right = new Node(15);
		
		perfectBinary(root);
	}

}
