
public class IterativeAncestor {
	
	public static void iterativeAncestor(Node node,int data){
		
		
		
		if(node == null)
			return ;
		
		Stack s4 = new Stack();
		
		
		while(true){
			
			while(node!=null &&node.data !=data ){
				
				s4.push(node);
				node = node.left;
			}
			
			if( node!=null && node.data == data)
				break;
			
			if(s4.peek().right == null){
				
				node = s4.pop();
				
				while(s4.top!= -1 && s4.peek().right == node){
					node = s4.pop();
				}
			}
			
			node = (s4.top ==-1)? null:s4.peek().right;
		}
		
		while(s4.top != -1){
			System.out.println(s4.pop().data);
			
		}
		
	}
	
	public static void main(String args[]){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
	        iterativeAncestor(root,7);
		
	}

}
