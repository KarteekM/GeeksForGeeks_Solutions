
public class PreOrdertoBST {
	
	public static Node constructBST(int a[]){
		
		int len=a.length;
		int i=0;
		
		Node node = new Node(a[i]);
		Stack stack = new Stack();
		stack.push(node);

		for(i=1;i<len;i++){			
			Node temp=null;
			
			while(stack.top != -1 && a[i] > stack.TopofStack().data){
		      temp=stack.pop();			
			 }
			
			if(temp != null){
				temp.right = new Node(a[i]);
				stack.push(temp.right);
			}
			
			else{
				stack.TopofStack().left =new Node(a[i]);
				stack.push(stack.TopofStack().left);
				
			}
			
		}	
		return node;
	}
	
	public static void inorder(Node node){
		
		if(null == node){
			return;		
		}
		
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
			
	}
	public static void main(String args[]){
		
		int a[] ={10,5,1,7,40,50};
		Node node=constructBST(a);
		inorder(node);
		
	}

}
