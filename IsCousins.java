
public class IsCousins {
	
	
	public boolean issibling(Node root,Node n1,Node n2){
		
		if(null == root){
			return false;
		}
		
		return ( (root.left == n1 && root.right == n2) || (root.left ==n2 && root.right == n1)
				|| issibling(root.left,n1,n2) || issibling(root.right,n1,n2));
	}
	public int callevel(Node node,Node n1,int level){
		
		if(null == node){
			return 0;
		}
		
		if(n1 == node){
			return level;
		}
		int l1 = callevel(node.left,n1,level+1);
		if(l1 !=0)return l1;
		return callevel(node.right,n1,level+1);
	}

	
	public boolean iscousins(Node root,Node n1,Node n2){
		
		if( callevel(root,n1,1) == callevel(root,n2,1) && !(issibling(root,n1,n2))){
			return true;
		}
		return false;
	}
	
	public static void main(String args[]){
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		node.right.left.right = new Node(8);
		IsCousins obj = new IsCousins();
		System.out.println("Are cousions is "+obj.iscousins(node,node.left.left,node.right.right));
		
		
	}
}
