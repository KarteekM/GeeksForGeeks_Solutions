
public class DoubleTree {
	
	public static void print(Node n){
		
		if(n == null)
			return;
		System.out.println(n.data);
		print(n.left);
		print(n.right);
		
	}
	
	public static void createDouble(Node n){
		
		if(n == null)
			return;
		
		Node temp;
		
		createDouble(n.left);
		createDouble(n.right);
		
		Node x = new Node(n.data);
		temp=n.left;
		n.left = x;
		x.left = temp;	
		
		
	}
	
	public static void main(String args[]){
		
		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(3);
		
		createDouble(n);
		print(n);
		
		
	}

}
