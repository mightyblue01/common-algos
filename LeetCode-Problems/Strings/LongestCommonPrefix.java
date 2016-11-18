
/* November 07, 2016 :: 
 * 
 * <Longest Common Prefix>  
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * */


public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
	     if(strs.length==0)
	       return "";
	     else if(strs.length==1)
	       return strs[0];
	       
	     String common=strs[0];
	     int i=1;
	     
	     while(i<strs.length){
	        if(strs[i].equals("")||common.equals(""))
	          return "";
	        common=compare(common,strs[i]); 
	         
	         i++;
	     }
	     return common.toString();    
	    }
	    
	    static String compare(String str1,String str2){
	     int i=0;
	 
	     String common="";
	     
	     while(i<str1.length() && i<str2.length()){
	    	   if(str1.charAt(i)==str2.charAt(i))
	             common+=str1.charAt(i);
	    	   i++;
	     }
	     return common.toString();
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs={"helloarmy","hellwasthat","helmet","helloween"};
		System.out.println("LCS IS "+longestCommonPrefix(strs));
		}
	}



	