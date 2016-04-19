/*264. Ugly Number II My Submissions QuestionEditorial Solution
Total Accepted: 28007 Total Submissions: 101003 Difficulty: Medium
Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

Note that 1 is typically treated as an ugly number.
 * 
 */
package medium;

public class Ugly_Number_II {
public int nthUglyNumber(int n) {
     if(n<1){
    	 return 0;
     }
     
     int[] dp=new int[n];
     dp[0]=1;
     int i2=0;
     int i3=0;
     int i5=0;
     for(int i =1;i<n;i++){
    	 dp[i]=Math.min(Math.min(dp[i2]*2, dp[i3]*3), dp[i5]*5);
    	 
    	 if(dp[i]==dp[i2]*2){
    		 i2++;
    	 }
    	 
    	 if(dp[i]==dp[i3]*3){
    		 i3++;
    	 }
    	 
    	 if(dp[i]==dp[i5]*5){
    		 i5++;
    	 }
     }
     
     return dp[n-1];
    }
}
