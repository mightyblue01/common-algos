/* November 08, 2016
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

*/
import java.util.Scanner;

public class Palindrome {

	static boolean checkSpecialCharacter(char ch){
		if((ch<=57 && ch>=48)||(ch>96 && ch<123))
			return false;
		else
			return true;
	}
	static boolean CheckPalindrome(String str){
		int start=0,end=str.length()-1;
	while(start<=end){
			
			while(checkSpecialCharacter(str.charAt(start))&&start<end){
			    System.out.println("start comparison");

				start++;
			}
			while(checkSpecialCharacter(str.charAt(end))&&start<end){
			    System.out.println("end comparison");

				end--;
			}
			
			if(start==end){
			    System.out.println("start=end comparison");
				return true;
			}
			
			if(str.charAt(start)!=str.charAt(end))
				return false;
			
			start++;
			end--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = scan.nextLine();
		String newStr = str.toLowerCase();
		
		if(CheckPalindrome(newStr))
			System.out.println("Valid palindrome");
		else
			System.out.println("NOT a valid palindrome");
	}

}
