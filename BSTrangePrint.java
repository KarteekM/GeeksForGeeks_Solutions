class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}

public class BSTrangePrint {
	
public static void create(Node root,int data){
		
		if(null == root)
			return;
		
		//Node temp=root;
		Node x=null;
		int flag=-1;
		while(root!=null){
			
			if(data<root.data){
				x=root;
				root=root.left;
				flag=0;
				
			}
			
			else{
				x=root;
				root=root.right;
				flag=1;
			}
			
		}
		
		Node newNode = new Node(data);
		
		if(flag ==1){
			
		x.right = newNode;
		}
		
		else
		{
			x.left= newNode;
		}
	}

public static  void BSTrange(Node n,int k1,int k2){
	
	if(n == null)
		return;
	
	if(n.data>k1){
		BSTrange(n.left,k1,k2);
	}
	
	if(n.data>k1 && n.data<k2){
		System.out.println(n.data);
	}
	
	if(n.data<k2){
		BSTrange(n.right,k1,k2);
	}
	
	
	
}

public static void main(String args[]){
	
	Node root = new Node(20);
	root.left = new Node(8);
	root.right = new Node(22);
	root.left.left = new Node(4);
	root.left.right = new Node(12);
	
	BSTrange(root,10,25);
	
}
}
