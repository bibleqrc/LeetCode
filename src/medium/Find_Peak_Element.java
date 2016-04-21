/*162. Find Peak Element   My Submissions QuestionEditorial Solution
Total Accepted: 62966 Total Submissions: 190980 Difficulty: Medium
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

click to show spoilers.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Find_Peak_Element {
 public int findPeakElement(int[] nums) {
//    if(nums.length==1) return nums[0];
//    if(nums.length==2) return nums[0]>nums[1]?nums[0]:nums[1];
//    for(int i=1;i<nums.length-1;i++){
//    	if((nums[i]>nums[i-1])&&(nums[i]<nums[i+1])){
//    		return i;
//    	}
//    }
//    return nums.length-1;
	 
	 
	 //solution one
	 /*
	 if(nums.length==0)  return -1;
	 if(nums.length==1)  return 0;
	 for(int i=1;i<nums.length;i++){
		 if(nums[i-1]>nums[i]){
			 return i-1;
		 }
	 }
	 return nums.length-1;
	 */
	 
	 
	 //solution two
	 int left=0;
	 int right=nums.length-1;
	 
	 while(left<=right){
		 if(left==right){
			 return left;
		 }
		 
		 int mid=left+(right-left)/2;
		 if(nums[mid]>nums[mid+1]){
			 right=mid;
		 }else{
			 left=mid+1;
		 }
	 }
	 return -1;
   }
}
