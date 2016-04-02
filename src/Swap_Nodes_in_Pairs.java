/*
 * 24. Swap Nodes in Pairs My Submissions QuestionEditorial Solution
Total Accepted: 88756 Total Submissions: 254101 Difficulty: Easy
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
public class Swap_Nodes_in_Pairs {
	 public class ListNode { 
		     int val; 
		     ListNode next; 
		      ListNode(int x) { 
		          val = x; 
		          next = null; 
		      } 
		  } 
	 public ListNode swapPairs(ListNode head) {
	   if(head==null||head.next==null)  return head;
	   ListNode p=head.next, q,st;
	   head.next = p.next;
	   p.next = head;
	   q=head.next;
	   head = p;
	   q = head.next;
	   
	   while(q.next!=null&&q.next.next!=null){
		   
		   st=q;
		   p=p.next.next;
		   q=q.next.next;
		   p.next = q.next;
		   q.next = p;
		   st.next = q;
		   q=p;
		   p = st.next;
	   }
	   return head;
	   
 }
}
