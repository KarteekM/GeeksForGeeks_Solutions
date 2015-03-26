
class Node {
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class PreOrderBST {
	
public static Node construct(int []a,int min,int max,int size,int index,int key){
	
	if(index > size)
		return null;
	
	Node node=null;
	//in range
	if(key>min && key<max)
	{
		node = new Node(key);
		index++;
		
		if(index < size)
			
		{
			node.left = construct(a,min,key,size,index,a[index]);
			node.right = construct(a,key,max,size,index,a[index]);
		}
		
	}
	
	return node;
}


public static void inorder(Node node){
	
	if(null == node)
		return;
	inorder(node.left);
	System.out.println(node.data);
	inorder(node.right);
}
public static void main(String args[]){
	  
	  int min=Integer.MIN_VALUE;
	  int max =Integer.MAX_VALUE;
	  int a[] ={10,5,1,7,40,50};
	  Node node=construct(a,min,max,a.length,0,a[0]);
	  
	  inorder(node);
}
}
