/*
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 * 
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Balanced_Binary_Tree {
	
	public class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	 public boolean isBalanced(TreeNode root) {
	        if(root==null)  return true;
	        
	        int leftDepth = maxDepth(root.left);
	        int rightDepth= maxDepth(root.right);
	        
	        if((Math.abs(leftDepth-rightDepth)<=1)&&isBalanced(root.left)&&isBalanced(root.right)) return true;
	        else  return false;
	        
	    }
	    
	    int maxDepth(TreeNode root){
	        if(root==null)  return 0;
	        
	        int l = maxDepth(root.left);
	        int r = maxDepth(root.right);
	        
	        return l>r?(l+1):(r+1);
	    }
}
