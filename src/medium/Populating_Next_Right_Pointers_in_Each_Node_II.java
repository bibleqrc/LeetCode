/*117. Populating Next Right Pointers in Each Node II My Submissions QuestionEditorial Solution
Total Accepted: 59965 Total Submissions: 182893 Difficulty: Hard
Follow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Populating_Next_Right_Pointers_in_Each_Node_II {
	public class TreeLinkNode {
		      int val;
		      TreeLinkNode left, right, next;
		      TreeLinkNode(int x) { val = x; }
		  }
	
	 public void connect(TreeLinkNode root) {
	        if(root==null)  return ;
	        
	        TreeLinkNode rootnext = root.next;
	        TreeLinkNode next=null;
	        
	        // rootNext如果是null说明已经处理完这一层的所有node  
	        // next不等于null说明找到了找到最左边的下一个被连接的对象  
	        while(rootnext!=null){
	        	if(rootnext.left!=null){
	        		next = rootnext.left;
	        		break;
	        	}else if(rootnext.right!=null){
	        		next = rootnext.right;
	        		break;
	        	}else{
	        		rootnext=rootnext.next;

	        	}
	        }
	        
	        if(root.right!=null){
	        	root.right.next=next;
	        }
	        
	        if(root.left!=null){
	        	if(root.right!=null){
	        		root.left.next=root.right;
	        	}else{
	        		root.left.next=next;
	        	}
	        }
	        connect(root.right);
	        connect(root.left);
	    }
}
