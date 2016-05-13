/*201. Bitwise AND of Numbers Range   My Submissions QuestionEditorial Solution Total Accepted: 33346 Total Submissions: 109712 Difficulty: Medium
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

For example, given the range [5, 7], you should return 4.

Credits:
Special thanks to @amrsaqr for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Bitwise_AND_of_Numbers_Range {
    public int rangeBitwiseAnd(int m, int n) {
      int count = 0;
      while(m!=n){
    	  m=m>>1;
    	  n=n>>1;
    	  count++;
      }
      return m<<count;
  }
}
