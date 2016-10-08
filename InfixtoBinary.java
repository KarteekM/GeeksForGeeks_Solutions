import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Node {

	Node left;
	char data;
	Node right;

	Node(char data) {

		this.left = null;
		this.data = data;
		this.right = null;

	}
	
	Node inserttoken(char token) {
		
		this.data = token;
		return this;
	}

	Node getleftchild() {
		this.left = new Node(' ');
		return this;

	}

	Node getrightchild() {
		this.right = new Node(' ');
		return this;
	}

	boolean isRoot(Node root){
		
		if(root ==null)
			return false;
		
		if(root.left == null && root.right == null)
			return true;
		
		return false;
		
	}
	
	Node getParent(Node root) {
		
		Node l_parent =null;
		Node r_parent =null;
		if(root == null || isRoot(root)){
			return null;
		}

		 if(root.left == this || root.right == this){
			return root;
		}
		
		
			
			l_parent=getParent(root.left);
			r_parent=getParent(root.right);			
	
			return (l_parent != null) ? l_parent :r_parent;		
		
	}
	
}
public class InfixExpression {
	
	public static void inOrder(Node root){
		
		if(null == root)
		return;
		
		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);
	}
	
	public static void preOrder(Node root){
		
		if(null == root)
		return;
		
		System.out.print(root.data);
		preOrder(root.left);		
		preOrder(root.right);
	}
	
	public static void postOrder(Node root){
		
		if(null == root)
		return;
		
		postOrder(root.left);		
		postOrder(root.right);
		System.out.print(root.data);
	}
	
	public Node constructBinaryTree(String s) {
		Node root = new Node(' ');
		Node temp = root;
		int i = 0;
		for (i = 0; i < s.length(); i++) {

			if ('(' == s.charAt(i)) {
				temp = temp.getleftchild();
				temp=temp.left;
			}

			else if ('+' == s.charAt(i) || '*' == s.charAt(i)
					|| '/' == s.charAt(i) || '-' == s.charAt(i)
					|| '%' == s.charAt(i) || '&' == s.charAt(i)
					|| '|' == s.charAt(i)) {
				temp = temp.inserttoken(s.charAt(i));
				temp = temp.getrightchild();
				temp=temp.right;

			}

			else if (')' == s.charAt(i)) {

				if (temp.getParent(root) != null) {
					temp = temp.getParent(root);
				}
			}

			else if (s.charAt(i) >= (int) 'a' && s.charAt(i) <= (int) 'z'
					|| s.charAt(i) >= (int) 'A' && s.charAt(i) <= (int) 'Z') {
				
					temp.inserttoken(s.charAt(i));
					temp = temp.getParent(root);
			}
			
			
			
			
		}

		 return root;
	}
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a valid Infix expression with proper precedence");
		String s =br.readLine();		
		InfixExpression infixExpression = new InfixExpression();
	    String	s_without_spaces=s.replaceAll("\\s", " ");
		Node root =infixExpression.constructBinaryTree(s_without_spaces);
		 System.out.print("Inorder of the expression is  ");
		 inOrder(root);
		 System.out.println();
		 System.out.print("PreOrder of the expression is  ");
		 preOrder(root);
		 System.out.println();
		 System.out.print("PostOrder of the expression is  ");
		 postOrder(root);	
		
	}
	


}
