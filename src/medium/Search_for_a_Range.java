/*34. Search for a Range   My Submissions QuestionEditorial Solution
Total Accepted: 81549 Total Submissions: 279834 Difficulty: Medium
Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 * 
 */
package medium;

public class Search_for_a_Range {
    public int[] searchRange(int[] nums, int target) {
      int[] res = {-1,-1};
      if(nums==null||nums.length==0){
    	  return res;
      }
      
      //first iteration, find target wherever it is
      int low = 0;
      int high = nums.length-1;
      int pos=0;
      while(low<=high){
    	  int mid = (low+high)/2;
    	  pos=mid;
    	  if(nums[mid]>target){
    		  high = mid-1;
    	  }else if(nums[mid]<target){
    		  low=mid+1;
    	  }else{
    		  res[0] = pos;
    		  res[1] = pos;
    		  break;
    	  }
      }
      
      if(nums[pos]!=target){
    	  return res;
      }
      
    //second iteration, find the right boundary of this target
     int newlow=pos;
     int newhigh = nums.length-1;
     while(newlow<=newhigh){
    	 int newmid = (newlow+newhigh)/2;
    	 if(nums[newmid]==target){
    		 newlow = newmid+1;
    	 }else{
    		 newhigh = newmid-1;
    	 }
     }
     res[1] = newhigh;
     
     //third iteration, find the left boundary of this target
     newlow = 0;
     newhigh = pos;
     while(newlow <=newhigh){
    	 int newmid = (newlow+newhigh)/2;
    	 if(nums[newmid]==target){
    		 newhigh = newmid-1;
    	 }else{
    		 newlow =newmid+1;
    	 }
     }
     res[0] = newlow;
     
     return res;
    }
}
