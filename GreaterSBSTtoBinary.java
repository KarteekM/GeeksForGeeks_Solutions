
public class GreaterSBSTtoBinary {
	
	  public static int sumBST(Node node,int value){
	
	
		
		if(null == node){
			return value;
		}
		
			
		value=sumBST(node.right,value);
		node.data=node.data+value;
		value=node.data;
		value=sumBST(node.left,value);
			
		return value;
	}
	
	public static void printInOrder(Node node){
		
		if(null == node){
			return;
		}
		
		printInOrder(node.left);
		System.out.println(node.data);
		printInOrder(node.right);
		
	}
	public static void main(String args[]){
		
		Node node = new Node(6);
		node.left = new Node(3);
		node.right=new Node(13);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(12);
        node.right.right = new Node(18);
        
		printInOrder(node);
	
		sumBST(node,0);
		
		System.out.println("After sum");
		
		printInOrder(node);
	}

}
