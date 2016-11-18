
/* November 07, 2016 :: 
 * 
 * <Valid Parentheses>  
	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	
	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * */

import java.util.Stack;

public class ValidParenthesis {

	public static boolean isValid(String s) {
	    
	       if(s.length()<2)
	         return false;
	       
	       Stack<Character> stk = new Stack<Character>();
	       int i=0;
	       while(i<s.length()){
	           char entry = s.charAt(i);
	           if(entry == '(' || entry == '{' || entry == '['){
	               stk.push(entry);
	           }
	           if(entry == ')' || entry == '}' || entry ==']'){
	               if(stk.isEmpty())
	                 return false;
	            //Check the top of stack
	            char previous = stk.peek();
	            if(previous=='(' && entry ==')' || previous=='{' && entry =='}' || previous=='[' && entry ==']')
	              stk.pop();
	            else
	              return false;
	           }
	           i++;
	       }
	    return stk.isEmpty();    
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr = "()[]{}";
		System.out.println("Valid = "+isValid(inputStr));
		
	}

}
