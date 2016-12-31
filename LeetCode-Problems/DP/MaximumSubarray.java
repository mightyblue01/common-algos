/* 20 November 2016 :: Leetcode#53
 * 
 * <<Maximum Subarray>>
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 * 
 */
public class MaximumSubarray {

	public static int maxSubArray(int[] nums) {
        //int i=0,curr_max=0,max=0;
        if(nums.length == 1)
          return nums[0];
        int i=1,curr_max=nums[0],max=nums[0];
        
        while(i<nums.length){
            curr_max = Math.max(nums[i],curr_max+nums[i]);
            max=Math.max(curr_max,max);
            
            i++;
        }
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

}
