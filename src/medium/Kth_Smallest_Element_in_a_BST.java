/*230. Kth Smallest Element in a BST My Submissions QuestionEditorial Solution
Total Accepted: 41790 Total Submissions: 112674 Difficulty: Medium
Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

Show Hint 

 * 
 */
package medium;

import java.util.Stack;

public class Kth_Smallest_Element_in_a_BST {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
   public int kthSmallest(TreeNode root, int k) {
	   Stack<TreeNode> s= new Stack<TreeNode>(); 
	   while(root!=null){
		   s.push(root);
		   root = root.left;
	   }
	   while(!s.isEmpty()){
		   TreeNode curr= s.pop();
		   k--;
		   if(k==0) return curr.val;
		   if(curr.right!=null){
			   curr = curr.right;
			   while(curr!=null){
				   s.push(curr);
				   curr = curr.left;
			   }
		   }
	   }
	   return 0;
	 }
}
