package dataStruct.demo;

public class bubbleSort {
	 public static void main (String [] args) {
		   
		  int arr[] = {9,5,17,3,1,13,7};
		  
		  System.out.print("unsorted array is : " );
		  for(int i=0; i<arr.length;i++) {
		  System.out.print( arr[i] + " ");
		  }


		  
		  
		  for(int i=0; i<arr.length; i++) {
			  for(int j=1;j<arr.length-i;j++) {
				  
				  if (arr[j-1]>arr[j]) {
					  int temp= arr[j];
					  arr[j]=arr[j-1];
					  arr[j-1]=temp;
					   }
				  }
			}
		  System.out.println();
		  System.out.print("sorted array is : " );
		  for(int i=0; i<arr.length;i++) {
		  System.out.print( arr[i] + " ");
		  }
}
}
