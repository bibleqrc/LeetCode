package medium;

public class Insertion_Sort_List {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	 public ListNode insertionSortList(ListNode head) {
	     if(head==null) return null;
	     ListNode helper = new ListNode(0);
	     ListNode pre = helper;
	     ListNode curr = head;
	     while(curr!=null){
	    	 ListNode next = curr.next;
	    	 pre = helper;
	    	 while(pre.next!=null&&pre.next.val<=curr.val){
	    		 pre = pre.next;
	    	 }
	    	 curr.next = pre.next;
	    	 pre.next=curr;
	    	 curr = next;
	     }
	     
	     return helper.next;
	 }
}
