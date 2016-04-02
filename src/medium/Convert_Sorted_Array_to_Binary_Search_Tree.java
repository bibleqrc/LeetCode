package medium;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	private TreeNode buildTree(int[] num,int start,int end){
 	   if(start>end)
 		   return null;
 	   TreeNode node = new TreeNode(num[(start+end)/2]);
 	   node.left = buildTree(num,start,(start+end)/2-1);
 	   node.right=buildTree(num,(start+end)/2+1,end);
 	   return node;
    }
	
	public TreeNode sortedArrayToBST(int[] nums) {
	     if(nums==null) return null;
	     
	     return buildTree(nums,0,nums.length-1);
	    }
}
