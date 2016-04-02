/*
 * 
 * 
 */
public class Merge_two_sorted_lists {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        if(l1==null)   return l2;
	        if(l2==null)   return l1;
	        
	        ListNode l3 = null;
	        if(l1.val<l2.val){
	        l3=l1;
	        l1=l1.next;
	        }else {
	            l3=l2;
	            l2=l2.next;
	        }
	        
	        ListNode fakeNode = new ListNode(-1);
	        fakeNode.next = l3;
	        
	        while(l1!=null&&l2!=null){
	            if(l1.val<l2.val){
	                l3.next = l1;
	                l3=l3.next;
	                l1=l1.next;
	            }else{
	                l3.next = l2;
	                l3=l3.next;
	                l2=l2.next;
	            }
	        }
	        
	        if(l1!=null){
	            l3.next = l1;
	        }
	        
	        if(l2!=null){
	            l3.next = l2;
	        }
	        
	        return fakeNode.next;
	    }
}
