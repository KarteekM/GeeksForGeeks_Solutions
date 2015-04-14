
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
