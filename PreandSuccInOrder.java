
public class PreandSuccInOrder {
	
	Node predecessor;
	Node successor;
	
	public void findboth(Node node,Node predecessor,Node successor,int key){
		
		if(null == node){
			return;
		}
		
		if(node.data == key){
						
			if(node.left != null){
			Node temp =node.left;
				
				while(temp.right != null)
					temp=temp.right;
				
				this.predecessor = temp;
			}		
			
			if(node.right != null){
				Node temp = node.right;
				
				while(temp.left != null)
					temp=temp.left;
				
				this.successor=temp;
			}
			
			return;
		}
		
		if(key < node.data){
			this.successor=node;
			findboth(node.left,this.predecessor,this.successor,key);
			
		}
		
		else{
			this.predecessor = node;
			findboth(node.right,this.predecessor,this.successor,key);
		}
		
		
	}
	
	 public void insert(Node node, int value) {
		    if (value < node.data) {
		      if (node.left != null) {
		        insert(node.left, value);
		      } else {
		        System.out.println("  Inserted " + value + " to left of "
		            + node.data);
		        node.left = new Node(value);
		      }
		    } else if (value > node.data) {
		      if (node.right != null) {
		        insert(node.right, value);
		      } else {
		        System.out.println("  Inserted " + value + " to right of "
		            + node.data);
		        node.right = new Node(value);
		      }
		    }
		  }
		
	public static void main(String args[]){
		
		PreandSuccInOrder obj = new PreandSuccInOrder();
		Node root =new Node(30);
		
		obj.insert(root,30);
		obj.insert(root, 20);
		obj.insert(root, 40);
		obj.insert(root, 60);
		obj.insert(root, 70);
		obj.insert(root, 80);
		
		obj.predecessor=null;
		obj.successor=null;
		
		obj.findboth(root, obj.predecessor, obj.successor, 30);
		
		System.out.println("Predecessor is "+ obj.predecessor.data+ " and successor is "+obj.successor.data);
		
	}
	

}
