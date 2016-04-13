/*141. Linked List Cycle My Submissions QuestionEditorial Solution Total Accepted: 99848 Total Submissions: 270376 Difficulty: Medium
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

Subscribe to see which companies asked this question
 * 
 */

package medium;

public class Linked_List_Cycle {
	 class ListNode {
		      int val;
		      ListNode next;
		       ListNode(int x) {
		         val = x;
		         next = null;
		      }
		  }

  public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while(fast!=null&&fast.next!=null){
    	slow = slow.next;
    	fast  = fast.next.next;
    	if(slow==fast){
    		return true;
    	}
    }
    return false;
  }
}
