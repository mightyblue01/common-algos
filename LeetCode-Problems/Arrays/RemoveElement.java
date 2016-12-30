/* November 18, 2016 :: 2 :: Leetcode#26
 *<<Remove Element>>
 *Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 * 
 * 
 * */
public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
        if(nums.length==0)
          return nums.length;
        if(nums.length==1 && val==nums[0])
          return 0;
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]==val){
                i++;
            }
            else{
                nums[j]=nums[i];
                j++;
                i++;
            }
              
        }
        return j;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {3,2,2,3};
		int val = 3;
		
		System.out.println(removeElement(array,val));
	}

}
