/* November 18, 2016 :: 2 :: Leetcode#26
 *<<Remove Duplicates from Sorted Array>>
 *Given a sorted array, remove the duplicates in place such that each element appear only 
 *once and return the new length.

  Do not allocate extra space for another array, you must do this in place with constant 
  memory.

	For example,
	Given input array nums = [1,1,2],

	Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 * 
 * 
 * 
 * */
 
public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
        if(nums.length<=1)
          return nums.length;
        
        int i=1,j=0;
        while(i<nums.length){
            if(nums[i]==nums[j])
              i++;
            else{
                j++;
                nums[j]=nums[i];
                i++;
            }
        }
        return j+1;
    }
	
	public static void main(String[] args) {
	
		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));

	}

}
