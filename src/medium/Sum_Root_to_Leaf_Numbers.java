/*129. Sum Root to Leaf Numbers   My Submissions QuestionEditorial Solution Total Accepted: 74636 Total Submissions: 229036 Difficulty: Medium
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Sum_Root_to_Leaf_Numbers {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	int sum = 0;
	
public int sumNumbers(TreeNode root) {
      if(root==null)  return 0;
      
      int val = 0;
      dfs(root,val);
      return sum;
    }

private void dfs(TreeNode root, int val) {
	if(root.left==null&&root.right==null){
		sum = sum +10*val+root.val;
	}
	
	val = val*10 + root.val;
	if(root.left!=null) dfs(root.left,val);
	if(root.right!=null) dfs(root.right,val);
	
}
}
