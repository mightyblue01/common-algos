/* November 07, 2016 :: O(n2) :: TODO Bring it down to O(n).
 * 
 * <Implement strStr()>  

	Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * */



import java.util.Scanner;

public class strstr {

	
	static int performStrStr(String a,String b){
		
		int i=0;
		int j=0;
		while(i<a.length()-b.length()){
			
			while(j<b.length()){
				if(a.charAt(i+j)!=b.charAt(j))
					break;
				if(j==b.length()-1){
					return i;	
				}
				j++;
			}
			i++;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String mainString = scan.next();
		String subString = scan.next();
		
		System.out.println(performStrStr(mainString,subString));
	}

}
