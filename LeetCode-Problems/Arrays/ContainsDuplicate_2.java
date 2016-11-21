import java.util.HashMap;

/* November 19, 2016 :: 4
 * 
 * <Contains Duplicate II>  
	
	Given an array of integers and an integer k, find out whether there are two distinct 
	indices i and j in the array such that nums[i] = nums[j] and the difference between 
	i and j is at most k.
 * */
public class ContainsDuplicate_2 {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=1 || k==0)
          return false;
        int i=0;
        HashMap<Integer,Integer> hm = new HashMap();
        
        while(i<nums.length){
            if(hm.containsKey(nums[i])){
                if(i-hm.get(nums[i])<=k)
                  return true;
                hm.put(nums[i],i);
            }
            else{
                hm.put(nums[i],i);
            }
            i++;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,1};
		System.out.println("Result is "+containsNearbyDuplicate(arr,5));
	}

}
