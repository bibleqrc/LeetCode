/*66. Plus One My Submissions QuestionEditorial Solution
Total Accepted: 93599 Total Submissions: 281709 Difficulty: Easy
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

Subscribe to see which companies asked this question
 * 
 */

//据说谷歌很喜欢考这道题
package medium;

public class Plus_One {
	 public int[] plusOne(int[] digits) {
		 if(digits==null||digits.length==0)  return digits;
		 int carry = 1;
		 int len = digits.length;
		 for(int i = len-1;i>=0;i--){
			 int digit = (digits[i]+1)%10;
			 carry = (digits[i]+1)/10;
			 digits[i] = digit;
			 if(carry==0)  return digits;
		 }
		 int[] new_digits = new int[len+1];
		 new_digits[0]=1;
		 for(int i=1;i<=len;i++){
			 new_digits[i] = digits[i-1];
		 }
		 return new_digits;
	 }
	       
}
