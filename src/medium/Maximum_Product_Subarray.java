/*152. Maximum Product Subarray My Submissions QuestionEditorial Solution Total Accepted: 59842 Total Submissions: 267692 Difficulty: Medium
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.

Subscribe to see which companies asked this question
 * 
 */

/*一次循环其实就可以解决问题，因为数组中出现正数负数，所以我们需要记录到某个位置时的最大值与最小值，因为最小值可能在下一步乘以负数就变成最大值啦。
 * 
 */
package medium;

public class Maximum_Product_Subarray {
  public int maxProduct(int[] nums) {
	if(nums.length<1){
		return 0;
	}
	int min_temp = nums[0];
	int max_temp = nums[0];
	int result = nums[0];
	for(int i=1;i<nums.length;i++){
		int a = max_temp*nums[i];
		int b = min_temp*nums[i];
		int c = nums[i];
		max_temp = Math.max(Math.max(a, b), c);
		min_temp = Math.min(Math.min(a, b), c);
		result = max_temp>result?max_temp:result;
	}
	return result;
  }
}
