/* November 09, 2016 :: 2

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
 */

import java.util.Scanner;


public class ReverseVowels {

	static boolean isVowel(char ch){
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||
			ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			return true;
		}
		return false;
	}
	static String reverseVowels(String s) {
		
		int start=0, end=s.length()-1;
		char tempCh;
		
		//char[] resultStr=new char[s.length()];
		char[] resultStr = s.toCharArray();
		//char[] abc="abc";
		System.out.println("array is "+resultStr);
		while(start<end){
			if(!isVowel(resultStr[start])){
				start++;
				continue;
			}
			if(!isVowel(resultStr[end])){
				end--;
				continue;
			}
			
			tempCh = resultStr[start];
			resultStr[start]=resultStr[end];
			resultStr[end]=tempCh;
			
			start++;
			end--;
		}
		for(char ch:resultStr)
			System.out.println("output "+ch);
		String st = new String(resultStr);
		return st;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println("Reverse (vowels) string is "+reverseVowels(str));
		
		
	}

}
