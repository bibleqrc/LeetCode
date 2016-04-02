/*
 * Best Time to Buy and Sell Stock III

 

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

 

discussion里有人提出了一个dp方法适用于k次买卖的情况，很好理解。这里就直接照搬他的思路了：

// f[k, ii] 表示直到 prices[ii] 的最大利润 在最多k次交易的情况下.

// 转移函数：f[k, ii] = max(f[k, ii-1], prices[ii] - prices[jj] + f[k-1, jj]) { jj in range of [0, ii-1] } = max(f[k, ii-1], prices[ii] + max(f[k-1, jj] - prices[jj]))

// 基本情况：f[0, ii] = 0; 0次交易将无利润

// 基本情况：f[k, 0] = 0; 如果只有一天也将无利润
 */
package medium;

public class Best_Time_to_Buy_and_Sell_Stock_III {
   public int maxProfit(int[] prices){
	   if(prices.length<=1)  
		   return 0;
	   
	   int k=2;
	   int[][] dp =new int[k+1][prices.length];
	   int res = 0;
	   for(int i=1;i<=k;i++){
		   int temp = dp[i-1][0]-prices[0];
		   for(int j=1;j<prices.length;j++){
			   temp = Math.max(temp, dp[i-1][j]-prices[j]);
			   dp[i][j]=Math.max(dp[i][j-1], prices[j]+temp);
		   }
	   }
	   return dp[k][prices.length-1];
   }
}
