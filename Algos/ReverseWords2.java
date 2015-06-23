import java.io.*;
import  java.util.*;

class ReverseWords2
{
    public static String output;
	
    
  public static void swap(char[] buf, int start, int end) {
	    for (int i = start, j = end - 1; i < j; i++, j--) {
	        char swap = buf[i];
	        buf[i] = buf[j];
	        buf[j] = swap;
	    }
	}
		
    public static void reverseWords(String input){
      char[] buffer = input.toCharArray();

	    
	    swap(buffer, 0, buffer.length);

	    int  start=0,end=0;
	    for (start = 0; start < buffer.length; start = end + 1) {
	        for (end = start; end < buffer.length && buffer[end] != ' '; end++) {}
	        swap(buffer, start, end);
	    }
	    output = new String(buffer);
	    System.out.println(output);
      
    }
	public static void main(String args[]){
		
		reverseWords("where are you Vedant");
		
	}
  
}
