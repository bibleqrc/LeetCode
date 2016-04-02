/*
 * Best Time to Buy and Sell Stock


Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 

买卖股票，只能买卖一次。那么只需要简单遍历一遍，记录利润值和买入值，每次遇到更大的利润值就更新，遇到更小的买入值就更新。这样在每个day i处计算出的利润值为在第i天卖出所能得到的最大利润。不断更新这个利润，最后得到的即为最大利润值。
 * 
 */

package medium;

public class Best_Time_to_Buy_and_Sell_Stock {
	 public int maxProfit(int[] prices) {
	      if(prices.length<=0)  return 0;
	      int buy = prices[0];
	      int benefit = 0;
	      for(int i=0;i<prices.length;i++){
	    	  benefit = Math.max(benefit, prices[i]-buy);
	    	  buy=Math.min(buy, prices[i]);
	      }
	      return benefit;
	    }
}
