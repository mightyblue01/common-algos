/*
 * December 19:: 2 :: LeetCode 07
 * Reverse Integer
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

 * 
 * 
 * 
 */


public class ReverseInteger {

	
	
	
	public static int reverseInt(int x){
		
		 if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE)
	            return 0;
	    
	       int num = Math.abs(x);
	       String result = "";
	       int resultNumber = 0;
	       
	       if (x==0)
	         return 0;
	         
	       while(num!=0){
	            result += num%10;
	            num /= 10;
	       }
	       
	       try{
	        resultNumber = Integer.parseInt(result);
	       }
	       catch (Exception e){
	           return 0;
	       }
	       if(x<0)
	         resultNumber = 0 - resultNumber;
	       
	       return resultNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 153423646;
		
		System.out.println(reverseInt(number));
	}

}
