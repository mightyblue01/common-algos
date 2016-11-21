/* November 19, 2016 :: 2
 * 
 * <Rotate Array>  
	Rotate an array of n elements to the right by k steps.

	For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
	
	Note:
	Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
	
	[show hint]
	
	Hint:
	Could you do it in-place with O(1) extra space?
 * */

  
public class RotateArray {

	public static void reverseArray(int[] nums,int start,int end){
		
		while(start<end){
			int temp = nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static void rotateBetter(int[] nums, int k) {
		if(k>nums.length)
			k=k%nums.length;
		
		//Reverse both the parts of array
		reverseArray(nums,0,nums.length-k-1);
		reverseArray(nums,nums.length-k,nums.length-1);
		reverseArray(nums,0,nums.length-1);
		
		int i=0;
		while(i<nums.length){
			System.out.println(nums[i]);
			i++;
		}
			
	}
	
	//TC O(n) and SC O(n)
	public static void rotate(int[] nums, int k) {
		if(k>nums.length)
			k=k%nums.length;
		int[] newArr = new int[nums.length];
		
		int i=nums.length-k,j=0;
		while(i<nums.length){
			newArr[j]=nums[i];
			i++;
			j++;
		}
		
		i=0;
		while(i<nums.length-k){
			newArr[j]=nums[i];
			i++;
			j++;
		}
	
		j=0;
		while(j<newArr.length){
			System.out.println(newArr[j]);
		    j++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,7};
		rotateBetter(nums,3);
		

	}

}
