/* November 08, 2016
 Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */




import java.util.Scanner;

public class AddBinary {

	static int[] addSingleDigit(char a,char b,int carry){
		int[] res={0,0};
		
		int tmp = Character.getNumericValue(a)+Character.getNumericValue(b)+carry;
		//char tmp = a+b+1;
		//int tmp = a+b+carry;
		if(tmp==0 || tmp==1){
			res[0]=(char)tmp;
			res[1]=0;
		}
		else if(tmp==2){
			res[0]=0;
			res[1]=1;
		}
		else if(tmp==3){
			res[0]=1;
			res[1]=1;
		}
		
		return res;
	}
	
	static public String addBinary(String a, String b) {
		int i=a.length()-1,j=b.length()-1;
		String result="";
		int carry=0;
		int[] res;
		
		while(i>=0 && j>=0){
		
		res = addSingleDigit(a.charAt(i),b.charAt(j),carry);
		result+=res[0];
		carry=res[1];
		System.out.println("so far sum "+res[0]+" and carry"+carry);
		i--;
		j--;
		}
		if(i<0){
			while(j>=0){
				res = addSingleDigit('0',b.charAt(j),carry);
				result+=res[0];
				carry=res[1];
				
				j--;
			}
		}
		else if(j<0){
			while(i>=0){
				res = addSingleDigit(a.charAt(i),'0',carry);
				result+=res[0];
				carry=res[1];
				
				i--;
			}
		}
		
		if(carry==1)
			result+=carry;
		
		String finalResult="";
		for(int k=result.length()-1;k>=0;k--){
			finalResult+=result.charAt(k);
		}
		return finalResult;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		String num1 = scan.nextLine();
		String num2 = scan.nextLine();
	    System.out.println("Sum is "+addBinary(num1,num2));
	}

}

