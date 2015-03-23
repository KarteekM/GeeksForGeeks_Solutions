class Node{
	
	Node left;
	int data;
	Node right;
	
	Node(int data){
		left =null;
		this.data=data;
		right=null;
	}
public class InternalNodeisBST {

	public static boolean internalNode(int []arr){
		
		if(arr.length<2)
			return false;
		
		int min=0,max=0;
		if(arr[arr.length-1] >arr[arr.length-2]){
			max = arr[arr.length-1];
			min  = arr[arr.length-2];
		}
		else
		{ 
			 max =arr[arr.length-2];
			 min = arr[arr.length-1];
			
		}
		
		int i=0;
		for(i=0;i<arr.length;i++){
			
			if(! (arr[i]>min || arr[i]<max)){
				return false;
			}
			
		}
		
			
		return true;
	}
	
	public static void main(String args[]){
		
		int pre[]={8,3,5,7,6};
		System.out.println("Internal Node statement is" +internalNode(pre));
		
	}
}
