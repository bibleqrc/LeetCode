/*19. Remove Nth Node From End of List   My Submissions QuestionEditorial Solution
Total Accepted: 108360 Total Submissions: 365747 Difficulty: Easy
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.

Subscribe to see which companies asked this question

Show Tags

 * 
 */
package easy;

public class Remove_Nth_Node_From_End_of_List {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }   
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
	  if(head==null) return head;
	  ListNode Nhead = head;
	  ListNode Ehead = head;
	  
	  for(int i=1;i<=n;i++){
		  Nhead = Nhead.next;
	  }
	  
	  if(Nhead==null){
		  head = head.next;
		  return head;
	  }
	  
	  while(Nhead.next!=null){
		  Ehead = Ehead.next;
		  Nhead = Nhead.next;
	  }
	  
	  Ehead.next = Ehead.next.next;
	  return head;
	  
  }
}
