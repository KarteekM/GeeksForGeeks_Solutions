
public class DeepestLeftLeafNodeFinder {
	
	  Node deepestNode;
	    int deepestNodeDepth;
	 
	    public Node findDeepestLeftLeafNode(Node root,boolean isLeftNode,int depth){
	 
	    	
	    	if(null == root)
	    		return root;
	    	
	    	if(isLeftNode){
	    		if(depth > deepestNodeDepth){
		    		deepestNodeDepth =depth;
		    		deepestNode =root;
		    	}
	    		
	    	}
	    
	    	
	    	findDeepestLeftLeafNode(root.left, true, depth+1);
	    	findDeepestLeftLeafNode(root.right,false,depth+1);
	    	
	    	return deepestNode;
	    }
	

	    public static void main(String args[]){
	        Node root = new Node(1);
	         root.left=new Node(2);
	         root.right = new Node(3);
	         root.left.left = new Node(4);
	 
	        System.out.println("Deepest left node of the tree is : " +
	                new DeepestLeftLeafNodeFinder().findDeepestLeftLeafNode(root,false,0).data);
	
	    }
}
