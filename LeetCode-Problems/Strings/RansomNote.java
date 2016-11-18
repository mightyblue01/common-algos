
/* October 21, 2016 :: 
 * 
 * <Ransom Note>  
	Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
	
	Each letter in the magazine string can only be used once in your ransom note.
	
	Note:
	You may assume that both strings contain only lowercase letters.
	
	canConstruct("a", "b") -> false
	canConstruct("aa", "ab") -> false
	canConstruct("aa", "aab") -> true
 * */

import java.util.Scanner;


public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())
         return false;
       StringBuilder sb = new StringBuilder(magazine);
       for(int i=0;i<ransomNote.toCharArray().length;i++){
           int indx = sb.indexOf(Character.toString(ransomNote.charAt(i)));
           if(indx==-1)
             return false;
           else
             sb.deleteCharAt(indx);
       }
       return true;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ransomNote,magazineContent;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ransom note string");
		ransomNote = scan.nextLine();
		System.out.println("Enter the magazine string ");
		magazineContent = scan.next();
		System.out.println("Result is : "+canConstruct(ransomNote,magazineContent));
		
	}

}
