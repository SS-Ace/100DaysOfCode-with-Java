public class Maximum_sub_array_sum {
	
	    public static int maxSubArray(int[] nums) {
	        
			int maxsofar = Integer.MIN_VALUE;
	        int maxending = 0;

			for (int i = 0; i < nums.length ; i++)
			{
				 maxending =  maxending + nums[i];
				if (maxsofar <  maxending){
					maxsofar =  maxending;
	            }
				if ( maxending < 0){
					 maxending = 0;
	            }
			}
			return maxsofar;
		}
	}


