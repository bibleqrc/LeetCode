/*306. Additive Number   My Submissions QuestionEditorial Solution
Total Accepted: 10285 Total Submissions: 40029 Difficulty: Medium
Additive number is a string whose digits can form additive sequence.

A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

For example:
"112358" is an additive number because the digits can form an additive sequence: 1, 1, 2, 3, 5, 8.

1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
"199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
1 + 99 = 100, 99 + 100 = 199
Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.

Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.

Follow up:
How would you handle overflow for very large input integers?

Credits:
Special thanks to @jeantimex for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 * 
 * 题解：

求String是否是additive number。这里我们要用到递归。就是先取第一个单词和第二个单词，求出sum，再跟剩下字符串的首部进行比较，然后进行递归。还有很多pruning可以做，比如取num1和num2时只用遍历一般的字符，因为假如这两个的和超过了字符串长的一半，肯定不符合规定。 二刷要注意精炼代码。

Time Complexity - O(2n)， Space Complexity - O(2n)
 */

package medium;

public class Additive_Number {
  public boolean isAdditiveNumber(String num) {
	  if(num==null || num.length()==0){      
		  return false;
	  }
	  
	  for(int i=1;i<num.length();i++){
		  for(int j=i+1;j<num.length();j++){
			  String s1 = num.substring(0,i);
			  String s2 = num.substring(i,j);
			  if(isAdditiveNumber(s1,s2,num.substring(j))){
				  return true;
			  }
		  }
	  }
	return false;
   }

private boolean isAdditiveNumber(String s1, String s2, String num) {
	if(num.length()==0){
		return true;
	}
	if((s1.length()>1 && s1.charAt(0)=='0') || (s2.length()>1 && s2.charAt(0)=='0')){
		return false;
	}
	
	String sum = getSum(s1,s2);
	if(sum.length()>num.length() || !sum.equals(num.substring(0,sum.length()))){
		return false;
	}else{
		return isAdditiveNumber(s2,sum,num.substring(sum.length()));
	}
}

private String getSum(String s1, String s2) {
	StringBuilder sb = new StringBuilder();
	int index1  = s1.length()-1,index2  = s2.length()-1;
	int carry=0,newDigit = 0;
	while(index1 >=0 || index2 >=0){
		int digitA  = index1>=0?s1.charAt(index1)-'0':0;
		int digitB  = index2>=0?s2.charAt(index2)-'0':0;
		newDigit=(digitA+digitB+carry)%10;
		sb.insert(0, newDigit);
		carry = (digitA+digitB+carry)>=10?1:0;
		index1--;
		index2--;
	}
	if(carry==1){
		sb.insert(0,'1');
	}
	
	return sb.toString();
}


}
