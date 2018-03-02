
public class DistanceBetweenKeys {

	int distance;
	int d1 =-1;
	int d2=-1;
	
	public int findLength(Node node,int key,int level){
		
		if(node == null)
			return -1;
		
		if(node.data == key)
			return level;
		
		int l=findLength(node.left,key,level+1);
		return (l!= -1)?l:findLength(node.right,key,level+1);		
		
	}
	
	
	
	
	public  Node calculate(Node node,int n1,int n2,int d1,int d2,int distance,int level){
		
		
		if(null == node){
			return node;
		}
		
		if(node.data == n1){
			this.d1=level;
			return node;
		}
		
		if(node.data == n2){
			this.d2=level;
			return node;
		}
		
		Node left =calculate(node.left,n1,n2,d1,d2,distance,level+1);
		Node right = calculate(node.right,n1,n2,d1,d2,distance,level+1);
		
		if( left!=null && right!=null){
			
			this.distance = this.d1+this.d2 - 2*level;
			return node;
		}
		
		return (left!=null)?left:right;
		
	}
	
	public int distance(Node node,int n1,int n2){
		
		Node lca=calculate(node,n1,n2,-1,-1,0,0);
		
		if(this.d1 !=-1 && this.d2!=-1){
			return this.distance;
		}
		
		if(this.d1 != -1){
			this.distance =findLength(lca,n2,0);
			return this.distance;
		}
		
		if(this.d2 != -1){
			this.distance = findLength(lca,n1,0);
			return this.distance;
		}
		
		return -1;
	}
	
	public static void main(String args[]){
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		
		DistanceBetweenKeys  x =new DistanceBetweenKeys();
		
		System.out.println("Distance is "+x.distance(node,2,1));
	}
	
	
}
