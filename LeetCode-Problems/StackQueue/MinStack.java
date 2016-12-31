/* 25 December 2016 :: Leetcode#155
 * Design a stack that supports push, pop, top, and retrieving the minimum 
 * element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 * 
 * 
 */

package stack;
import java.util.Stack;

public class MinStack {

	private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
         mainStack = new Stack<Integer>();
         minStack = new Stack<Integer>();
    }
    
    public void push(int x) {
       
        if(mainStack.isEmpty()){
            mainStack.push(x);
            minStack.push(x);
            return;
        }
        
        mainStack.push(x);
        int min = minStack.peek();
        if(min>x)
            minStack.push(x);
        else
            minStack.push(min);
    }
    
    public void pop() {
        if(mainStack.isEmpty())
            return;
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        if(mainStack.isEmpty())
            return Integer.MIN_VALUE;
        return mainStack.peek();
    }
    
    public int getMin() {
        if(mainStack.isEmpty())
            return Integer.MIN_VALUE;
        return minStack.peek();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin();  
		minStack.pop();
		minStack.top();     
		System.out.println(minStack.getMin());   
	}

}
