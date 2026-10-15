package com.arrays;

public class RemoceDuplicates {

	public static int removeDuplicates(int[] nums)     
    {    
        int n=nums.length;    
        if (n==0)     
        {    
            return 0;     
        }    
        int nextUnique=1;     
        // Pointer to track the position of the next unique element    
        // Traverse the array starting from the second element    
        for (int current=1;current<n;current++)     
        {    
            // Compare the current element with the element at the next unique - 1    
            if (nums[current]!=nums[nextUnique-1])     
            {    
   nums[nextUnique]=nums[current]; // Assign current element to nextUnique position    
                nextUnique++; // Increment nextUnique    
            }    
        }    
        return nextUnique;     
    }    
	
	 public static void main(String[] args) {
		
		 int[] nums={1,1,2,2,3,4,4,5};    
	        int length=removeDuplicates(nums);    
	        System.out.print("Modified Array: ");    
	        for (int i=0;i<length;i++)     
	        {    
	            System.out.print(nums[i]+" ");    
	        }
	}
	
}
