/*
 * 35. Search Insert Position My Submissions QuestionEditorial Solution
Total Accepted: 99978 Total Submissions: 269500 Difficulty: Medium
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

Subscribe to see which companies asked this question
 */
package medium;

public class Search_Insert_Position {
	 public int searchInsert(int[] nums, int target) {
	   if(nums==null||nums.length==0)  return 0;
	   if(target<nums[0])    return 0;
	   int len = nums.length;
	   for(int i=0;i<len-1;i++){
		   if(nums[i]==target) return i;
		   else{
			   if(target>nums[i]&&target<nums[i+1]) return (i+1);
		   }
	   }
	   if(nums[len-1]==target)  return len-1;
	   else return len;
 }
}
