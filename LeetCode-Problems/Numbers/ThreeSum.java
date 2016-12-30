/*December 20, 2016 :: 1 : Leetcode # 15
 * 
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ThreeSum {

	 public static List<List<Integer>> threeSum(int[] nums) {
	        
	       List<List<Integer>> result = new ArrayList<>();
		   Set<List<Integer>> tSet = new HashSet<>();

	        if(nums.length<3)
	            return result;
	            
	        Arrays.sort(nums);
	        
			List<Integer> list = new ArrayList<>();
			
			for(int i=0;i<nums.length-2;i++){
				
				int start=i+1,end=nums.length-1;
				while(start<end){
					if(nums[i]+nums[start]+nums[end]==0){
						list.add(nums[i]);
						list.add(nums[start]);
						list.add(nums[end]);
						
						List<Integer> tmpList = new ArrayList<>(list);

						//result.add(tmpList);
						tSet.add(tmpList);
						list.clear();
						
						start++;
						end--;
					}
					else if(nums[i]+nums[start]+nums[end]<0){
						start++;
					}
					else{
						end--;
					}
				}
			}
			result.addAll(tSet);
			return result;
	    }
	 
	public static void main(String[] args) {
		
		int[] arr = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> lst = threeSum(arr);
		
		for(List l:lst)
			System.out.println(l);

	}

}
