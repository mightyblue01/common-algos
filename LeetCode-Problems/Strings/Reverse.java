/* November 09, 2016 :: 1
<Reverse string>
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */



import java.util.Scanner;

public class Reverse {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.print("Enter a string to be reversed ");
		Scanner ss = new Scanner(System.in);
		String myString = ss.nextLine();
		
		Integer i = Integer.parseInt(myString);
		System.out.println(i+2);
		String h1 = Integer.toString(4);
		System.out.println(h1);
		//Reverse(myString);
	}

	private static void Reverse(String myString) {
		// TODO Auto-generated method stub
		if(myString.length()==0)
			return;
		Reverse(myString.substring(1));
		System.out.println(myString.charAt(0));
		
	}

}
