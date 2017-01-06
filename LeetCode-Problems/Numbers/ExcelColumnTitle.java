/* January 05,2017 :: 1 :: Leetcode#171
 * <<Excel sheet column title>>
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

 * 
 * 
 * 
 */


public class ExcelColumnTitle {

	public static String convertToTitle(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		while(n>0){
			n--;
			char div = (char)(n%26+'A');
			sb.append(div);
			n /=26;
		}
		
		
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		int n = 52;
		
		System.out.println(convertToTitle(n));

	}

}
