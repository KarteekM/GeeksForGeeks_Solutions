
public class ConstructTreefromInandPre {
		
	
	static int preindex=0;
	public static Node constructTree(int pre[],int in[],int start,int end){		
		
				
		if(start>end)
			return null;
		
		
		Node n = new Node(pre[preindex++]);
		
		if(start == end)
			return n;
		
		int inindex=search(n.data,in);
		
		 n.left= constructTree(pre,in,start,inindex-1);
		n.right =constructTree(pre,in,inindex+1,end);
		
		return n;
		
		
		
	}
	
	public static int search(int data,int arr[]){
		int i=0;
		
		for(i=0;i<arr.length;i++){
				
			if(arr[i] == data){
				return i;				
			}		
			
		}
		return -1;
	}
	
	public static void print(Node node){
		
		if(node == null)
			return;
		
		print(node.left);
		System.out.println(node.data);
		print(node.right);
	}
	
	public static void main(String args[]){
		
		int in[] ={4,2,5,1,6,3};
		int pre[]={1,2,4,5,3,6};
		
		Node root=constructTree(in,pre,0,in.length-1);
		
		print(root);
		
		
		
		
	}
}
