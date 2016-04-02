/*
 * 318. Maximum Product of Word Lengths My Submissions QuestionEditorial Solution
Total Accepted: 16596 Total Submissions: 42370 Difficulty: Medium
Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

Example 1:
Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
Return 16
The two words can be "abcw", "xtfn".

Example 2:
Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
Return 4
The two words can be "ab", "cd".

Example 3:
Given ["a", "aa", "aaa", "aaaa"]
Return 0
No such pair of words.

Credits:
Special thanks to @dietpepsi for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 */

/*
 * 解题思路：

看到讨论区里面别人的解法，实在是太赞了。

思想是对于每个字符串，统计他所对应的字母出现与否，这是通过移位运算符来实现的。具体的，对于出现a，则将最右边的位数置为1，如果出现b，
则将1向右移动一位，将第二位的数字置为1；然后通过或运算实现对应位置的表示，如出现了a，则最右边的位置为1；出现了c，则从右向左数第三位的数字为1；

然后将每个字符串互相比较，通过位与运算符来比较，如果两个字符串没有重叠的字母，那么位与之后应该结果为0，否则为1；

然后判断位数相乘的结果
 */
package medium;

public class Maximum_Product_of_Word_Lengths {
  public int maxProduct(String[] words) {
        if(words==null||words.length==0) return 0;
        int len = words.length;
        int[] num = new int[len];
        int maxProduct = 0;
        int temp_num = 0;
        for(int i=0;i<len;i++){
        	String temp = words[i];
        	for(int j=0;j<temp.length();j++){
        		num[i]|=(1<<(temp.charAt(j)-'a'));
        	}
        }
        for(int i=0;i<len;i++){
        	for(int j=i+1;j<len;j++){
        		if(((num[i]&num[j])==0)){
        			temp_num = words[i].length()*words[j].length();
        		}
        		if(temp_num>maxProduct){
        			maxProduct = temp_num;
        		}
        	}
        }
        return maxProduct;
    }
}
