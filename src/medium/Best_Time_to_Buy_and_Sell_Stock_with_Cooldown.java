/*
 * 309. Best Time to Buy and Sell Stock with Cooldown My Submissions QuestionEditorial Solution
Total Accepted: 12009 Total Submissions: 32952 Difficulty: Medium
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
Example:

prices = [1, 2, 3, 0, 2]
maxProfit = 3
transactions = [buy, sell, cooldown, buy, sell]
 */


/*
 * 2. Define Recursion

buy[i]: To make a decision whether to buy at i, we either take a rest, by just using the old decision at i - 1, or sell at/before i - 2, then buy at i, We cannot sell at i - 1, then buy at i, because of cooldown.
sell[i]: To make a decision whether to sell at i, we either take a rest, by just using the old decision at i - 1, or buy at/before i - 1, then sell at i.
So we get the following formula:

buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);   
sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
 */
package medium;

public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {
	public int maxProfit(int[] prices) {
	  if(prices==null||prices.length<=1)  return 0;
	  int[] buy = new int[prices.length];
	  int[] sell  =new int[prices.length];
	  buy[0]=-prices[0];
	  sell[0]=0;
	  for(int i=1;i<prices.length;i++){
		  buy[i]=Math.max(buy[i-1], -prices[i]+((i>=2)?sell[i-2]:0));
		  sell[i]=Math.max(sell[i-1], buy[i-1]+prices[i]);
	  }
	  return sell[prices.length-1];
 }
	
	
	//非递归做法
//	 public int maxProfit(int[] prices) {
//		          if (prices==null || prices.length<=1) return 0;
//		          int b0 = -prices[0];
//		          int s0 = 0;
//		         int b1 = b0;
//		          int s1 = s0;
//		          int s2 = 0;
//		          for (int i=1; i<prices.length; i++) {
//		             b0 = Math.max(b1, s2-prices[i]);
//		             s0 = Math.max(s1, b1+prices[i]);
//		             s2 = s1;
//		             s1 = s0;
//		             b1 = b0;
//		         }
//		         return s0;
//		     }
}
