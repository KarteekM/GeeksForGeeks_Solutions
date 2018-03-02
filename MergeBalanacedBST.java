 class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class MergeBalanacedBST {
	
	public static int inOrder(Node node,int inOrder[],int i){
		
		if(node == null)
			return i;
		
		i=inOrder(node.left,inOrder,i);
		inOrder[i]=node.data;
		i++;
		i=inOrder(node.right,inOrder,i);
		
		return i;
	}
	
	
	
	
	
	public static int[] mergeTrees(int []a,int []b){
		
		int l1 =a.length;
		int l2 =b.length;
		int i=0,j=0;
		int []fin_arr = new int[l1+l2];
		int k=0;
		
		while(i<l1 && j<l2){
			
			if(a[i]<b[i])
			{
				fin_arr[k]=a[i];
				i++;
			}
			else
			{
				fin_arr[k]=b[j];
				j++;
			}
			k++;
			
			while(i<l1){
				fin_arr[k]=a[i];
				i++;k++;
			}
			while(j<l2){
				fin_arr[k]=b[j];
				j++;k++;
			}
		}
		return fin_arr;
	}
	
	public static void merge(Node n1,Node n2){
		
		int []inOrder1 = new int[7];
		int []inOrder2 = new int[7];
		int i1=0,i2=0;
		
		inOrder(n1,inOrder1,i1);
		inOrder(n2,inOrder2,i2);
		
		int []fin=mergeTrees(inOrder1,inOrder2);
		
		 for(int i=0;i<fin.length;i++){
			 System.out.println(fin[i]);
		 }
		
		
		
		
		
	}

	public static void main(String args[]){
		
		Node node = new Node(10);
		node.left =  new Node(5);
		node.right = new Node(20);
		node.left.left = new Node(3);
		node.left.right = new Node(8);
		node.right.left = new Node(16);
		node.right.right = new Node(25);
		int []a = new int[7];
		int i=0;
		
		Node node1 = new Node(100);
		node1.left =  new Node(50);
		node1.right = new Node(200);
		node1.left.left = new Node(30);
		node1.left.right = new Node(80);
		node1.right.left = new Node(160);
		node1.right.right = new Node(250);
	
		merge(node,node1);
		
		
	}
}
