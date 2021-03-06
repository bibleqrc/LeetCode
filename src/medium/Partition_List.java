/*86. Partition List   My Submissions QuestionEditorial Solution Total Accepted: 64368 Total Submissions: 218664 Difficulty: Medium
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.

Subscribe to see which companies asked this question

Show Tags

 * 
 */
package medium;

public class Partition_List {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
public ListNode partition(ListNode head, int x) {
      ListNode l1 = new ListNode(0);
      ListNode l2 = new ListNode(0);
      
      if(head==null||head.next==null)  return head;
      
      l1.next = head;
      ListNode p = l1;
      ListNode q = head;
      ListNode st = l2;
      
      while(q!=null){
    	  if(q.val<x){
    		  p = p.next;
    		  q = q.next;
    	  }else{
    		  st.next = q;
    		  st = st.next;
    		  
    		  p.next = q.next;
    		  q = p.next;
    	  }
      }
      
      st.next=null;
      p.next = l2.next;
      return l1.next;
  }	
}
