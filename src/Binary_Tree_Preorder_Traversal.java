import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Preorder_Traversal {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		     TreeNode(int x) { val = x; }
}
     public List<Integer> preorderTraversal(TreeNode root){
    	 List<Integer> list = new ArrayList<Integer>(); 
    	 if(root ==null) return list;
    	// List<Integer> list = new ArrayList<Integer>(); 
    	 Stack<TreeNode> stack = new Stack<TreeNode>();
    	 
    	 stack.push(root);
    	 while(!stack.isEmpty()){
    		 TreeNode r = stack.pop();
    		 list.add(r.val);
    		 
    		 if(r.right!=null){
    			 stack.push(r.right);
    		 }
    		 
    		 if(r.left!=null){
    			 stack.push(r.left);
    		 }
    	 }
    	 
    	 return list;
     }
}