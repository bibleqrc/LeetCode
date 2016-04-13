/*39. Combination Sum My Submissions QuestionEditorial Solution
Total Accepted: 87737 Total Submissions: 285000 Difficulty: Medium
Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 
Subscribe to see which companies asked this question
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
	     List<List<Integer>> res = new ArrayList<List<Integer>>();   
	     if(candidates==null||candidates.length==0)  return res;
	     Arrays.sort(candidates);
	     List<Integer> cur  = new ArrayList<Integer>();
	     helper(candidates,0,target,cur,res);
	     return res;     
  }

private void helper(int[] candidates, int start, int target, List<Integer> cur, List<List<Integer>> res) {

if(target<0)  return;
if(target==0){
	res.add(new ArrayList(cur));
	return;
}	
for(int i=start;i<candidates.length;i++){
	if(i>0&&candidates[i]==candidates[i-1]){
		continue;
	}
	cur.add(candidates[i]);
	helper(candidates,i,target-candidates[i],cur,res);
	cur.remove(cur.size()-1);
  }
}
}  
  
  
