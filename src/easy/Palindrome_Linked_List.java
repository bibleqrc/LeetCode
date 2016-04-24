/*234. Palindrome Linked List   My Submissions QuestionEditorial Solution
Total Accepted: 45697 Total Submissions: 163124 Difficulty: Easy
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?

Subscribe to see which companies asked this question
 * 
 */
//先分成大小相同(可能长度差1) 两部分,   reverse一个list. 再比较. 

package easy;

public class Palindrome_Linked_List {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
   public boolean isPalindrome(ListNode head) {
     if(head==null || head.next==null) return true;
     
     ListNode middle = partition(head);
     middle = reverse(middle);
     
     while(head!=null && middle!=null){
    	 if(head.val!=middle.val){
    		 return false;
    	 }
    	 head = head.next;
    	 middle = middle.next;
     }
     return true;
  }

private ListNode reverse(ListNode head) {
	if(head==null&&head.next==null) return head;
	ListNode pre = head;
	ListNode cur = head.next;
	pre.next = null;
	ListNode nxt = null;
	
	while(cur!=null){
	   nxt = cur.next;
	   cur.next = pre;
	   pre = cur;
	   cur = nxt;
	}
	return pre;
}

private ListNode partition(ListNode head) {
	ListNode p = head;
	while(p.next!=null&&p.next.next!=null){
		p=p.next.next;
		head = head.next;
	}
    p=head.next;
    head.next=null;
    return p;
}
}
