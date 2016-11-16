/* November 15, 2016 :: 2 :: <TODO> Optimize second part
 * 
 * <Valid Anagram>  
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.

 * Note:
 * You may assume the string contains only lowercase alphabets.

 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case? 
 * */
import java.util.HashMap;
public class ValidAnagram {
	
	 static boolean isAnagram(String s, String t) {
	       
	       if(s.length()==0 && t.length()==0)
	          return true;
	       else if(s.length()==0 || t.length()==0)
	          return false;
	        
	        if(s.length()!=t.length())
	          return false;
	        
	        int i=0;
	        HashMap<Character, Integer> hm = new HashMap<>();
	        
	        while(i<s.length()){
	            if(hm.containsKey(s.charAt(i))){
	               int value = hm.get(s.charAt(i));
	               hm.put(s.charAt(i),value+1);
	            }
	            else
	              hm.put(s.charAt(i),1);
	            
	            i++;  
	        }
	        i=0;
	        while(i<t.length()){
	            if(!hm.containsKey(t.charAt(i)))
	              return false;
	            else{
	                int value = hm.get(t.charAt(i));
	                if(value==1)
	                  hm.remove(t.charAt(i));
	                else
	                  hm.put(t.charAt(i),value-1);
	            }
	        i++;    
	        }
	        
	        if(hm.isEmpty())
	          return true;
	          
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="anagram";
		String str2="nagaram";
		System.out.println("Answer : "+isAnagram(str1,str2));
	}

}
