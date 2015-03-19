import java.util.LinkedHashMap;
import java.util.Map;


public class VerticalSum {
	
		
	public static void verticalSum(Node node,Map map,int hd){
		
		if(null == node)
			return;
		
		verticalSum(node.left,map,hd-1);
		int prevSum= (int) ((map.get(hd) ==null)?0:map.get(hd));
		map.put(hd ,prevSum+node.data);
		verticalSum(node.right,map,hd+1);
		
		
	}
	
	public static void main(String args[]){
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(6);
		verticalSum(root,map,0);
		
		if(map!=null){
			System.out.println(map.entrySet());
		}
		
		
		
	}

}
