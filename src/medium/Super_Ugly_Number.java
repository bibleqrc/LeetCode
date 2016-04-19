/*313. Super Ugly Number My Submissions QuestionEditorial Solution
Total Accepted: 12222 Total Submissions: 36157 Difficulty: Medium
Write a program to find the nth super ugly number.

Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k. For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32] is the sequence of the first 12 super ugly numbers given primes = [2, 7, 13, 19] of size 4.

Note:
(1) 1 is a super ugly number for any given primes.
(2) The given numbers in primes are in ascending order.
(3) 0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.

Credits:
Special thanks to @dietpepsi for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
package medium;

public class Super_Ugly_Number {
 public int nthSuperUglyNumber(int n, int[] primes) {
	if(n<1||primes==null||primes.length==0)
		return 0;
	
	int len = primes.length;
	int[] dp = new int[n];
	int[] ind = new int[len];
	dp[0] = 1;
	
	for(int i=1;i<n;i++){
		int min = Integer.MAX_VALUE;
		for(int j=0;j<len;j++){
			min=Math.min(min, dp[ind[j]]*primes[j]);
		}
		dp[i]=min;
		for(int j=0;j<len;j++){
			if(min==dp[ind[j]]*primes[j]){
				ind[j]++;
			}
		}
	}
	return dp[n-1];
  }
}
