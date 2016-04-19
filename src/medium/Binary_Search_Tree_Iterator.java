/*173. Binary Search Tree Iterator   My Submissions QuestionEditorial Solution
Total Accepted: 46451 Total Submissions: 134918 Difficulty: Medium
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
package medium;

import java.util.Stack;

public class Binary_Search_Tree_Iterator {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	 Stack<TreeNode> stk;
	
	  public Binary_Search_Tree_Iterator(TreeNode root) {
	        stk= new Stack<TreeNode>();
	        while(root!=null){
	        	stk.push(root);
	        	root=root.left;
	        }
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !stk.isEmpty();
	    }

	    /** @return the next smallest number */
	    public int next() {
	        if(hasNext()){
	        	TreeNode top = stk.pop();
	        	if(top.right!=null){
	        		TreeNode rightleft = top.right;
	        		while(rightleft!=null){
	        			stk.push(rightleft);
	        			rightleft = rightleft.left;
	        		}
	        	}
	        	return top.val;
	        }
	        
	        return -1;
	    }
	       
}
/**
	     * Your BSTIterator will be called like this:
	     * BSTIterator i = new BSTIterator(root);
	     * while (i.hasNext()) v[f()] = i.next();
	     */