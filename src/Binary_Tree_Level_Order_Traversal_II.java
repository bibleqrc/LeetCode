import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 * 
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
//解法一
public class Binary_Tree_Level_Order_Traversal_II {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if(root==null)
	        	return result;
	        
	        List<TreeNode> pre = new ArrayList<TreeNode>();  //保存树中pre层树节点
	        pre.add(root);
	        int prelength = 0;
	        List<TreeNode> cur = null;      //保存树中当前层树结点
	        List<Integer> curValue = null;  //保存树的当前结点的数值
	        TreeNode curNode=null;
	        
	        while(pre.size()!=0){
	        	prelength = pre.size();
	        	cur = new ArrayList<TreeNode>();
	        	curValue = new ArrayList<Integer>();
	            for(int i =0;i<prelength;i++){
	            	curNode = pre.get(i);
	            	curValue .add(curNode.val);
	            	if(curNode.left!=null){
	            		cur.add(curNode.left);
	            	}
	            	
	            	if(curNode.right!=null){
	            		cur.add(curNode.right);
	            	}
	            }
	            result.add(0,curValue);
	        
	        }
	        
	        //rverse result
	        List<Integer> levelValue = null;
	        int front = 0;
	        int tail = result.size()-1;
	        while(front<=tail){
	        	levelValue = result.get(front);
	        	result.set(front, result.get(tail));
	        	result.set(tail, levelValue);
	        	front++;
	        	tail--;
	        }
	      
	        return result;
	    }
}
*/

//解法二
public class Binary_Tree_Level_Order_Traversal_II {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if(root==null)
	        	return result;
	        
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.offer(root);                //入队
	        int currLevelNodeNum = 1;         //计算当层结点数目
	        int nextLevelNodeNum = 0;          //计算下一层结点数目
	        
	        while(currLevelNodeNum!=0){
	        	ArrayList<Integer> currLevelResult = new ArrayList<Integer>();
	        	nextLevelNodeNum = 0;         
	        	
	        	while(currLevelNodeNum!=0){
	        		TreeNode node = queue.poll();           //结点出队
	        		
	        		currLevelNodeNum--;
	        		currLevelResult.add(node.val);          //添加结点值
	        		
	        		if(node.left!=null){
	        			queue.offer(node.left);
	        			nextLevelNodeNum ++;
	        		}
	        		
	        		if(node.right!=null){
	        			queue.offer(node.right);
	        			nextLevelNodeNum ++;
	        		}
	        	}
	        	
	        	result.add(0,currLevelResult);    //添加到列表中索引值为1的地方，其余元素自动往后移动
 	        	currLevelNodeNum = nextLevelNodeNum;     
	        }
	        
	        
	        return result;
	    }
}