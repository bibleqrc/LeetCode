/*47. Permutations II My Submissions QuestionEditorial Solution
Total Accepted: 67168 Total Submissions: 241568 Difficulty: Medium
Given a collection of numbers that might contain duplicates, return all possible unique permutations.

For example,
[1,1,2] have the following unique permutations:
[1,1,2], [1,2,1], and [2,1,1].

Subscribe to see which companies asked this question
 * 
 */

//排列问题2
package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations_II {
	 public List<List<Integer>> permuteUnique(int[] nums) {
		 List<List<Integer>> st = new ArrayList<List<Integer>>();
		  List<Integer> a = new ArrayList<Integer>();
		  if(nums.length==0)  return st;
		  
		  boolean[] visited = new boolean[nums.length];
		  HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
		  search(nums,st,a,visited,hs);
		  return st;   
	    }
	 
	 private void search(int[] nums, List<List<Integer>> st, List<Integer> a, boolean[] visited, HashSet<List<Integer>> hs) {
			if(a.size()==nums.length){
				
				if(!hs.contains(a)){
				st.add(new ArrayList<Integer>(a));   //递归时st添加要为a添加新空间
				hs.add(a);
				}
				return;
			}
			
			for(int i=0;i<nums.length;i++){
				if(!visited[i]){
					a.add(nums[i]);
					visited[i] = true;
					search(nums,st,a,visited,hs);
					a.remove(a.size()-1);            
					visited[i] = false;
				}
			}
		}
}
