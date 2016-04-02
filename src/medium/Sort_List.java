/*148. Sort List My Submissions QuestionEditorial Solution
Total Accepted: 67723 Total Submissions: 275440 Difficulty: Medium
Sort a linked list in O(n log n) time using constant space complexity.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */

//使用归并排序
package medium;

public class Sort_List {
	class ListNode { 
		      int val; 
		      ListNode next; 
		      ListNode(int x) { 
		          val = x; 
		          next = null; 
		      } 
		  } 
	
	 public ListNode sortList(ListNode head) {
	        if(head==null||head.next==null){
	        	return head;
	        }
	        ListNode middle = getMiddleOfList(head);
	        ListNode next = middle.next;
	        middle.next=null;
	        return mergeList(sortList(head),sortList(next));
	        		
	    }
    
	 //合并
	private ListNode mergeList(ListNode a, ListNode b) {
		ListNode dummyHead = new ListNode(-1);
		ListNode curr = dummyHead;
		while(a!=null&&b!=null){
			if(a.val<=b.val){
				curr.next=a;a=a.next;
			}else{
				curr.next=b;b=b.next;
			}
			curr=curr.next;
		}
		curr.next=a!=null?a:b;
		return dummyHead.next;
		
	}
    
	//获取链表中间节点
	private ListNode getMiddleOfList(ListNode head) {
		ListNode slow =head;
		ListNode fast = head;
		while(fast.next!=null&&fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
}
