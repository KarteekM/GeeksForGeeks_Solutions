class TernaryNode{
	
	char data;
	TernaryNode left;
	TernaryNode equal;
	TernaryNode right;
	boolean isEndofString;
	
	public TernaryNode(char data) {
		
		this.data =data;
		this.left =null;
		this.right =null;
		this.equal=null;
		isEndofString=false;
	
	}
}

public class TernarySearchTree {
	
	boolean searchTST(TernaryNode node,char word[],int i){
		
		if(node == null){
			return false;
		}
		
	    if(word[i]<node.data){
	    	searchTST(node.left,word,i+1);
	    }
		
	    else if(word[i] > node.data){
	    	searchTST(node.right,word,i+1);
	    }
	    
	    else{
	    	
	      if(word[i] == '\0'){
	    	  return node.isEndofString;
	      }
	    
	
	    	  return searchTST(node.equal,word,i+1);
	
	    }
			
		return false;
	}
	
	
	public void insert(TernaryNode node,char value){
		
		if(null == node){
			node = new TernaryNode(value);
			
		}
		
		else
		{
			if(value <node.data){
				insert(node.left,value);				
			}
			
			else if(value > node.data)
			{
				insert(node.right,value);
				
			}
			
			else
			{
				if(node.data == value)
				insert(node.equal,value);
				
				else
					node.isEndofString =true;
			}
		}
	}

	
	

}
