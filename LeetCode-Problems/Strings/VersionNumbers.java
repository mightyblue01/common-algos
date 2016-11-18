
/* November 09, 2016 :: 1
 
 Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
  
 */

import java.util.Scanner;

public class VersionNumbers {

	static int compareVersion(String version1, String version2) {
		
		if(version1.length()==0 || version2.length()==0)
		      return 0;
		        
		    String[] versionArray1 = version1.split("\\.");
		    String[] versionArray2 = version2.split("\\.");
		    
		    int i=0;
		    while(i<versionArray1.length && i<versionArray2.length){
		        if(Integer.parseInt(versionArray1[i])>Integer.parseInt(versionArray2[i]))
		          return 1;
		        else if(Integer.parseInt(versionArray1[i])<Integer.parseInt(versionArray2[i]))
		          return -1;
		        else{
		             i++;
		             continue;
		        }
		    }
		 
		    while(i<versionArray1.length){
		        if(Integer.parseInt(versionArray1[i])>0)
		          return 1;
		        
		        i++;  
		    }
		    while(i<versionArray2.length){
		        if(Integer.parseInt(versionArray2[i])>0)
		          return -1;
		          
		        i++;
		    }
		          
		    return 0;
		  }	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the version strings one by one");
		String version1 = scan.nextLine();
		String version2 = scan.nextLine();
		
		System.out.println("Result = "+compareVersion(version1,version2));
		
		
		
	}

}

