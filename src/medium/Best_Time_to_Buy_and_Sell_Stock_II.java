/*
 * Best Time to Buy and Sell Stock II

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

无限次买卖股票，看似更难，实际更简单了。只需要得到所有攀升段的总值，即为总最大利润。那么只要第二天值比第一天更贵，则把它们的差值加到总利润。

 
 */
package medium;

public class Best_Time_to_Buy_and_Sell_Stock_II {
     public int maxProfit(int[] prices){
    	 int res=0;
    	 for(int i=1;i<prices.length;i++){
    		 if(prices[i]>prices[i-1]){
    			 res+=prices[i]-prices[i-1];
    		 }
    		
    	 }
    	  return res;
     }
}
