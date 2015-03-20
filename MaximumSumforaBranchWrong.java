class Sumvar{
	int sum;
}

public class MaximumSumforaBranch {
	
	public static boolean printPath(Node node,Node target){
		
		if(node == null)
			return false;
		
		if(target == node || printPath(node.left,target) 
				|| printPath(node.right,target)){
			System.out.println(target.data);
			return true;
		}
		
		return false;
	}

	public static void maxSum(Node node,Sumvar val,int maxSum,Node targetLeaf){
		
		if(null == node)
			return;
		
		val.sum =val.sum+node.data;
		if(node.left == null && node.right == null)
		{
			if(val.sum>maxSum)
			{
				maxSum=val.sum;
				targetLeaf =node;
			}
		}
	  
		maxSum(node.left,val,maxSum,targetLeaf);
		maxSum(node.right,val,maxSum,targetLeaf);
	}
	
	public static int finalCalc(Node node){
		
		if(null == node)
			return 0;
		
		Node target=null;
		int sum=0;
		int max_sum=Integer.MIN_VALUE;
		Sumvar val =new Sumvar();
		
		maxSum(node,val,max_sum,target);
		System.out.println("Max sum is this "+sum);
		printPath(node,target);
		
		return max_sum ;
		
	}
		

			public static void main(String args[]){
				Node node = new Node(10);
				node.left = new Node(-2);
				node.right = new Node(7);
				node.left.left = new Node(8);
				node.left.right = new Node(-4);
							
				finalCalc(node);
				

	}
	
}
