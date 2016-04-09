package medium;

import medium.Convert_Sorted_Array_to_Binary_Search_Tree.TreeNode;

public class House_Robber_III {
  public int rob(TreeNode root) {
	if(root==null) return 0;
	
	int first = root.val;
	int second = 0;
	if(root.left!=null){
		first+=rob(root.left.left);
		first+=rob(root.left.right);
		second+=rob(root.left);
	}
	
	if(root.right!=null){
		first+=rob(root.right.left);
		first+=rob(root.right.right);
		second+=rob(root.right);
	}
	
	return (first>second)?first:second;
  } 
}
