/*December 30, 2016 :: 1 : Leetcode #70
 * <<Climbing Stairs>>
 * You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways 
can you climb to the top?
 * 
 * 
 */

import java.util.HashMap;

public class ClimbingStairs {

	public static int climbStairs(int n) {
        
	      int num=0;
	      HashMap<Integer,Integer> hm = new HashMap();
	   
	      if(n<=1)
	         return 1;
	     
	         hm.put(0,1);
	         hm.put(1,1);
	         int i=2;
	         while(i<=n){
	           num=hm.get(i-1)+hm.get(i-2);
	           hm.put(i,num);
	           i++;
	         }
	    /*
	      if(!hm.containsKey(n)){
	        num=climbStairs(n-1)+climbStairs(n-2);
	        hm.put(n,num);
	      }
	      else{
	          num=hm.get(n);
	           
	      }
	      */
	      return num;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;
		System.out.println(climbStairs(n));
	}

}
