
public class LCABinaryTree {
	
	public static Node findLca(Node node,int n1,int n2,boolean v1,boolean v2){
		
		if(null == node){
			return node;
		}
		
		if(node.data ==n1)
		{
			v1=true;
			return node;
			
		}
		
		if(node.data == n2){
			v2=true;
			return node;
		}
		
	Node left= findLca(node.left,n1,n2,v1,v2);
		Node right = findLca (node.right,n1,n2,v1,v2);
		
		if(left!= null && right != null){
			return node;
		}
		
		return ( (left != null)? left:right);
		
	}
	
	public static boolean nodeExists(Node node,int key){
		
		if(null == node)
			return false;
		
		if(node.data == key || nodeExists(node.left,key) || nodeExists(node.right,key))
			return true;
		
		return false;
	}
	
	public static Node finalFunction(Node node,int n1,int n2){
		
		
		boolean v1=false,v2=false;
		
		Node lca = findLca(node,n1,n2,v1,v2);
		
		if(v1 != false && v2!= false && nodeExists(node,n1) && nodeExists(node,n2)){
			
			return lca;
		}
		
		return null;
		
	}
	
	public static void main(String args[]){
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		
		System.out.println( finalFunction(node,2,3));
		
	}

}
