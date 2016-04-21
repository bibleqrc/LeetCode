/*199. Binary Tree Right Side View   My Submissions QuestionEditorial Solution Total Accepted: 40158 Total Submissions: 117085 Difficulty: Medium
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].

Credits:
Special thanks to @amrsaqr for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
 public List<Integer> rightSideView(TreeNode root) {
	  return bfs(root);
 }	 
 
 private List<Integer> bfs(TreeNode root){
	 List<Integer> result = new ArrayList<Integer>();
	 List<TreeNode> levelOrder = new ArrayList<TreeNode>();
	 if(root==null) return result;
	 
	levelOrder.add(root);
	while(!levelOrder.isEmpty()){
		int len = levelOrder.size();
		result.add(levelOrder.get(len-1).val);     //add看到的最右边元素的值
		for(int i=0;i<len;i++){
			TreeNode node = levelOrder.remove(0);
			if(node.left!=null){
				levelOrder.add(node.left);
			}
			if(node.right!=null){
				levelOrder.add(node.right);
			}
		}
		
	}
	return result;
 }
}
