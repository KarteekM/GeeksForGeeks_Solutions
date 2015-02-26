class Stack{
	Node []arr = new Node[50];
	int top=-1;
	
  public void push(Node node){
	  
	  if(top>=50)
	  {
		  System.out.println("Stack is full");
		  return;
	  }
	  
	  else
	  {
		  top++;
		  arr[top] = node;
		  
	  }
	  
  }
  
  public Node pop(){
	  if(top<0)
	  {
		  System.out.println("Stack is empty");
		  return null;
	  }
	  return arr[top--];
  }
}

public class IterativeTraversal {
	
	public static void iterativePreorder(Node node){
		if(node == null)
			return;
		
		Stack x = new Stack();
		
		x.push(node);
		
		while(x.top!=-1){
			Node local = x.pop();
			System.out.print(local.data);
			System.out.print(" ");
			
			if(local.right!=null)
				x.push(local.right);
			
			if(local.left!=null){
				x.push(local.left);				
			}
				
		}
		
		System.out.println(" ");
	}
	
	public static void iterativeInorder(Node node){
			
		int done=0;
		Node current=node;
		Stack s1 = new Stack();
		while(0 == done)
		{
			if(current!=null){
				s1.push(current);
				current=current.left;
			}			
			
			else
			{
				if(s1.top!= -1)
				{
					current = s1.pop();
					System.out.print(current.data);
					System.out.print(" ");
					
					current=current.right;
				}
				
				else
				{
					done=1;
				}
			}
		}
		System.out.println(" ");
	}
	
	public static void iterativePostorder(Node node){
		
		if(node == null)
			return;
		
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		
		s1.push(node);
		
		while(s1.top!=-1){
			Node post_node = s1.pop();
			s2.push(post_node);
			
			if(post_node.left != null)
				s1.push(post_node.left);
			
			if(post_node.right!=null)
				s1.push(post_node.right);
		}
		
		while(s2.top!=-1)
		{
			System.out.print(s2.pop().data);
			System.out.print(" ");
		}
	}

	public static void main(String args[]){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		
		
		iterativePreorder(root);
		iterativeInorder(root);
		iterativePostorder(root);
		
	}
}
