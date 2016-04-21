/*153. Find Minimum in Rotated Sorted Array   My Submissions QuestionEditorial Solution
Total Accepted: 88830 Total Submissions: 245868 Difficulty: Medium
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Find_Minimum_in_Rotated_Sorted_Array {
 public int findMin(int[] nums) {
	if(nums==null||nums.length==0) return 0;
	int l = 0;
	int r = nums.length-1;
	int min = nums[0];
	while(l<r-1){
		int m=(l+r)/2;
		if(nums[l]<nums[m]){
			min = Math.min(min, nums[l]);
			l=m+1;
		}else if(nums[l]>nums[m]){
			min = Math.min(min, nums[m]);
			r=m-1;
		}else{
			l++;
		}
	}
	min=Math.min(min, nums[l]);
	min=Math.min(min, nums[r]);
	return min;
 }
}
