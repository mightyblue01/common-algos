/* November 18, 2016 :: 1
 * 
 * <Merge Sorted Array>  
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

  Note:
  You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional 
  elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 * */
public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==0 || nums2.length==0)
          return;
        if(nums2.length==0)
          return;
          
        int[] temp = new int[m+n];
        int i=0,j=0,k=0;
        
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                i++;
                k++;
            }
            else{
                temp[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            temp[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            temp[k]=nums2[j];
            j++;
            k++;
        }
        i=0;
        while(i<temp.length){
          nums1[i]=temp[i];
          i++;
        }
        
        i=0;
        while(i<nums1.length){
            System.out.println(nums1[i]);
            i++;
          }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1={1,2,3,0,0,0};
		int[] num2={2,5,6};
		merge(num1,3,num2,3);
	}

}
