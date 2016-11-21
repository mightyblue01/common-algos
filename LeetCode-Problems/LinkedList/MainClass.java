
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode lst = new ListNode(1);
		lst.addNode(lst, 2);
		//lst.addNode(lst, 3);
		//lst.addNode(lst, 4);
		//lst.addNode(lst, 5);
		//lst.addNode(lst, 6);
		//lst.addNode(lst, 7);
		
		lst.printList(lst);
		//lst=lst.reverseListRec(lst);
		//lst.printList(lst);
		//lst=lst.swapPairs(lst);
		lst=lst.swapPairsIterative(lst, 3);
		lst.printList(lst);
	}

}
