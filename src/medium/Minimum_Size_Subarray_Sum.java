/*209. Minimum Size Subarray Sum   My Submissions QuestionEditorial Solution Total Accepted: 37857 Total Submissions: 140774 Difficulty: Medium
Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.

click to show more practice.

Credits:
Special thanks to @Freezen for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
/*维护一个window, 当sum<s时一直移动window 的 right index, 同时更新sum.

当sum >= s后一直移动window left index, 同时更新sum 和 res.

最后返回时看res 是否 被更新过，若被更新过就返回 res, 没有更新过说明没有符合要求的window, 返回0.

Note: right的初始值是0, 所以每次更新sum 后 right 是指向了下个没有加进sum里的数值. 外循环while中的第二部分检测sum 是否 >=0 时必须使用while 循环而不是if.

e.g. [1,2,3,4,5] s = 11. 当第一次出现sum > s时 sum = 15, right = 5, 如果下面使用if 的话，只会更新一次res = 5 就会跳出外循环while, 应为此时right= 5已经不满足 外魂环while loop, right < nums.length的条件了。
 * 
 */
package medium;

public class Minimum_Size_Subarray_Sum {
  public int minSubArrayLen(int s, int[] nums) {
    if(nums==null || nums.length==0){
    	return 0;
    }
    int res = Integer.MAX_VALUE;
    int left  =0;
    int right = 0;
    int sum = 0;
    while(left<nums.length && right<nums.length){
    	while(right<nums.length && sum<s){
    		sum+=nums[right];
    		right++;
    	}
    	while(sum>=s){
    		res = Math.min(res, right-left);
    		sum -=nums[left];
    		left++;
    	}
    }
    return res == Integer.MAX_VALUE?0:res;
    		
  }
}
