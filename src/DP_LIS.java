/*
 *  Longest Increasing Subsequence My Submissions Question
Total Accepted: 22542 Total Submissions: 66304 Difficulty: Medium
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?

Credits:
Special thanks to @pbrother for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
public class DP_LIS {
	
	//动态规划做法
   public int lengthOfLIS(int[] nums) {
       if(nums==null||nums.length==0) return 0;
       int max =1;
       int [] dp = new int[nums.length];
       for(int i=0;i<nums.length;i++){
    	   dp[i]=1;
    	   for(int j=0;j<i;j++){
    		   if(nums[j]<nums[i]){
    			   dp[i] = Math.max(dp[i], dp[j]+1);
    		   }
    	   }
    	   max = Math.max(max, dp[i]);
       }
       return max;
    }
	
	//运用列表       http://www.cnblogs.com/Dylan-Java-NYC/p/4935660.html
//	public int lengthOfLIS(int[] nums) {
//		if(nums==null||nums.length==0){
//			return 0;
//		}
//		int max=1;
//		int []minLast = new int[nums.length];
//		minLast[0]=nums[0];
//		for(int i=1;i<nums.length;i++){
//			int pos=bs(minLast,0,max-1,nums[i]);
//			minLast[pos] = nums[i];
//			if(pos+1>max){
//				max=pos+1;
//			}
//		}
//		return max;
//	}
//	
//	private int bs(int [] nums,int l,int r,int key){
//		if(nums[r]<key){
//			return r+1;
//		}
//		while(l<r){
//			int mid=1+(r-l)/2;
//			if(nums[mid]<key){
//				l=mid+1;
//			}else{
//				r=mid;
//			}
//		}
//		return l;
//	}
}
