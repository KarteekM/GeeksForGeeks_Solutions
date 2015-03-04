
public class Ancestors {
	
	public static void print(int a[],int index){
		
		int i=0;
		
		for(i=0;i<index;i++){
			System.out.println(a[i]);
		}
		
		
	}
	
	public static void ancestors(Node n,int a[],int index,int value){
		
		if(n == null)
			return;
		
		if(n.data == value){
			print(a,index);
		}
		else
		{
			a[index++] =n.data;
			ancestors(n.left,a,index,value);
			ancestors(n.right,a,index,value);
		}
		
	}
	
	public static void main(String args[]){
		
		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(5);
		n.left.left = new Node(3);
		n.left.right = new Node(4);
		n.right.right = new Node(6);
		n.right.right.right=new Node(7);
		n.left.right.right = new Node(8);
		int []a= new int[20];
		ancestors(n,a,0,8);
	}
	

}
