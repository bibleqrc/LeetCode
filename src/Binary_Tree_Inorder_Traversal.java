import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class Binary_Tree_Inorder_Traversal {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	     TreeNode(int x) { val = x; }
}
public List<Integer> inorderTraversal(TreeNode root){
	 List<Integer> list = new ArrayList<Integer>(); 
	 if(root ==null) return list;
	 Stack<TreeNode> stack = new Stack<TreeNode>();
	 
	
	 while(root!=null||!stack.isEmpty()){
		if(root!=null){
			stack.push(root);
			root = root.left;
		}else{
			root = stack.pop();
			list.add(root.val);
			root = root.right;
		}
	 }
	 
	 return list;
}
}
