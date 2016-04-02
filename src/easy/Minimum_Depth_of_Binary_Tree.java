/*111. Minimum Depth of Binary Tree My Submissions QuestionEditorial Solution Total Accepted: 100517 Total Submissions: 329812 Difficulty: Easy
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Subscribe to see which companies asked this question
 * 
 */

package easy;

import java.util.LinkedList;

public class Minimum_Depth_of_Binary_Tree {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		     TreeNode(int x) { val = x; }
		  }
	
//解法一
  public int minDepth(TreeNode root) {
	 if(root==null)  return 0;
	 
	 if(root.left==null)
		 return minDepth(root.right)+1;
	 
	 if(root.right==null)
		 return minDepth(root.left)+1;
	 
	 return Math.min(minDepth(root.left), minDepth(root.right))+1;
 }
  
 //解法二
  public int minDepth_two(TreeNode root){
	  if(root==null)  return 0;
	  
	  LinkedList queue = new LinkedList();
	  int curNum = 0;
	  int lastNum = 1;
	  int level = 1;
	  queue.offer(root);
	  while(!queue.isEmpty()){
		  TreeNode cur = (TreeNode) queue.poll();
		  if(cur.left==null&&cur.right==null)  return level;
		  lastNum--;
		  if(cur.left!=null){
			  queue.offer(cur.left);
			  curNum++;
		  }
		  if(cur.right!=null){
			  queue.offer(cur.right);
			  curNum++;
		  }
		  if(lastNum==0){
			  lastNum=curNum;
			  curNum=0;
			  level++;
		  }
	  }
	  
	  return 0;
  }
}
