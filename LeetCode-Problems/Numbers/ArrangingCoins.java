/*January 04,2017 :: 1 :: Leetcode#441
 * <<Arranging Coins>>

Arranging Coins   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 11980
Total Submissions: 33392
Difficulty: Easy
Contributors: Admin
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.

 */

public class ArrangingCoins {

	
	
	public static void main(String[] args) {
	int n = 5;
	int remaining = 0;
	int count = 1;
	
	while(n>=0){
		n = n - count; 
		if(n==0)
			break;
		else if(n<0){
			count--;
			break;
	}
		count++;
	}
	System.out.println(count);

	}

}
