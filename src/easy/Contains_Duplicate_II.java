/*219. Contains Duplicate II My Submissions QuestionEditorial Solution Total Accepted: 52183 Total Submissions: 175977 Difficulty: Easy
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
package easy;

import java.util.HashMap;

public class Contains_Duplicate_II {
 public boolean containsNearbyDuplicate(int[] nums, int k) {
	 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	 if(nums==null||nums.length==0)  return false;
	 for(int i=0;i<nums.length;i++){
		 if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
//			 int j=map.get(nums[i]);
//			 if(Math.abs(i-j)<=k) return true;
			 return true;
		 }else {
			 map.put(nums[i], i);
		 }
	 }
	 return false;
	}
}
