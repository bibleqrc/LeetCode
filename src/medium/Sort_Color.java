/*75. Sort Colors My Submissions QuestionEditorial Solution
Total Accepted: 93467 Total Submissions: 271034 Difficulty: Medium
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

click to show follow up.

Subscribe to see which companies asked this question
 * 
 */

//就是把[2，1，0，1，0，2]  排成[0,0,1,1,2,2]

package medium;

public class Sort_Color {
     public void sortColors(int[] nums){
    	 if(nums==null||nums.length==0)  return;
    	 int i = 0;
    	 int pl=0;
    	 int pr = nums.length-1;
    	 while(i<=pr){
    		 if(nums[i]==0){
    			 swap(nums,i,pl);
    			 i++;
    			 pl++;
    		 }else if(nums[i]==1){
    			 i++;
    		 }else{
    			 swap(nums,i,pr);
    			 pr--;
    		 }
    	 }
    	 
     }

	private void swap(int[] nums, int i, int pl) {
		int temp = nums[i];
		nums[i] = nums[pl];
		nums[pl] = temp;	
	}
}
