class MaxHeap {
	int arr[];
	int size;
}
public class HeapSort {

	
	public static void heapify(MaxHeap maxHeap,int index){
				
	int largest = index;
	int left = 2*index +1;
	int right = 2*index +2;
	int temp;
	
	
	if(left< maxHeap.size && maxHeap.arr[left] > maxHeap.arr[largest]){
		largest =left;
	}
	   
	if(right < maxHeap.size && maxHeap.arr[right] > maxHeap.arr[largest]){
		largest = right;
	}
	
	if(largest != index){
		
		//swap(maxHeap.arr[largest],maxHeap.arr[index],maxHeap);
		temp=maxHeap.arr[largest];
		maxHeap.arr[largest] = maxHeap.arr[index];
		maxHeap.arr[index] =temp;
		
		heapify(maxHeap,largest);
	}
		
	}
	
	public static MaxHeap buildheap(int arr[],int size){
		
	int i=0;	
    MaxHeap maxHeap = new MaxHeap();
    maxHeap.arr = arr;
    maxHeap.size = size;
    
    //Starting for the parent of the last leaf node (last but one level node)
    for(i= (maxHeap.size -2)/2 ;i>=0;i--){
    	heapify(maxHeap,i);
    }
    return maxHeap;
}   
	
	public static void heapsort(int arr[],int size){
		
			MaxHeap maxHeap=buildheap(arr,size);
			int temp;
			while(maxHeap.size >1){
				
				//swap(maxHeap.arr[0],maxHeap.arr[maxHeap.size-1],maxHeap);
				
				temp=maxHeap.arr[0];
				maxHeap.arr[0] = maxHeap.arr[maxHeap.size-1];
				maxHeap.arr[maxHeap.size-1]=temp;
				
				maxHeap.size--;
				
				heapify(maxHeap,0);
			}	
		
	}
	public static void main(String args[])
	{
		int arr[] ={1,5,3,6,2};
		heapsort(arr,5);
		int i=0;
		
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
	}
	
}
