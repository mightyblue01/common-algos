/*January 05,2017 :: 1 :: HackerRank
 * <<Sorting>>
 * 
 * 
 */
import java.util.Scanner;

public class IntroSorting {
	public static int searchElement(int[] array,int num){
	    
		int low=0,high=array.length-1;
        int mid = 0;
        
        while(low<=high){
            mid = low+(high-low)/2;
            if(array[mid]==num)
                return mid;
            else if(array[mid]>num){
              high=mid-1;
            }
            else if(array[mid]<num){
                low=mid+1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       int len = scan.nextInt();
       int[] array = new int[len];
        
       for(int i=0;i<len;i++){
           array[i]=scan.nextInt();
       }
        
       System.out.println(searchElement(array,num)); 
    }

}
