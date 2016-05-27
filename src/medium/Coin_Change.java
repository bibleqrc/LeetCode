/*322. Coin Change   My Submissions QuestionEditorial Solution
Total Accepted: 21620 Total Submissions: 86568 Difficulty: Medium
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:
coins = [1, 2, 5], amount = 11
return 3 (11 = 5 + 5 + 1)

Example 2:
coins = [2], amount = 3
return -1.

Note:
You may assume that you have an infinite number of each kind of coin.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */

//DP
package medium;

public class Coin_Change {
  public int coinChange(int[] coins, int amount) {
//     if(coins==null || coins.length==0 || amount<0){
//    	 return -1;
//     }
//     
//     int[] f= new int[amount+1];
//     f[0] = 0;
//     
//     for(int coin:coins){
//    	 if(coin>amount){
//    		 break;
//    	 }
//    	 f[coin]=1;
//     }
//     
//     for(int i=1;i<=amount;i++){
//    	 if(f[i]!=1){
//    		 f[i] = Integer.MAX_VALUE;
//    	 }
//     }
//     
//     for(int i=1;i<=amount;i++){
//    	 for(int j=0;j<coins.length;j++){
//    		 if(coins[j]<=i && f[i-coins[j]]!=Integer.MAX_VALUE){
//    			 f[i] = Math.min(f[i], 1+f[i-coins[j]]);
//    		 }
//    	 }
//     }
//     return f[amount]==Integer.MAX_VALUE?-1:f[amount];
	  
	  if(coins==null || coins.length==0 ||amount<0){
		  return -1;
	  }
	  
	  int f[] = new int[amount+1];
	  f[0]=0;
	  for(int coin:coins){
		  if(coin>amount){
			  break;
		  }
		  f[coin]=1;
	  }
	  
	  for(int i=1;i<=amount;i++){
		  if(f[i]!=1){
			  f[i]=Integer.MAX_VALUE;
		  }
	  }
	  
	  for(int i=1;i<=amount;i++){
		  for(int j=0;j<coins.length;j++){
			  if(coins[j]<=i && f[i-coins[j]]!=Integer.MAX_VALUE){
				  f[i] = Math.min(f[i], 1+f[i-coins[j]]);
			  }
		  }
	  }
	  
	  return f[amount]==Integer.MAX_VALUE?-1:f[amount];
  }
}
