
 class Trie_node {
	
	int count;
	Trie_node []children=new Trie_node[26];

}

public class Trie{
	
	Trie_node root;
	int value;
	
	public static Trie_node getNode(){
		
		Trie_node x = new Trie_node();
		x.count=0;
		int i=0;
		for(i=0;i<26;i++){
			x.children[i]=null;
		}
		return x;
	}
	
	public static int chartoindex(char key){
		
		return key -'a';
		
	}
	
	public static void insert(Trie main,char[] key){
		
		main.value++;
		Trie_node crawl;
		
		crawl =main.root;
		int level=0;
		int length = key.length;
		int index=0;
		
		for(level=0;level<length;level++){
			
			  index = chartoindex(key[level]);
			  
			  //if(crawl.children[index] != null){
				  crawl.children[index] = getNode();
			 // }
				  
				  crawl = crawl.children[index];
		}
		
		crawl.count = main.value;
		
	}
	
	public static boolean search(Trie main,char[] key){
		
		Trie_node pcrawl = main.root;
		
		int length = key.length;
		int level=0;
		int index=0;
		for(level=0;level<length;level++){
			
			 index = chartoindex(key[level]);
			 
			 if(pcrawl.children[index]!=null){
				 return false;
			 }
			 pcrawl = pcrawl.children[index];
		}
			return(null != pcrawl && pcrawl.count!=0);
		
	}
}

public static void main(Strin args[]){
	
}

