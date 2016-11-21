/* November 19, 2016 :: 1
 * 
 * <Pascal's Triangle II>  
	
	Given an index k, return the kth row of the Pascal's triangle.
	
	For example, given k = 3,
	Return [1,3,3,1].
	
	Note:
	Could you optimize your algorithm to use only O(k) extra space?
 * */


import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
	
	public static List<Integer> getRow(int rowIndex){
	List<Integer> lst = new ArrayList<Integer>();
    rowIndex+=1;
    if(rowIndex==1){
    	lst.add(1);
    	return lst;
    }
    lst.add(1);
    
    int i=1,j=0;
    while(i<rowIndex){
    	while(j<i){
    		if(j==0 || j==i)
    			lst.add(1);
    		else{
    	    lst.set(j,lst.get(j)+lst.get(j-1));	
        		
        	}
    		j++;	
    	}
    	j=0;
    	i++;
    }
    return lst;  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		
		List<Integer> pascalTri = getRow(n);
		for(int i:pascalTri)
			System.out.println(i);
	}
}