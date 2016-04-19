/*279. Perfect Squares My Submissions QuestionEditorial Solution
Total Accepted: 31535 Total Submissions: 97439 Difficulty: Medium
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
/*解法II：动态规划（Dynamic Programming）

时间复杂度：O(n * sqrt n)

初始化将dp数组置为无穷大；令dp[y * y] = 1，其中：y * y <= n

状态转移方程：

dp[x + y * y] = min(dp[x + y * y], dp[x] + 1)
其中：dp [i] 表示凑成i所需的平方和数字的最小个数，并且 x + y * y <= n
 * 
 */
package medium;

import java.util.Arrays;

public class Perfect_Squares {
 public int numSquares(int n) {
	int dp[] = new int[n+1];
	
	Arrays.fill(dp, Integer.MAX_VALUE);
	for(int i=1;i*i<=n;i++){
		dp[i*i]=1;
	}
	
	for(int i=1;i<=n;i++){
		for(int j=1;i+j*j<=n;j++){
			dp[i+j*j]=Math.min(dp[i]+1, dp[i+j*j]);
		}
	}
	return dp[n];
  }
}
