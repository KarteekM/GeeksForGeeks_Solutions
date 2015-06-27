import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class WaterBlocks {
	
	public static void main(String args[]){
		Scanner in  = new Scanner(System.in);
		int res;
		
		int _buildingBlocks_size=Integer.parseInt(in.nextLine());
		int[] _buildingBlocks = new int[_buildingBlocks_size];
		int _buildingBlocks_item;
		for(int _buildingBlocks_i=0;_buildingBlocks_i<_buildingBlocks_size;_buildingBlocks_i++){
			_buildingBlocks_item=Integer.parseInt(in.nextLine());
			_buildingBlocks[_buildingBlocks_i]=_buildingBlocks_item;
		}
		
		
		res=calcWaterStored(_buildingBlocks);
		System.out.println(res);
		
	}

	private static int calcWaterStored(int[] buildingBlocks) {
		// TODO Auto-generated method stub
		
		List<Integer> store_array = new ArrayList<Integer>();
		int i=0,j=0;
		int prev;
		int a_size=buildingBlocks.length;
		//Negative effect
		for(i=0,j=1;i<a_size && j<a_size;i++,j++){			
			if(buildingBlocks[i] - buildingBlocks[j]>0){		
				while(i<a_size){
					store_array.add(buildingBlocks[i]);
					i++;
				}
				break;
			}			
		}
		
		//Positive_effect
		a_size = store_array.size();
		for(i=0,j=1;i<a_size && j<a_size ;i++,j++){
			
			if(store_array.get(i) -store_array.get(j)<0){
				break;
			}
		}
		
		if(j==a_size){
			return 0;
		}	
		
		//Actual logic
		List<Integer> final_array = new ArrayList<Integer>();
		int x=0;
		
		for(i=0,j=1;i<a_size && j<a_size;i++,j++){
			
			while(store_array.get(i) > store_array.get(j)){
				final_array.add(store_array.get(i));				
			}
			final_array.add((store_array.get(i)));
			
			if(final_array.get(0) > store_array.get(j)){		        	
				final_array.remove(0);
				final_array.add(0, store_array.get(j));
			}
			
			
		}
		
		
		return 5;
	}

}
