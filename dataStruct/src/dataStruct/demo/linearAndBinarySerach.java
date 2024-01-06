package dataStruct.demo;

public class linearAndBinarySerach {
  public static void main (String [] args) {
	   
	  int nums[] = {3,5,7,9,11,13,17};
	  int target =11;
	  
	 // int result= linearSerach(nums, target);
	  int result= binarySearch(nums, target);
	  
	  if(result!=-1)
	  System.out.println("target is found at : index "  + result);
	  else
		  System.out.println("target not found ");
  }


private static int linearSerach(int[] nums, int target) {
	
	//for using simple loop method for finding target
	for(int i=0;i<nums.length;i++)
		if(nums[i] == target)
			return i;
	
	return -1;
}

private static int binarySearch(int[] nums, int target) {
	int left =0;
	int right = nums.length-1;
	
	while (left<=right) {
		int mid=(left+right)/2;      //mid is a index value
		
		if(nums[mid] == target) {
			return mid;
		}
			else if (nums[mid] <= target ) {
			left = mid +1;
			}
			else 
				right = mid -1;
			
		}
	
	return -1;
}


}
