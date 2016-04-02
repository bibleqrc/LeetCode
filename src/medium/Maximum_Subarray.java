/*53. Maximum Subarray My Submissions QuestionEditorial Solution Total Accepted: 105245 Total Submissions: 289355 Difficulty: Medium
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

click to show more practice.

Subscribe to see which companies asked this question
 * 
 */

package medium;

public class Maximum_Subarray {
public int maxSubArray(int[] nums) {
	
	     if(nums==null||nums.length==0)  return 0;
	     int sum[] = new int[nums.length];
	     sum[0] = nums[0];
	     int max = sum[0];
	     
	     //if(nums.length==1)  return nums[0];
	     
	     for(int i =1;i<nums.length;i++){
	    	 sum[i] = Math.max(sum[i-1]+nums[i], nums[i]);
	    	 max = Math.max(sum[i], max);
	     }
	     return max;  	    
   }
}
