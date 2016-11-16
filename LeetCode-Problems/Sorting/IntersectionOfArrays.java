/* November 15, 2016 :: 3
 * 
 * <Intersection of Two Arrays>  
 * 
 * Given two arrays, write a function to compute their intersection.

 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 * */

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays {

	static int[] intersection(int[] nums1, int[] nums2) {
	       
	       if(nums1.length==0)
	         return nums1;
	       if(nums2.length==0)
	         return nums2;
	        
	       ArrayList<Integer> result = new ArrayList<Integer>();
	       
	        //Sort the arrays
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int pre=-1;
	        int i=0,j=0,k=0;
	        while(i<nums1.length && j<nums2.length){
	            if(nums1[i]==nums2[j]){
	                
	                if(nums1[i]!=pre){
	                  result.add(nums1[i]);
	                  k++;
	                  pre=nums1[i];
	                }
	                i++;
	                j++;
	                
	            }
	            else if(nums1[i]<nums2[j]){
	                i++;
	                pre=-1;

	            }
	            else{
	                j++;
	                pre=-1;
	            }
	        }
	        int length = result.size();
	        i=0;
	        int[] finalResult = new int[length];
	        while(i<length){
	            finalResult[i]=result.get(i);
	            i++;
	        }
	        return finalResult;
	    }
	
	public static void main(String[] args) {

		int[] num1={1, 2, 2, 1};
		int[] num2={2, 2};
		int[] arr = intersection(num1,num2);
		int i = 0;
		while(i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
	}

}
