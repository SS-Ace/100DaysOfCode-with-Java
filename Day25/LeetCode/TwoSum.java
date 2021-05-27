import java.util.*;
public class TwoSum {
	   public static int[] twoSum(int[] nums, int target) {
	        int arr[] = new int[2];
	        
	        for(int i = 0; i <= nums.length - 2; i++){
	            for(int j = i + 1; j <= nums.length - 1; j++){
	                
	                if(nums[i] + nums[j] == target){
	                    
	                 arr[0] = i;
	                 arr[1] = j;
	                 
	                 
	                }
	            }
	        }
	    
	   
	   return arr;
	   }
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
	    System.out.println(Arrays.toString(twoSum(nums, 4)));
	    
		
		

	}

	}
