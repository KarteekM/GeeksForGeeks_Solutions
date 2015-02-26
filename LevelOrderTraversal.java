class Queue{
	Node []arr = new Node[50];
	int front=0;
	int rear=0;
	
	public void insert(Node data){
		
		if(rear>49)
		{
			System.out.println("Queue is full");
			return;
		}
		
		arr[rear] = data;
		rear++;
	}
	
	public Node remove(){
		
		 if(front>rear || front<0)
		 {
			 System.out.println("Queue is empty");
			 return null;
		 }
		
			front++;
			return arr[front-1];
		
	}
	
}

public class LevelOrderTraversal {

	
	public static void levelOrderTraversal(Node root){
				
		if(root == null)
			return;
		
		Queue q= new Queue();
		Node temp=root;
		  
		 while(temp != null){			 
			  
			 System.out.print(temp.data);
			 System.out.print(" ");
			 
			 if(temp.left != null)
				 q.insert(temp.left);
			 
			 if(temp.right != null)
				 q.insert(temp.right);
			 
			 temp = q.remove();
			 
		 }
		
		
		
	}
	
public static void main(String args[]){
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.right = new Node(6);
		root.left.right.right= new Node(70);
		
		levelOrderTraversal(root);
	}
	
}
