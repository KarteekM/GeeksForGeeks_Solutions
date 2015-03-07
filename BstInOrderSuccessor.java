class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
}


public class BstInOrderSuccessor {
	
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

public static Node InOrderSuccessor(Node root,Node node){
	
	if(node == null || root == null)
		return null;
	
	Node iSucc =null;
	
	//If target node's right is not null return right
	if(node.right != null){
		return node.right;
	}
	 
	else
	{
		while(root != null){
			
			if(node.data < root.data){
				iSucc =root;
				root =root.left;
			}
			
			else if(node.data > root.data)
			{
				root=root.right;
			}
			
			else
				break;
		}
		
		return iSucc;
	}
}

public static void main(String args[]){
	
	Node root = new Node(20);
	Node temp=null;
	Node isucc =null;
	create(root,8);
	create(root,22);
	create(root,4);
	create(root,12);
	create(root,10);
	create(root,14);
	temp =root.left.right.right;
	
	isucc =InOrderSuccessor(root,temp);
	if(isucc !=  null)
	    System.out.println("Inorder Successor of "+temp.data+" is"+ isucc.data);  
	  else
	    System.out.println("Doesn't exist");
	
}
}
