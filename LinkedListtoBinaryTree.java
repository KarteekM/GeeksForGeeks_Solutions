class LinkedList{
	
	int data;
	LinkedList next;
	
	LinkedList(){
		
	}
	
	LinkedList(int data){
		this.data =data;
		this.next=null;
	}
	
	public  LinkedList insert(LinkedList list,int data){
		
		LinkedList newNode = new LinkedList(data);
		newNode.next=list;
		list=newNode;	
		return list;
		
		
	}
	
}

public class LinkedListToBinaryTree {

	public static Node logic(LinkedList l,Node n){
		
		if(l == null)
			return null;
		
	Queue q= new Queue();
		
		n= new Node(l.data);
	   q.insert(n);
	   l=l.next;
	   
	   while(l!=null){
		   
		  Node n1 = q.remove();
		   
		    
		    n1.left = new Node(l.data);
		    q.insert(n1.left);
		    l=l.next;
		    if(l!=null){
		    	n1.right = new Node(l.data);
		    	q.insert(n1.right);
		    	l=l.next;
		    }	    
		   
	   }
		return n;
		
	}
	
	public static void inOrder(Node node){
		
		if(null ==  node)
			return;
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}

	public static void main(String args[]){
		
	 LinkedList l = new LinkedList();
	l= l.insert(l, 1);
	l= l.insert(l, 2);
	l= l.insert(l, 3);
	l= l.insert(l, 4);
	
	Node node=null;
	node =logic(l,node);
	inOrder(node);
	
		
	}
}
