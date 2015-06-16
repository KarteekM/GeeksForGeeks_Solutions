/*
 * There are n windows.Each window has some tickets.The ticket price is equal to number of tickets
 * present in the window at that time.Find the maximum price achieved by selling first m tickets.
 * a-i tickets are present in ith window.
 * Eg: n=2 , m=4 
 * window0 = 2 ,window1=5 ->So max price is 5+4+3+2 =14 is the answer
 */
 
import java.util.ArrayList;
import java.util.Collections;

class TicketWindow{
	
	int[] ticket;
}

public class Solution {
	
	public static void main(String args[]){
		
		int n=2; //no of windows
		int m=4; //no of tickets required to calculate
		int[] eachwindow = new int[n];//no of tickets in each window		
		
		eachwindow[0] =2;
		eachwindow[1]=5;
		TicketWindow[] windows = new TicketWindow[n];
		int finalsum=0;
		int i=0;
		int j=0;
			
		
		for(i=0;i<windows.length;i++){	
			windows[i] = new TicketWindow();
			windows[i].ticket = new int[eachwindow[i]];			
		}
		
		for(i=0;i<windows.length;i++){			
			  int x = windows[i].ticket.length;			  
			  for(j=0;j<x;j++){
				  windows[i].ticket[j] =j+1;
			  }		
			
		}
		
		ArrayList<Integer> finalprice = new ArrayList<Integer>();
		
		for(i=0;i<windows.length;i++){
			int x = windows[i].ticket.length;
			for(j=0;j<x;j++){
				finalprice.add(windows[i].ticket[j]);
			}
			
		}
		
		Collections.sort(finalprice);
		Collections.reverse(finalprice);
		
		//Sum
		for(i=0;i<m;i++){
			finalsum = finalsum +finalprice.get(i);
			
		}
		
		System.out.println("Final sum is "+finalsum);
	}

}
