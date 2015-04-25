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

public class BinarytoThreaded {

	Queue<Node> queue = new Queue<Node>();
	
	public void createThreadUtil(Node node,Queue<Node> q){
		
		if(null == node)
			return;
		
		if(node.left !=null)
			createThreadUtil(node.left,q);
		
		q.dequeue();
		
		if(node.right!=null)
			createThreadUtil(node.right,q);
		
		else
		{
			node.right=q.front();
			
		}
			
	}
	
	public Queue<Node> populateQueue(Node root,Queue<Node> q){
		
		if(null == root)
			return null;
		
		if(root.left!=null)
		this.queue=populateQueue(root.left,q);
		
		this.queue.enqueue(root);
		
		if(root.right!=null)
	 	this.queue=populateQueue(root.right,q);
		
		return this.queue;
	}
	
	public void createThread(Node root){
		
		populateQueue(root,this.queue);	
		
		createThreadUtil(root,this.queue);		
	}

}
