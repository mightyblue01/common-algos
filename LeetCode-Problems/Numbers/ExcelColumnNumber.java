/*January 04,2017 :: 1 :: Leetcode#171
 * <<Excel Sheet Column Number>>

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 

 */


import java.util.Arrays;

public class ExcelColumnNumber {

	public static int titleToNumber(String s) {
		
/*		//3ms solution
 		int num=0;
		for(int i=s.length()-1;i>=0;i--){
			
			num += (s.charAt(i)-'A'+1)*Math.pow(26, s.length()-1-i);
			
		}
		*/
		
		//4ms solution
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		int num=0;
		for(int i=0;i<sb.length();i++){
			num += (sb.charAt(i)-'A'+1) * Math.pow(26, i);
		}
		return num;
    }
	
	
	public static void main(String[] args) {
		String st = "AB";
		System.out.println(titleToNumber(st));

	}

}
