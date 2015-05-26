
public class QuickSort {
	
	public static void swap(int a[],int x,int y){
		int temp;
		temp=a[x];
		a[x]=a[y];
		a[y]=temp;
		
	}
	
	
	public static int partition(int a[],int low,int high){
		int i =low-1;
		int x = a[high];
		int j;
		for(j=low;j<=high-1;j++){
			
			if(a[j]<=x){
				i++;
				swap(a,i,j);
			}	
		}
		swap(a,i+1,high);
		return (i+1);
	}
	public static void quicksort(int a[],int low,int high){
		
		
		
		if(low <high){
			int p = partition(a,low,high);
			quicksort(a,low,p-1);
			quicksort(a,p+1,high);
		}
		
		
	}
	
	public static void main(String args[]){
		
		int a[] ={5,4,3,2,1};
		quicksort(a,0,4);
		
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
	}

}
