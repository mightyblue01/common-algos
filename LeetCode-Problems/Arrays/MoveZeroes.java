import java.util.HashMap;

/* October 19, 2016 :: 3
 * 
 * <Majority Element>  
	
	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
	
	Note:
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
 * */

public class MoveZeroes {

public static void moveZeroes(int[] nums) {
        
        if(nums.length<=0)
          return;
          
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]==0){
              i++;
            }
            else{
                nums[j]=nums[i];
                i++;
                j++;
            }
        }
        while(j<nums.length){
          nums[j]=0;
          j++;
        }
        i=0;
        while(i<nums.length){
        	System.out.println(nums[i]);
        	i++;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] elements = {6,6,0,5,0,7,6,8,6};
		moveZeroes(elements);
		
	}

}
