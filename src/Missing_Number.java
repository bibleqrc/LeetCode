/*
 * 268. Missing Number My Submissions QuestionEditorial Solution
Total Accepted: 44828 Total Submissions: 112859 Difficulty: Medium
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
public class Missing_Number {
	  public int missingNumber(int[] nums) {
	        int xor=0;
	        for(int i=0;i<nums.length;i++){
	            xor^=i^nums[i];
	        }
	        return xor^nums.length;
	    }
}
