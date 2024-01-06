package dataStruct.demo;

public class SelectionSort {
	 public static void main (String [] args) {
		   
		  int nums[] = {9,5,17,3,1,7,13};
		  int temp=0;
		  int minIndex=-1;
		  
		  System.out.println("before sorting");
		  for(int num:nums) {
			  System.out.print(num + " ");
		  }
		  System.out.println();
		  
		  for(int i=0; i<nums.length-1; i++)       //i=0; i=5
		  {
			  minIndex=i;                             //'minIndex=0' then i=0;            (now minIndex=1 then i=0
			  for(int j=i+1;j<nums.length;j++)        //j=0+1=>j=[1], upto j=6						j=1+1=2 j=2
				  {
				  	if(nums[minIndex]>nums[j])        // nums[0]>nums[1] => 9>5					nums[1]>nums[2]=> 5>17 .....false
				  								
				  		minIndex =j;            	  //'minIndex= 1'      
				  }
				  	
				  		temp = nums[minIndex];	                                         //temp=nums[1]=5    temp=5					
				  		nums[minIndex] = nums[i];	 									 // nums[1]=nums[0]   nums[1]=9
				  		nums[i] = temp;													//                   nums[0]=5
				  		
				  	  for(int num:nums) {
						  System.out.print(num + " ");            
				  	}
			  

	  
		  System.out.println();
		  }
		  System.out.println();
		  System.out.println("After sorting");
		  for(int num:nums) {
			  System.out.print(num + " ");
	
}

}

	 }

