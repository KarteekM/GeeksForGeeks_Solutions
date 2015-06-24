
public class Possibilities {
	
	 public static int[] output1;
	    
	 public static int sum(int n){
		// System.out.println("n internally is "+n);
		 int sum =0;
		 int prev=-1;
		 int curr=0;
		 while (n != 0) {
             // add last digit to the sum
			curr=n%10;
			if(prev!=-1 && prev>curr)
				return 0;
             sum += n % 10;
             // cut last digit
             prev= n%10;
             n /= 10;
       }
		 
		 //System.out.println("Sum internally is "+sum);
		 return sum;
		 
	 }
		
	    public static void uniquePartitions(int input1,int input2){
	        //Write code here
	    	
	    	//get smallest number
	    	String s = "";	    	
	    	int i=0;
	    	for(i=0;i<input2-1;i++){
	    		s =s +"0";
	    	}
	    	
	    	System.out.println(s);
	    	s="1"+s; //least number
	    	int min = Integer.parseInt(s);
	    	System.out.println("min is "+min);
	    	s="";
	    	for(i=0;i<input2;i++){
	    		s=s+"9";
	    	}
	    	int max =Integer.parseInt(s);
	    	System.out.println("max is "+max);
	    	int x=0;
	    	int j=0;
	    	output1= new int[max];
	    	for(i=min;i<=max;i++){
	    		x=sum(i);
	    		//System.out.println("x externally is"+x);
	    		
	    		if(x == 10 && !String.valueOf(i).contains("0")){
	    			System.out.println(i);
	    			output1[j]=i;
	    			j++;
	    		}
	    	}
	    	
	    }
	    
	    public static void main(String args[]){
	    	uniquePartitions(10,4);
	    }

}
