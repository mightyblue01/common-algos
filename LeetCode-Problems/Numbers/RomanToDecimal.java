/*
 * December 19:: 3 :: LeetCode 13
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.


 * 
 * 
 * 
 */



public class RomanToDecimal {

	public static int toInt(char romanChar){
		
		switch (romanChar) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
		
		}
		
		return 0;
	}
	
	public static int romanToInt(String s) {
        int result = 0,i=0;
        
        for(i=0;i<s.length()-1;i++){
        	int current = toInt(s.charAt(i));
        	int next = toInt(s.charAt(i+1));
        	
        	if(current>=next)
        		result += current;
        	else{
        		result += next - current;
        		i++;
        	}
        }
		if(i==s.length()-1){
			result += toInt(s.charAt(i));
		}
			
		return result;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputStr = "XIX";
		System.out.println(romanToInt(inputStr));
		
	}

}
