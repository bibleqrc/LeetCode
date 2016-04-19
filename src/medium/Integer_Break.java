/*343. Integer Break   My Submissions QuestionEditorial Solution
Total Accepted: 420 Total Submissions: 1011 Difficulty: Medium
Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).

Note: you may assume that n is not less than 2.

Show Hint 
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Integer_Break {
 public int integerBreak(int n) {
	 if(n==2) return 1;
	 if(n==3) return 2;
	 if(n%3==0){
		 return (int) Math.pow(3, n/3);
	 }
	 else if(n%3==1){
		 return (int) (2*2*Math.pow(3, (n-4)/3));
	 }else {
		 return (int) (2*Math.pow(3, (n-2)/3));
	 }
 }
}
