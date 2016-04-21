/*80. Remove Duplicates from Sorted Array II   My Submissions QuestionEditorial Solution
Total Accepted: 72820 Total Submissions: 222940 Difficulty: Medium
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Remove_Duplicates_from_Sorted_Array_II {
  public int removeDuplicates(int[] nums) {
    if(nums==null||nums.length==0){
    	return 0;
    }
    int count = 1;
    int limit = 0;
    for(int i=1;i<nums.length;i++){
    	if(nums[i]!=nums[i-1]){
    		nums[count++]=nums[i];
    		limit=0;
    	}else if(nums[i]==nums[i-1]&&limit<1){
    		nums[count++]=nums[i];
    		limit++;
    	}
    }
    return count;
  }
}
