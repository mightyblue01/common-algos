/* November 10, 2016 :: 1  :: <TODO> Optimize to O(n)

 Longest Substring Without Repeating Characters  
 Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is 
a subsequence and not a substring.
 */


import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringNonRepeating {

	
	//** Time complexity ~ O(n2) ; space O(n)
	static int lengthOfLongestSubstring(String s) {
	
		int max=0,start=0,i=0;
		HashSet<Character> hs = new HashSet<>();
		
		while(i<s.length()){
			if(!hs.contains(s.charAt(i))){
				hs.add(s.charAt(i));
				if(max<hs.size())
					max++;
			}
			else{
				while(s.charAt(start)!=s.charAt(i)){
					hs.remove(s.charAt(start));
					start++;
				}
				start++;
			}
			i++;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		
		System.out.println("Length is "+lengthOfLongestSubstring(inputStr));
	}

}
