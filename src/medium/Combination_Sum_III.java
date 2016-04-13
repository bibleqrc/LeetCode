/*216. Combination Sum III My Submissions QuestionEditorial Solution
Total Accepted: 29506 Total Submissions: 83244 Difficulty: Medium
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

Ensure that numbers within the set are sorted in ascending order.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]
Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */

/*[思路]
因为k是不定的, 所以无法用LOOP. 递归是此类题的常用解法. 为了方便, 多用一个variable: sum保存当前cur中所有数的和. 注意要新建一个list 放入结果中, 否则放入的reference 会指向原来的不断变化的list,    res.add(new ArrayList(cur));
[CODE]
 * 
 */

package medium;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
  public List<List<Integer>> combinationSum3(int k, int n) {
     List<List<Integer>> res = new ArrayList<List<Integer>>();   
     if(k<1||n<1)  return res;
     List<Integer> cur  = new ArrayList<Integer>();
     rec(res,cur,0,k,n,1);
     return res;
  }

private void rec(List<List<Integer>> res, List<Integer> cur, int sum, int k, int n, int level) {
	if(sum==n&&k==0){
		res.add(new ArrayList(cur));
		return;
	}else if(sum>n||k<=0) return ;
	
	for(int i=level;i<=9;i++){
		cur.add(i);
		rec(res,cur,sum+i,k-1,n,i+1);
		cur.remove(cur.size()-1);
	}
}
}
