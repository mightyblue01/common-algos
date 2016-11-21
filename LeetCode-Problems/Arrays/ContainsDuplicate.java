/* November 19, 2016 :: 3
 * 
 * <Contains Duplicate>  
	
	Given an array of integers, find if the array contains any duplicates. Your function 
	should return true if any value appears at least twice in the array, and it should 
	return false if every element is distinct.
 * */



import java.util.HashSet;

public class ContainsDuplicate {

	
   public static boolean containsDuplicate(int[] nums) {
	        if(nums.length<=0)
	          return false;
	        HashSet<Integer> hs = new HashSet();
	        int i=0;
	        while(i<nums.length){
	            if(hs.contains(nums[i]))
	              return true;
	            else{
	                hs.add(nums[i]);
	            }
	            i++;
	        }
	        return false;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,1};
		System.out.println("Result is "+containsDuplicate(arr));
	}

}
