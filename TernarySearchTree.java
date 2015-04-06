class TernaryNode{
	
	char value;
	TernaryNode left;
	TernaryNode equal;
	TernaryNode right;
	boolean endofString;
	
	TernaryNode(char value){
		
	 this.value =value;
	 this.left=null;
	 this.equal=null;
	 this.right=null;
	 this.endofString=false;
		
	}
}

public class TernarySearchTree {
	
	public static boolean search(TernaryNode node,char word[],int i){
		
		if(null == node && i <word.length)
			return false;
		
		if(word[i] <node.value)
		{
			return search(node.left,word,i);
		}
		
		else if(word[i] >node.value){
			return search(node.right,word,i);
		}
		
		else{
			 
			if(i >= word.length-1)
			{
				if(node.endofString == true)
					return true;
				
				else
					return false;
			}
			
			return search(node.equal,word,i+1);
			
		}
		
	}

	public static TernaryNode insert(TernaryNode node,char word[],int i){
		
		 if(null == node){
			node=new TernaryNode(word[i]);
		 }
		 
		 if(word[i] <node.value){
			 
			node.left= insert(node.left,word,i);
		 }
		 
		 else if(word[i] >node.value){
			 node.right=insert(node.right,word,i);
		 }
		 
		 else{
			 
			 if( i >=word.length-1)
				node.endofString=true;
			 
			 else
				 node.equal =insert(node.equal,word,i+1);		 
		 }
		 
		 return node;
	}
	public static void main(String args[]){
		
		TernaryNode root=null;
		String s ="cat";
		String s2 ="water";
		String s3 ="karteek";
		root=insert(root,s.toCharArray(),0);
		insert(root,s2.toCharArray(),0);
		
		System.out.println("Value is "+search(root,s2.toCharArray(),0));
		System.out.println("The value karteek is "+search(root,s3.toCharArray(),0));
		
	}

}
