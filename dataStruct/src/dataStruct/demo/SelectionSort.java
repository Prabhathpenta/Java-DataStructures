package dataStruct.demo;

public class SelectionSort {
	 public static void main (String [] args) {
		   
		  int arr[] = {9,5,17,3,1,7,13};
		  int temp=0;
		  int minIndex;
		  
		  System.out.print("before sorting :");
		  for(int num:arr) {
			  System.out.print(num + " ");
		  }
		  
		  for(int i=0; i<arr.length-1; i++)       //i=0; i=5
		  {
			  minIndex=i;                             //'minIndex=0' then i=0;            (now minIndex=1 then i=0
			  for(int j=i+1;j<arr.length;j++)        //j=0+1=>j=[1], upto j=6						j=1+1=2 j=2
				  {
				  	if(arr[minIndex]>arr[j])        // nums[0]>nums[1] => 9>5					nums[1]>nums[2]=> 5>17 .....false
				  								
				  		minIndex =j;            	  //'minIndex= 1'      
				  }
				  	
				  		temp = arr[minIndex];	                                         //temp=nums[1]=5    temp=5					
				  		arr[minIndex] = arr[i];	 									 // nums[1]=nums[0]   nums[1]=9
				  		arr[i] = temp;													//                   nums[0]=5
				  		
			 
		  }
		  System.out.println();
		  System.out.print("After sorting:");
		  for(int num:arr) {
			  System.out.print(num + " ");
	
}

}

	 }
