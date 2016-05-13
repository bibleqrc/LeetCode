/*16. 3Sum Closest   My Submissions QuestionEditorial Solution Total Accepted: 75369 Total Submissions: 259956 Difficulty: Medium
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
package medium;

import java.util.Arrays;

public class Three_Sum_Closest {
  public int threeSumClosest(int[] nums, int target) {
	  int val=0,sum,low,high;
	  int min = Integer.MAX_VALUE;
	  Arrays.sort(nums);
	  for(int i=0;i<nums.length-1;i++){
		  low = i+1;
		  high = nums.length-1;
		  while(low<high){
			  sum = nums[i]+nums[low]+nums[high];
			  if(Math.abs(sum-target)<=min){
				  min = Math.abs(sum-target);
				  val = sum;
			  }
			  if(sum-target==0){
				  return sum;
			  }else {
				  if(sum>target){
					  high--;
				  }else{
					  low++;
				  }
			  }
			  
		  }
	  }
	  return val;
  }
}
