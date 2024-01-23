package dataStruct.demo;

public class MergeSort {

	public static void conquer(int arr[], int Fi ,int mid, int Li) {
		int merge[] = new int[Li-Fi+1];
		
		int index1=Fi;
		int index2=mid+1;
		int x=0;
		
	// Compare elements from both halves and merge them in sorted order
		
		while(index1 <=mid && index2 <= Li) {
			if(arr[index1] <= arr[index2]) {
				merge[x++] = arr[index1++];
				
			}
			else {
				merge[x++] = arr[index2++];

			}
		}
		
	// Copy remaining elements from the first half, if any
		while(index1 <= mid) {
			merge[x++] = arr[index1++];
		}
		
	// Copy remaining elements from the second half, if any
		while(index2 <= Li) {
			merge[x++] = arr[index2++];
		}
		
	// Copy the merged elements back to the original array
		 for (int i = 0; i < merge.length; i++) {
	            arr[Fi + i] = merge[i];
	        }
	}
	
	
	public static void divide(int arr[], int Fi , int Li) {
		if (Fi >= Li) {                 //if arr{22} then [arr,0,0] => (0 >=0)  condition is true;
			return;
		}
		
		 int mid =Fi + (Li-Fi)/2;
		divide(arr, Fi,mid );
		divide(arr, mid+1, Li);
		conquer(arr, Fi, mid, Li);
		
		
	}


	public static void main(String[] args) {
		int arr[] = {4,5,3,2,1,6};
		
		
		System.out.print(" Before sorting : ");
		for(int num:arr) {
			System.out.print( num + " ");
		}
	
	// Call the divide method to start the (merge sort process)
		divide(arr, 0, arr.length-1);
		System.out.println();
		
		System.out.print(" After sorting : ");
		for(int num:arr) {
			System.out.print( num + " ");
		}

	 
	 }

}
