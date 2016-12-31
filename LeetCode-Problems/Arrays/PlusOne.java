/*December 20, 2016 :: 1 : Leetcode #66
 * <<Plus One>>
 * Given a non-negative number represented as an array of digits, plus one to the number.

   The digits are stored such that the most significant digit is at the head of the list.
 * 
 * 
 * 
 */


public class PlusOne {

	public static int[] plusOne(int[] digits) {
        if(digits.length==0)
          return digits;
      
        int length=digits.length;
        int i=length-1,carry=1;
        
        while(i>=0){
        	if(digits[i]+carry<=9){
        		digits[i]+=1;
        		return digits;
        	}
        	else{
        		digits[i]=0;
        		carry=1;
        	}
        	i--;
        }
        int[] newDigits = new int[length+1];
        if(carry==1){
        	newDigits[0]=1;
        	i=1;
        	while(i<newDigits.length){
        		newDigits[i]=digits[i-1];
        		i++;
        	}
        }
        return newDigits;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {8,8,7,7,8,8};
		int [] newNum = plusOne(num);
		for(int i:newNum)
			System.out.println(i);
	}

}
