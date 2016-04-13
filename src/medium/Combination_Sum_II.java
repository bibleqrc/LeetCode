/*40. Combination Sum II My Submissions QuestionEditorial Solution
Total Accepted: 66121 Total Submissions: 240741 Difficulty: Medium
Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
A solution set is: 
[1, 7] 
[1, 2, 5] 
[2, 6] 
[1, 1, 6] 
Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Combination_Sum_II {
   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	     List<List<Integer>> res = new ArrayList<List<Integer>>();   
	     if(candidates==null||candidates.length==0)  return res;
	     //Set<Integer> set = new HashSet();
	     Arrays.sort(candidates);
	     boolean[] visited = new boolean[candidates.length];
	     List<Integer> cur  = new ArrayList<Integer>();
	     helper(candidates,0,target,cur,res,visited);
	     return res;        
    }
   
   private void helper(int[] candidates, int start, int target, List<Integer> cur, List<List<Integer>> res, boolean[] visited) {

	   if(target<0)  return;
	   if(target==0){
	   	res.add(new ArrayList(cur));
	   	return;
	   }	
	   for(int i=start;i<candidates.length;i++){
	      if(!visited[i]){
		 if(i>0&&candidates[i]==candidates[i-1]&&visited[i-1]==false){
	   		continue;
	   	}
	   	cur.add(candidates[i]);
	    visited[i] = true;
	   	helper(candidates,i,target-candidates[i],cur,res,visited);
	   	visited[i] = false;
	   	cur.remove(cur.size()-1);
	     }
	   }
   }
}
