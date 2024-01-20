package dataStruct.demo;

public class Quicksort {
private static void quicksort(int[] arr, int low, int high) {
	
	if(low<high) {
		int pivot = partition(arr, low, high);
		quicksort(arr, low, pivot-1);
		quicksort(arr, pivot+1,high);
		
	}
}

	private static int partition(int[] arr, int low, int high) {
		int pivotNum=arr[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j] < pivotNum) 
			{
				i++;
				int temp =arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
		
}

	public static void main(String[] args) {
		
		int arr[] = {5,3,7,1,2,4};
		
		quicksort ( arr, 0, arr.length-1);
		
		for (int num:arr) {
			System.out.print(num + " " );
		}
	}

	
}
