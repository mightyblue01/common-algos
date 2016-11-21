import java.util.HashMap;

public class ListNode {
	int data;
	ListNode next;
	
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
	
	public void addNode(ListNode root,int data){
	  if(root==null){
		  root = new ListNode(data);
	  }
	  else{
		  if(root.next==null){
			  root.next=new ListNode(data);
		  }
		  else{
			  addNode(root.next,data);  
		  }
		  
	  }
	}
	
	public void printList(ListNode root){
		ListNode tmp=root;
		while(tmp!=null){
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
	
	//reverse the list :: Iterative
	public ListNode reverseList(ListNode root){
		
		ListNode current = root;
		ListNode prev = null;
		ListNode next = null;
		
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			
			current=next;
		}
		return prev;
	}
	
	//reverse the list :: recursive
	
	public ListNode reverseListRec(ListNode root){
		if(root==null || root.next==null)
			return root;
		
		ListNode second = root.next;
		root.next = null;
		
		ListNode restList = reverseListRec(second);
		
		second.next=root;
		return restList;
	}
	
	//swap in pairs :: recursive
	
	public ListNode swapPairsRecursive(ListNode root){
		
		ListNode temp;
		
		if(root==null || root.next==null){
			return null;
		}
		
		temp = root.next;
		root.next = root.next.next;
		temp.next = root;
		root=temp;
		
		root.next.next=swapPairs(root.next.next);
		return root;
		
	}
	
	/* November 14, 2016 :: 1
	   Merge Two Sorted Lists
	 * 
	 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing 
	 * together the nodes of the first two lists.

	 * 
	 */
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
		ListNode head=new ListNode(0);
		ListNode l3=head;
	    
	    while(l1!=null && l2!=null){
	        if(l1.data<=l2.data){
	            l3.next=l1;
	            l1=l1.next;
	        }
	        else{
	            l3.next=l2;
	            l2=l2.next;
	        }
	        l3=l3.next;
	    }
	    if(l1!=null)
	      l3.next=l1;
	    else
	      l3.next=l2;
	     
	    return head.next;    
	    }
	
	/* November 14, 2016 :: 2
	 * <<Swap Nodes in Pairs>>
	 * Given a linked list, swap every two adjacent nodes and return its head.

	 *	For example,
	 *	Given 1->2->3->4, you should return the list as 2->1->4->3.
		
	 *	Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself 
	 *	can be changed.
	 * 
	 * 
	 */
	public ListNode swapHelper(ListNode head,int k){
		ListNode pre=null,next=null,current=head;
        int count=0;
        while(count<k && current!=null){
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
            
            count++;
        }
        if(next!=null)
          head.next=swapHelper(next,2);
        
        return pre;
    }
    
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
          return head;
          
        return swapHelper(head,2);
    }
	
    /* November 14, 2016 :: 3
     * <<Reverse Nodes in k-Group>>
     * 
	 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

	 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

	 * You may not alter the values in the nodes, only nodes itself may be changed.

	 * Only constant memory is allowed.

	 * For example,
	 * Given this linked list: 1->2->3->4->5

	 * For k = 2, you should return: 2->1->4->3->5

	 * For k = 3, you should return: 3->2->1->4->5
	 * 
	 * 
	 */
public ListNode reverseKGroupHelper(ListNode head, int k) {
        
	ListNode pre=null,current=head,next=null;
        int count=0;
        while(count<k && current!=null){
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
            
            count++;
        }
          
        if(next!=null)
          head.next=reverseKGroup(next,k);
        
        return pre;
    }
    
    public ListNode reverseKGroup(ListNode head, int k){
        if(head==null || head.next==null || k==0)
          return head;
          
        ListNode current=head;
          int count=1;
          
          while(count<=k && current!=null){
              if(count%k == 0){
                 return reverseKGroupHelper(head,k); 
              }
              else {
                count++;
                current=current.next;
              }
        }
        return head;
    }
    
    /* November 14, 2016 :: 4
     * <<Remove Duplicates from Sorted List>>
     * Given a sorted linked list, delete all duplicates such that each element appear only once.

	 * For example,
	 * Given 1->1->2, return 1->2.
	 * Given 1->1->2->3->3, return 1->2->3.
     * 
	 
	 */ 
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
          return head;
        
        ListNode temp=head;
       while(head!=null && head.next!=null){
           if(head.data==head.next.data)
             head.next=head.next.next;
           else
             head = head.next;
       }
       return temp;
    }
    
    
    
    /* November 14, 2016 :: 5
     * <<Reverse Linked List>>
     * Reverse a singly linked list.
     * 
	 */ 
    public ListNode reverseListLeetCode(ListNode head) {
        if(head==null || head.next==null)
          return head;
          
        ListNode current=head,pre=null,next=null;
        
        while(current!=null){
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        return pre;
    }
    
    /* November 15, 2016 :: 1
     * <<Remove Duplicates from Sorted List II>>
     * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

	 *	For example,
	 *	Given 1->2->3->3->4->4->5, return 1->2->5.
	 *	Given 1->1->1->2->3, return 2->3.
     *
     * 
	 */ 
    
    public ListNode deleteDuplicates2(ListNode head) {
        if(head==null || head.next==null)
          return head;
        
        ListNode temp = head;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        while(temp!=null){
            if(hm.containsKey(temp.data)){
              int value = hm.get(temp.data);
              hm.put(temp.data,value+1);
            }
            else{
                hm.put(temp.data,1);
            }
            temp=temp.next;
        }
        
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        temp=head;
        while(temp!=null){
            if(hm.get(temp.data)>1)
              temp=temp.next;
            else{
              result.next=temp;
              result=result.next;
              temp=temp.next;
        }
      }
      result.next=null;
      
      return dummy.next;
    }
    
    /* November 16, 2016 :: 1
     * <<Linked List Cycle>>
     * Given a linked list, determine if it has a cycle in it.
	 */   
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
          return false;
        ListNode fast=head.next,slow=head;
        
        while(fast!=null && fast.next!=null){
            if(fast==slow)
              return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return false;
    }
    
    
	//
	public ListNode swapPairsIterative(ListNode root,int k){
		
		ListNode pre=null,next=null,current=root;
		
		int count=0;
		while(count<k && current!=null){
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;
			
			count++;
		}
		if(next!=null)
			root.next=swapPairsIterative(next,k);
		
		return pre;
	}

}
