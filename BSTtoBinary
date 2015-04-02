
public class GreaterSBSTtoBinary {
	static int value=0;
	public static void sumBST(Node node,int data){
		
		if(null == node){
			return;
		}
		
		sumBST(node.right,data);
		node.data=node.data+data;
		value=node.data;
		sumBST(node.left,node.data);
		
		
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
		
		Node node = new Node(5);
		node.left = new Node(6);
		node.right=new Node(13);
		
		printInOrder(node);
		value =node.data;
		sumBST(node,node.data);
		
		printInOrder(node);
	}

}
