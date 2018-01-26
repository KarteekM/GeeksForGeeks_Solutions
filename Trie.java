class Trie_Node {
	// To decide whether it is key end or not
	int value;
	Trie_Node[] children;

	public Trie_Node() {
		super();
		this.value = 0;
		this.children = new Trie_Node[26];
		for (int i = 0; i < 26; i++) {
			this.children[i] = null;
		}
	}
}

class Trie {
	

	private Trie_Node root;
	int count;

	public Trie() {
		super();
		// This is then blank root for the trie
		root = new Trie_Node();
		count = 0;
	}

	// To ad a new key we first start from blank oot and start traversing if no
	// children are present we create new children
	public void add(String keyy) {
		String key = keyy.toLowerCase();
		Trie_Node curr = this.root;
		this.count++;
		for (int i = 0; i < key.length(); i++) {
			int c = key.charAt(i) - 'a';
			if (curr.children[c] == null) {
				curr.children[c] = new Trie_Node();
			}
			curr = curr.children[c];
		}
		curr.value = count;
	}

	public boolean search(String keyy) {
		String key = keyy.toLowerCase();
		Trie_Node curr = this.root;
		this.count++;
		for (int i = 0; i < key.length(); i++) {
			int c = key.charAt(i) - 'a';
			if (curr.children[c] == null) {
				return false;
			}
			curr = curr.children[c];
		}
		return (curr.value != 0);
	}
	
	
	
	public void delete(String keyy){
		
		String key = keyy.toLowerCase();
		int length = key.length();
		char []charkey = key.toCharArray();
		
		deletefunction(this.root,charkey,0,length);
	}
	
	
	public boolean isitFreeNode(Trie_Node node){
		int i=0;
		for(i=0;i<26;i++){
			
			if(node.children[i] != null){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean deletefunction(Trie_Node root,char[] key,int level,int length){
		
		if(level == length){
			
				if(root.value != 0){
					
					root.value =0;
					
					//Checking if any nodes for this leaf exist (If the node to be deleted is a prefix)
					if(isitFreeNode(root)){
						return true;
					}
					
					return false;
				}
				
				else{
					return false;
				}		
		}
		
		else{
			
			int index = key[level] -'a';
			
			if(deletefunction(root.children[index], key, level+1, length)){
				root.children[index]=null;
				
				return ( root.value == 0 &&  isitFreeNode(root));
			}
		}
		
		return false;
	}
	//Unit Test Case For Checking of Code
	public static void main(String[] args) {
		String[] keys = new String[] { "A", "ans", "and", "an", "Pineapple",
				"Apple", "Orange", "Banana" };
		Trie t = new Trie();
		for (String k : keys) {
			t.add(k);
		}
		System.out.println(t.search("an"));
		t.delete("an");
		System.out.println("After deletion " +t.search("an"));
		
	}

}
