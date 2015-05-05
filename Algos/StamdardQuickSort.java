
public class QuickSort2 {
	

	public static void swap(int a[],int x,int y){
		int temp;
		temp=a[x];
		a[x]=a[y];
		a[y]=temp;
		
	}
	
	public static int partition(int a[],int low,int high){
		
		int pivot = a[low];
		int i =low;
		int j = high+1;
		
		
		while(true){
			
			while(a[++i] < pivot){				
				if(i >= high){
					break;
				}
			}
			
			while(a[--j] >pivot){
				
				if(j<=low){
					break;
				}				
			}
			
			if(i>=j){
				break;
			}
				else{
					swap(a,i,j);
				}
		}
		
		if(j == low)
			return j;
		swap(a,low,j);
		return j;		
	}
public static void quicksort(int a[],int low,int high){
		
		if(low <high){
			int p = partition(a,low,high);
			quicksort(a,low,p-1);
			quicksort(a,p+1,high);
		}
}

public static void main(String args[]){
	
	int a[] ={5,4,3,2,1,8,98,54,36,76,76,5};
	quicksort(a,0,11);
	
	for(int i=0;i<11;i++){
		System.out.println(a[i]);
	}
}


}
