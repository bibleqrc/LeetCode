package medium;

/*
 * 
 * 136. Single Number My Submissions QuestionEditorial Solution
Total Accepted: 121431 Total Submissions: 246513 Difficulty: Medium
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems


The key to solve this problem is bit manipulation. XOR will return 1 only on two different bits. So if two numbers are the same, 
XOR will return 0. Finally only one number left.

 */

public class Single_Number {
	 public int singleNumber(int[] nums) {
	        int n=0;
	        for(int A:nums){
	            n=n^A;
	        }
	        return n;
	    }
}
