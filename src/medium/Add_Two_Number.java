/*2. Add Two Numbers My Submissions QuestionEditorial Solution Total Accepted: 144109 Total Submissions: 618787 Difficulty: Medium
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Add_Two_Number {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode result =  new ListNode(0);
     ListNode currentNode = result;
     ListNode  pre = null;
     int carry = 0;
     while(l1!=null && l2!=null){
    	 currentNode.val = (l1.val + l2.val+carry)%10;
    	 carry = (l1.val+l2.val+carry)/10;
    	 pre = currentNode;
    	 currentNode = new ListNode(0);
    	 pre.next = currentNode;
    	 l1 = l1.next;
    	 l2 = l2.next;
     }
     currentNode = addWithCarry(l1,l2,carry);
     pre.next = currentNode;
     return result;
   }

private ListNode addWithCarry(ListNode l1, ListNode l2, int carry) {
	if(l1==null && l2==null){
		if(carry!=0){
			ListNode cur = new ListNode(0);
			cur.val = carry;
			return cur;
		}
		return null;
	}
	
	if(l1==null){
		return addWithCarry(l2,l1,carry);
	}
	ListNode result = new ListNode(0);
	ListNode cur = result;
	ListNode pre = null;
	while(l1!=null){
		cur.val = (l1.val+carry)%10;
		carry = (l1.val+carry)/10;
		pre = cur;
		cur = new ListNode(carry);
		pre.next = cur;
		l1=l1.next;
	}
	if(pre.next.val==0){
		pre.next=null;
	}
	return result;
} 
}
