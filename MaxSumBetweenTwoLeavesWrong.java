
public class MaxSumBetweenTwoLeaves {
	
	public int res;
	
	public  int max(int x,int y){
		
		return (x>=y)?x:y;
	}

	public  int findmax(Node node,int result){
		
		if(null == node)
		return 0;
		
		int lsum = findmax(node.left,result);
		int rsum = findmax(node.right,result);
		
		int finalsum =lsum +rsum +node.data;
		
		if(this.res <finalsum){
			this.res =finalsum;
		}
		
		return max(lsum,rsum)+node.data;
	}
	
	public static void main(String args[]){
		
		Node node = new Node(-15);
		node.left = new Node(5);
		node.right = new Node(6);
		node.left.left = new Node(-8);
		node.left.right = new Node(1);
		node.left.left.left =new Node(2);
		node.left.left.right = new Node(6);
		node.right.left = new Node(3);
		node.right.right = new Node(9);
		node.right.right.right= new Node(0);
		node.right.right.right.left= new Node(4);
		node.right.right.right.right= new Node(-1);
		node.right.right.right.right.left= new Node(10);
		
		MaxSumBetweenTwoLeaves obj = new MaxSumBetweenTwoLeaves();
		obj.res =0;
		
		System.out.println("Maximum sum is " +obj.findmax(node,obj.res));
	}
}
