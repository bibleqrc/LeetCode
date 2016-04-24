/*90. Subsets II   My Submissions QuestionEditorial Solution
Total Accepted: 65822 Total Submissions: 216016 Difficulty: Medium
Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
Subscribe to see which companies asked this question
 * 
 */
package medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
public List<List<Integer>> subsetsWithDup(int[] nums) {
     List<List<Integer>> res = new ArrayList<List<Integer>>();
     if(nums==null||nums.length==0){
    	 return res;
     }
     
     Arrays.sort(nums);
     res.add(new ArrayList<Integer>());
     for(int i=0;i<nums.length;i++){
    	 int size=res.size();
    	 for(int j=0;j<size;j++){
    		 ArrayList<Integer> elem = new ArrayList<Integer>(res.get(j));
    		 elem.add(nums[i]);
    		 if(!res.contains(elem)){
    			 res.add(elem);
    		 }
    	 }
     }
     return res;
    }
}
