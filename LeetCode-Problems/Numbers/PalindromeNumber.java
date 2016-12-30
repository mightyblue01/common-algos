/* December 19, 2016 :: 4 : Leetcode 09
 * <<Palindrome Integer>> 
 * Determine whether an integer is a palindrome. Do this without extra space.
*/


public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
	
        int lastDigit=0;
        int numZeros=0;
        int inputNum =x;
        
        while(inputNum!=0){
        	inputNum = inputNum/10;
        	if(inputNum!=0)
        		numZeros++;
        }
        
        
        if(numZeros==0)
        	return true;
        
        while(x!=0){
            int last = x%10;
            int first = (int) (x/(Math.pow(10, numZeros)));
            x =(int) (x%(Math.pow(10, numZeros)));
            x /=10;
            
            if(first!=last)
            	return false;
            
            numZeros -=2;
        }
           
        return true;
      }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 454454;
		System.out.println(isPalindrome(number));
		//System.out.println(isPalindrome(number));
	}

}
