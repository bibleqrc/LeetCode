/*114. Flatten Binary Tree to Linked List   My Submissions QuestionEditorial Solution
Total Accepted: 81176 Total Submissions: 261405 Difficulty: Medium
Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
 * 
 */
package medium;

public class Flatten_Binary_Tree_to_Linked_List {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	 public void flatten(TreeNode root) {
	   if(root==null)  return;
	   
	   flattenHelper(root);
 }

	private TreeNode flattenHelper(TreeNode root) {
		TreeNode left = root.left;
		TreeNode right= root.right;
		root.left = null;
		root.right=null;
		TreeNode tail = root;
		if(left!=null){
			tail.right=left;
			tail = flattenHelper(left);
		}
		if(right!=null){
			tail.right=right;
			tail = flattenHelper(right);
		}
		return tail;
		
	}
}
