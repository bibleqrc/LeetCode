/*18. 4Sum   My Submissions QuestionEditorial Solution Total Accepted: 72352 Total Submissions: 303440 Difficulty: Medium
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
The solution set must not contain duplicate quadruplets.
    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

    A solution set is:
    (-1,  0, 0, 1)
    (-2, -1, 1, 2)
    (-2,  0, 0, 2)
Subscribe to see which companies asked this question
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
   public List<List<Integer>> fourSum(int[] nums, int target) {
     HashSet<ArrayList<Integer>> hashset = new HashSet<ArrayList<Integer>>();   
     List<List<Integer>> result = new ArrayList<List<Integer>>();
     Arrays.sort(nums);
     
     for(int i=0;i<=nums.length-4;i++){
    	 for(int j=i+1;j<=nums.length-3;j++){
    		int low = j+1;
    		int high = nums.length-1;
    		
    		while(low<high){
    			int sum = nums[i]+nums[j]+nums[low]+nums[high];
    			
    			if(sum>target){
    				high--;
    			}else if(sum<target){
    				low++;
    			}else if(sum==target){
    				ArrayList<Integer> temp =  new ArrayList<Integer>();
    				temp.add(nums[i]);
    				temp.add(nums[j]);
    				temp.add(nums[low]);
    				temp.add(nums[high]);
    				
    				if(!hashset.contains(temp)){
    					hashset.add(temp);
    					result.add(temp);
    				}
    				
    				low++;
    				high--;
    			}
    		}
    	 }
     }
     return result;
   }
}
