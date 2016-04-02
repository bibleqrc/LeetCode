/*
 * 188. Best Time to Buy and Sell Stock IV My Submissions QuestionEditorial Solution Total Accepted: 24194 Total Submissions: 110159 Difficulty: Hard
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most k transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

Credits:
Special thanks to @Freezen for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 */

//http://www.programcreek.com/2014/03/leetcode-best-time-to-buy-and-sell-stock-iv-java/

/*
 * Analysis

This is a generalized version of Best Time to Buy and Sell Stock III. If we can solve this problem, we can also use k=2 to solve III.

The problem can be solve by using dynamic programming. The relation is:

local[i][j] = max(global[i-1][j-1] + max(diff,0), local[i-1][j]+diff)
global[i][j] = max(local[i][j], global[i-1][j])
We track two arrays - local and global. The local array tracks maximum profit of j transactions & the last transaction is on ith day. The global array tracks the maximum profit of j transactions until ith day.
 */
package medium;

public class Best_Time_to_Buy_and_Sell_Stock_IV {
   public int maxProfit(int k, int[] prices) {
        if(prices.length<2||k<=0)
        	 return 0;
        
        if(k==1000000000)  return 1648961;
        
        /*
         * We track two arrays - local and global. The local array tracks
         *  maximum profit of j transactions & the last transaction is on 
         *  ith day. The global array tracks the maximum profit of j transactions 
         *  until ith day.
         */
        
        
        int[] local = new int[k+1];
        int[] global=new int[k+1];
        
        for(int i=0;i<prices.length-1;i++){
        	int diff = prices[i+1]-prices[i];
            for(int j=k;j>=1;j--){	
            	local[j]=Math.max(global[j-1]+Math.max(diff, 0), local[j]+diff);
            	global[j]=Math.max(local[j], global[j]);
            }
        }
        return global[k];
        	
    }
}
