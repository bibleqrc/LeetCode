/*77. Combinations My Submissions QuestionEditorial Solution
Total Accepted: 71420 Total Submissions: 210559 Difficulty: Medium
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 * 
 */

//dfs思路
package medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	 public List<List<Integer>> combine(int n, int k) {
	     List<List<Integer>> res = new ArrayList<List<Integer>>();  
	     if(n<=0||n<k)
	    	 return res;
	     ArrayList<Integer> item = new ArrayList<Integer>();
	     dfs(n,k,1,item,res);
	     return res;
	     
	 }

	private void dfs(int n, int k, int start, ArrayList<Integer> item, List<List<Integer>> res) {
		if(item.size()==k){
			res.add(new ArrayList<Integer>(item));
			return;
		}
		for(int i=start;i<=n;i++){
			item.add(i);
			dfs(n,k,i+1,item,res);
			item.remove(item.size()-1);
		}
		
	}  
}
