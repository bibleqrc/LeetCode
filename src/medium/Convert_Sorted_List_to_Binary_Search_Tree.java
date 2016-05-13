/*109. Convert Sorted List to Binary Search Tree   My Submissions QuestionEditorial Solution
Total Accepted: 69093 Total Submissions: 226999 Difficulty: Medium
Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */

//每次取链表的中点作为root，然后递归
package medium;

public class Convert_Sorted_List_to_Binary_Search_Tree {
	
	 // Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	
	 // Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  
	  }
	
	  static ListNode h;
	  
//public TreeNode sortedListToBST(ListNode head) {
//       if(head==null) return null;
//       
//       h=head;
//       int len = getLength(head);
//       return sortedListToBST(0,len-1);
//  }
//
//private TreeNode sortedListToBST(int start, int end) {
//      if(start>end) return null;
//      
//      int mid = (start+end)/2;
//      TreeNode left = sortedListToBST(start,mid-1);
//      TreeNode root = new TreeNode(h.val);
//      h=h.next;
//      TreeNode right = sortedListToBST(mid+1,end);
//      
//      root.left = left;
//      root.right=right;
//      
//      return root;
// 
//}
//
//private int getLength(ListNode head) {
//	int len = 0;
//	ListNode p = head;
//	while(p!=null){
//		len++;
//		p=p.next;
//	}
//	return len;
//}
	  
 public TreeNode sortedListToBST(ListNode head) {
	  if(head==null)  return null;
	  if(head.next==null)  return new TreeNode(head.val);
	  
	  //p为链表中点，从p处截断，右半头结点为q
	  ListNode p = getMid(head);
	  ListNode q = p.next;
	  p.next=null;
	  TreeNode root = new TreeNode(p.val);
	  
	  //删除p新建一个虚拟的节点r，r。next是左半段的头结点
	  ListNode r = new ListNode(0);
	  r.next = head;
	  ListNode s = r;
	  while(true){
		  if(s.next==p){
			  break;
		  }
          s=s.next;
	  }
	  s.next = null;
	  
	  //递归
	  root.left  = sortedListToBST(r.next);
	  root.right = sortedListToBST(q);
	  return root;
 }

private ListNode getMid(ListNode head) {
	if(head==null || head.next ==null){
		return head;
	}
	ListNode p = head;
	ListNode q=head;
	while(p.next!=null && q.next!=null &&
		q.next.next!=null) {
			p = p.next;
			q= q.next.next;
    }

	return p;
}
}
