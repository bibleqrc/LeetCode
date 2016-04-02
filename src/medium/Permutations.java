/*46. Permutations My Submissions QuestionEditorial Solution
Total Accepted: 94185 Total Submissions: 266541 Difficulty: Medium
Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */

//排列问题
package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	 public List<List<Integer>> permute(int[] nums) {
	  List<List<Integer>> st = new ArrayList<List<Integer>>();
	  List<Integer> a = new ArrayList<Integer>();
	  if(nums.length==0)  return st;
	  
	  boolean[] visited = new boolean[nums.length];
	  search(nums,st,a,visited);
	  return st;
	 }

	private void search(int[] nums, List<List<Integer>> st, List<Integer> a, boolean[] visited) {
		if(a.size()==nums.length){
			st.add(new ArrayList<Integer>(a));   //递归时st添加要为a添加新空间
			return;
		}
		
		for(int i=0;i<nums.length;i++){
			if(!visited[i]){
				a.add(nums[i]);
				visited[i] = true;
				search(nums,st,a,visited);
				a.remove(a.size()-1);            
				visited[i] = false;
			}
		}
	}
}
