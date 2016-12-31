/* December 30, 2016 :: 1 : Leetcode #61
 * <<Rotate List>>
 * Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
 * 
 * 
 */


public class RotateList {

	 public static ListNode rotateRight(ListNode head, int k) {
		 if(head==null)
	          return null;
	        else if(head.next==null || k==0)
	          return head;
	        
	        ListNode slow=head,fast=head;
	        int count=0;
	        
	        while(count<k){
	            fast=fast.next;
	            if(fast==null){
	                fast=head;
	                k=k%(count+1);
	                count=-1;
	            }
	            count++;
	        }
	        
	        while(fast.next!=null){
	            slow=slow.next;
	            fast=fast.next;
	        }
	        fast.next=head;
	        head=slow.next;
	        slow.next=null;
	        
	        return head;
	    }
	 
	public static void main(String[] args) {
		ListNode lst = new ListNode(1);
		lst.addNode(lst, 2);
		lst.addNode(lst, 3);
		lst.addNode(lst, 4);
		lst.addNode(lst, 5);
		lst.addNode(lst, 6);
		
		lst.printList(lst);
		System.out.println("----");
		lst = rotateRight(lst,2);
		lst.printList(lst);

	}

}
