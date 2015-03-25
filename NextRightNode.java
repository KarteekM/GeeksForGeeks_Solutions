import java.util.LinkedList;


public class Queue<E> {
	
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


public class NextRightNode {
	
	public static Node nextRight(Node node,int key){
		
		if(null == node)
			return null;
		Queue<Node> qn = new Queue<Node>();
		Queue<Integer> qi = new Queue<Integer>();
		
		int level=0;
		qn.enqueue(node);
		qi.enqueue(level);
		
		while(qn.size()>0){
			
			node = qn.dequeue();
			level = qi.dequeue();
			
			if(node.data == key){
				
				if(qi.size() ==0 || qi.front() != level)
					return null;
				else
					return qn.front();
				
			}
		
				
				if(node.left != null){
					qn.enqueue(node.left);
					qi.enqueue(level+1);
				}
				
				if(node.right != null){
					qn.enqueue(node.right);
					qi.enqueue(level+1);
						
			}			
			
		}
		return null;
	}
	
	public static void main(String args[]){
		
		Node node = new Node(10);
		node.left =new Node(2);
		node.right =  new Node(6);
		node.right.right = new Node(5);
		node.left.left = new Node(8);
		node.left.right = new Node(4);
		
		//System.out.println(nextRight(node,10));
		System.out.println(nextRight(node,4).data);
		
	}

}
