/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Remove_Linked_List_Elements {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }

	 public ListNode removeElements(ListNode head, int val) {
		 ListNode res = new ListNode(0);
		 res.next = head;
		 ListNode point = head,pre=res;
		 
		 while(point!=null){
			 if(point.val==val){
				 if(point.next!=null){
					 point.val=point.next.val;
					 point.next = point.next.next;
				 }else{
					 point = null;
					 pre.next=null;
				 }
			 }else{
				 point=point.next;
				 pre=pre.next;
			 }
		 }
		 return res.next;
	 }
}
