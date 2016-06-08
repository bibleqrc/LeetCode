/*312. Burst Balloons My Submissions QuestionEditorial Solution Total Accepted: 9560 Total Submissions: 25623 Difficulty: Hard
Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note: 
(1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
(2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100

Example:

Given [3, 1, 5, 8]

Return 167

    nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
   coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
 * 
 */
/*题解：

DP题目,  dp[l][r]表示扎破(l, r)范围内所有气球获得的最大硬币数，不含边界.

我们可以想象：最后的剩下一个气球为m的时候，可以获得的分数为 nums[-1]*nums[m]*nums[n].

那么介于l, r之间的m, 有 dp[l][r] = max(dp[l][r], dp[l][m] + nums[l] * nums[m] * nums[r]  + dp[m][r]).

l与r的跨度k从2开始逐渐增大；

三重循环依次枚举范围跨度k, 左边界l, 中点m, 右边界r = l + k

Time Complexity: O(n^3). Space: O(n^2).
 * 
 */
package hard;

public class Burst_Balloons {
  public int maxCoins(int[] nums) {
    if(nums==null || nums.length==0){	        
    	return 0;
    }
    int len = nums.length+2;
    int[] newNums = new int[len];
    for(int i=1;i<len-1;i++){
    	newNums[i] = nums[i-1];
    }
    newNums[0] = 1;
    newNums[len-1] = 1;
    
    int [][]dp = new int[len][len];
    for(int k=2;k<len;k++){
    	for(int l=0;l<len-k;l++){
    		int r = l+k;
    		for(int m=l+1;m<r;m++){
    			dp[l][r] = Math.max(dp[l][r], 
    					dp[l][m]+newNums[l]*newNums[m]*newNums[r]+dp[m][r]);
    		}
    	}
    }
    return dp[0][len-1];
   }
}
