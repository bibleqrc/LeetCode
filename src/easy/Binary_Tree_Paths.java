/*257. Binary Tree Paths   My Submissions QuestionEditorial Solution Total Accepted: 44389 Total Submissions: 156529 Difficulty: Easy
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
package easy;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
 public List<String> binaryTreePaths(TreeNode root) {
	 List<String> res = new ArrayList<String>();
	 if(root==null) return res;
	 else{
		 search(root,res,"");
	 }
	 
	 return res;
  }
private void search(TreeNode root, List<String> res, String connection) {
	if(root==null) return;
	if(root.left==null&&root.right==null){
		res.add(connection+root.val);
	}
	if(root.left!=null){
		search(root.left,res,connection+root.val+"->");
	}
	if(root.right!=null){
		search(root.right,res,connection+root.val+"->");
	}
	
}
}
