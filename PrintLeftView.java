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
	
	  public static void main(String args[]){
		  Queue<Integer> queue = new Queue<Integer>();
		  queue.enqueue(1);
		  queue.enqueue(2);
		  queue.enqueue(3);
		  queue.enqueue(4);
		  queue.enqueue(5);
		  
		  
	  }
	
}

public class PrintLeftView {
	
public static void leftview(Node node){
	boolean flag=true;
	
	if(null == node)
		return;
	
	Queue<Node> q= new Queue<Node>();
	q.enqueue(node);
	
	while(true){
		
		int nodecount = q.size();
	   if (nodecount == 0)
	            break;
	   flag=true;
		while(nodecount!=0){
			
			nodecount--;
			Node node2=q.dequeue();
			
			if(flag == true){
				System.out.println(node2.data);
				flag=false;
				
			}
		
			
			if(node2.left != null)
				q.enqueue(node2.left);
			
			if(node2.right != null)
				q.enqueue(node2.right);
			
		}
		
	}
	
	
}
	
public static void main(String args[]){
	
	Node node = new Node(1);
	node.left = new Node(10);
	node.right = new Node(30);
	node.right.left = new Node(25);
	node.right.right = new Node(40);
	
	leftview(node);
	
}

}
