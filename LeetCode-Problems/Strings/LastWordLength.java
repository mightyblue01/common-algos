
/* November 08, 2016
 * <Length of Last Word>
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
		*/

import java.util.Scanner;

public class LastWordLength {

	static int wordLength(String tempStr){
		  char[] str = tempStr.toCharArray();
		     int i=0,count=0;
		     char previous='c';
		     while(i<str.length){
		         if(str[i]==' ')
		           previous=' ';
		         else if(previous==' '){
		           count=0;
		           previous='c';
		         }
		           
		         if(str[i]!=' ')  
		           count++;
		           
		         i++;
		     }
		     return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		System.out.println("Length is "+wordLength(str));
	}

}
