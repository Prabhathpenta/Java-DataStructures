package dataStruct.demo;

public class bubbleSort {
	 public static void main (String [] args) {
		   
		  int nums[] = {9,5,17,3,1,13,7};
		  int temp=0;
		  
		  System.out.println("before sorting");
		  for(int num:nums) {
			  System.out.print(num + " ");
		  }
		  
		  for(int i=0; i<nums.length; i++) {
			  for(int j=0;j<nums.length-1;j++) 
				  {
				  	if(nums[j]>nums[j+1])                  //9>5, nums[j]=j[0] and nums[j+1]=j[1]
				  											//  nums[j+1]=1
				  	{
				  		temp = nums[j];						//temp=9  
				  		nums[j] = nums[j+1];	 	 		//nums[0]=>5
				  		nums[j+1] = temp;					//nums[j+1]=9
				  	}
			  }
		  }
		  
		  System.out.println();
		  System.out.println("After sorting");
		  for(int num:nums) {
			  System.out.print(num + " ");
	
}

}
}
