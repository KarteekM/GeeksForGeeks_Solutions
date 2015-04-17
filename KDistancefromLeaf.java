 class Node {
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class KDistancefromLeaf {

	
	public static void traverseandprint(Node node,int path[],int index,int visited[],int distance){
		
		if(null == node)
			return;
		
		path[index]=node.data;
		visited[index]=1;
		index++;
		
		if( node.left == null && node.right == null && index-distance-1>=0
				&& visited[index-distance-1]==1){
			System.out.println(path[index-distance-1]);
			visited[index-distance-1]=0;
		}
		
		
		traverseandprint(node.left,path,index,visited,distance);
		traverseandprint(node.right,path,index,visited,distance);
	}
	
	public static void printnodes(Node node,int distance){
		
		int []path= new int[10];
		int index=0;
		int []visited = new int[10];
		traverseandprint(node,path,index,visited,distance);
	}
	
	public static void main(String args[]){
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		node.right.right.left = new Node(8);
		
		printnodes(node,2);
	}
}
