/*January 06,2017 :: 1 :: Leetcode#215
 * <<Kth Largest Element>>
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note: 
You may assume k is always valid, 1 ≤ k ≤ array's length.

 */

import java.util.PriorityQueue;

public class KthLargest {

	public static int findKthLargest(int[] nums, int k) {
	     PriorityQueue<Integer> pq = new PriorityQueue<>(k);
	     
	    for(int i=0;i<nums.length;i++){
	         pq.offer(nums[i]);
	         
	         if(pq.size()>k)
	            pq.poll();
	      }
	     
	     return pq.peek();
	    }
	public static void main(String[] args) {
		int[] n = {1};
		System.out.println(findKthLargest(n,1));

	}

}
