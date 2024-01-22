package dataStruct.demo;

public class MergeSort {
	//private static int mid;

	public static void conquer(int arr[], int Fi ,int mid, int Li) {
		int merge[] = new int[Li-Fi+1];
		
		int index1=Fi;
		int index2=mid+1;
		int x=0;
		
		while(index1 <=mid && index2 <= Li) {
			if(arr[index1] <= arr[index2]) {
				merge[x++] = arr[index1++];
				
			}
			else {
				merge[x++] = arr[index2++];

			}
		}
		
		while(index1 <= mid) {
			merge[x++] = arr[index1++];
		}
		
		while(index2 <= Li) {
			merge[x++] = arr[index2++];
		}
		
		 for (int i = 0; i < merge.length; i++) {
	            arr[Fi + i] = merge[i];
	        }
	}
	
	
	public static void divide(int arr[], int Fi , int Li) {
		if (Fi >= Li) {
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
	
		divide(arr, 0, arr.length-1);
		System.out.println();
		
		System.out.print(" After sorting : ");
		for(int num:arr) {
			System.out.print( num + " ");
		}

	 
	 }

}
