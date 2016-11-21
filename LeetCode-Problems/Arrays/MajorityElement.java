import java.util.HashMap;

/* October 19, 2016 :: 3
 * 
 * <Majority Element>  
	
	Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 * */

public class MajorityElement {

	public static int majorityElement(int[] nums) {
        int i=0,value=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        if(nums.length<=2)
          return nums[0];
          
        while(i<nums.length){
            if(hm.containsKey(nums[i])){
              value=hm.get(nums[i]);
              value++;
              hm.put(nums[i],value);
              if(value>nums.length/2)
                return nums[i];
            }
            else{
                hm.put(nums[i],1);
            }
        
            i++;
        }
    return -1;   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] elements = {6,6,5,5,6,7,6,8,6};
		System.out.println(majorityElement(elements));
		
	}

}
