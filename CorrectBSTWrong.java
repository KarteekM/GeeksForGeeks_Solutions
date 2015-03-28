
public class CorrectBST {
	
	public static void correctNode(Node root,Node first,Node middle,Node last,Node prev){
	
		if(root!=null){
			
			correctNode(root.left,first,middle,last,prev);
			
			if(prev!=null && root.data <prev.data){
			
				if(first!=null){
					first =prev;
					middle=root;
					
				}
				
				else
				{
					last=root;
				}
				
			}
			
			
				prev=root;
				
				correctNode(root.right,first,middle,last,prev);
			
			
		}
		
	}

	public static void correct(Node node){
		
		Node first=null;
		Node middle =null;
		Node last=null;
		Node prev=null;
		
		correctNode(node,first,middle,last,prev);
		
		Node temp=null;
		if(first != null && last!=null){
			temp.data=first.data;
			first.data=last.data;
			last.data=temp.data;
		}
		
		else if(first!=null && middle!=null)
		{
			temp.data=first.data;
			first.data=middle.data;
			middle.data=temp.data;			
		}
		
	}

	void inOrder(Node node){
		
		if(null == node)
			return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
		
	}
	public static void main(String args[]){
		
		Node node = new Node(6);
		node.left =  new Node(10);
		node.right = new Node(2);
		node.left.left =  new Node(1);
		node.left.right = new Node(3);
		node.right.right =  new Node(12);
		node.right.left = new Node(7);
	
		
	}
	
}
