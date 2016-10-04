class Node2{
	int data;
	Node2 left;
	Node2 right;
	Node2 rightpointer;
	
	
	Node2(int data){
		this.data =data;
		this.left=null;
		this.right=null;
		this.rightpointer=null;		
		
		
		
	}
}

class Queue2{
	Node2 []arr = new Node2[50];
	int front=0;
	int rear=0;
	
	public void insert(Node2 data){
		
		if(rear>49)
		{
			System.out.println("Queue is full");
			return;
		}
		
		arr[rear] = data;
		rear++;
	}
	
	public Node2 remove(){
		
		 if(front>rear || front<0)
		 {
			 System.out.println("Queue is empty");
			 return null;
		 }
		
			front++;
			return arr[front-1];
		
	}
	
	public Node2 next(){
		int next=front+1;
		return arr[next];
	}
	
}

public class ConnectNodes {

	
	public static void levelOrderTraversal(Node2 root){
				
		if(root == null)
			return;
		
		Queue2 q= new Queue2();
		Node2 temp=root;
		temp.rightpointer =null;
		  
		 while(temp != null){	 
			
			 
			 if(temp.left != null)
				 q.insert(temp.left);
			 
			 if(temp.right != null)
				 q.insert(temp.right);
			 
			 q.insert(null);
			 temp = q.remove();
			 
			 if(temp!=null)
			 temp.rightpointer=q.next();
			 
			 if(temp == null)
			 temp=q.remove();
			 
		 }	
		
	}
	
public static void main(String args[]){
		
		Node2 root = new Node2(1);
		root.left = new Node2(2);
		root.right = new Node2(3);
		root.left.left = new Node2(4);
		root.left.right = new Node2(5);
		root.left.left.right = new Node2(6);
		root.left.right.right= new Node2(70);
		
		levelOrderTraversal(root);
		
		System.out.println("Values are");
		System.out.println(root.rightpointer);
		System.out.println(root.left.rightpointer);
	}
	
}

