/* November 18, 2016 :: 2
 * 
 * <Pascal's Triangle>  
	Given numRows, generate the first numRows of Pascal's triangle.
	
	For example, given numRows = 5,
	Return
	
	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class PascalTriangle {

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lst = new ArrayList();
      	ArrayList<Integer> al = new ArrayList<Integer>();
      	if(numRows==0)
      	  return lst;
      	if(numRows==1)
      	  al.add(1);
        
        int i=0,j=0;
        while(i<numRows){
          	ArrayList<Integer> temp = new ArrayList<Integer>();

        	while(j<=i){
        		if((i==j)||(j==0)){
        			temp.add(1);
        		}
        		else{
        			temp.add(al.get(j-1)+al.get(j));
        		}
        	j++;		
        	}
        	al=temp;
        	lst.add(al);
        	j=0;
        	i++;
        }
       
		return lst;  
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		List<List<Integer>> pascalTri = generate(n);
		for(List<Integer> lst:pascalTri){
			System.out.println("Level::");
			for(int i : lst)
				System.out.println(i);
		}
	}

}
