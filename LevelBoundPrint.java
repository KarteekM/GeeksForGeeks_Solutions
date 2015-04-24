import java.util.LinkedList;

class Queue<E> {
	
	 private LinkedList<E> list = new LinkedList<E>();

	 
	  public void enqueue(E item) {
	    list.addLast(item);
	    
	  }

	  public E dequeue() {
	    return list.poll();
	  }

	  public boolean hasItems() {
	    return !list.isEmpty();
	  }

	  public E front(){
		  return list.peek();
	  }
	  
	  public int size() {
	    return list.size();
	  }

	  public void addItems(Queue<? extends E> q) {
	    while (q.hasItems())
	      list.addLast(q.dequeue());
	  }
	
}


public class LevelBoundPrint {
	
	public static void print(Node node,int low,int high){
		
		if(null == node){
			return ;			
		}
		
		int level=1;
		Queue<Node> q = new Queue<Node>();
		Node marker = new Node(-9999);
		
		q.enqueue(node);
		q.enqueue(marker);
		
		while(q.size() != 0){
			
			Node local = q.dequeue();
			
			if(local.data == -9999) //if its a marker
			{
				level++;
				
				if(q.size() ==0 || level > high)
					break;
				
				q.enqueue(marker);
				continue;
				
			}
			
			if(level >=low){
				
				System.out.println(local.data);
			}
			
			if(local.left != null){
				q.enqueue(local.left);
			}
			
			if(local.right!= null){
				q.enqueue(local.right);
			}
			
		}
		
	
	}
	
	public static void main(String args[])
	{
		
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right =new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right =new Node(14);
		
		print(root,2,3);
	}

}
