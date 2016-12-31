/* December 20, 2016 :: 1 :: Leetcode#88
 * 
 * <Merge Sorted Array>  
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

  Note:
  You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional 
  elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 * */
public class MergeSortedArrayBetter {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       if(nums1.length==0 || nums2.length==0)
	           return;
	         int k = m+n-1;
	         m=m-1;
	         n=n-1;
	         while(m>=0 && n>=0){
	         	if(nums1[m]>nums2[n]){
	         		nums1[k]=nums1[m];
	         		m--;        	}
	         	else{
	         		nums1[k]=nums2[n];
	         		n--;
	         	}
	         	k--;
	         }
	         
	         while(m>=0){
	         	nums1[k]=nums1[m];
	         	m--;
	         	k--;
	         }
	         while(n>=0){
	         	nums1[k]=nums2[n];
	         	n--;
	         	k--;
	         }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1={1,2,3,0,0,0};
		int[] num2={2,5,6};
		merge(num1,3,num2,3);
		for(int i=0;i<num1.length;i++)
			System.out.println(num1[i]);
	}

}
