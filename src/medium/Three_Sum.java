package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three_Sum {
 public List<List<Integer>> threeSum(int[] nums) {
	  List<List<Integer>> res = new ArrayList<List<Integer>>();
	  if(nums.length<3||nums==null)  return res;
	  HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
	  int sum,low,high;
	 
	  Arrays.sort(nums);
	  for(int i=0;i<nums.length-2;i++){
		  low = i+1;
		  high = nums.length-1;
		  while(low<high){
			  sum = nums[i]+nums[low]+nums[high];
			  if(sum==0){
                  ArrayList<Integer> temp = new ArrayList<Integer>();
                  temp.add(nums[i]);
                  temp.add(nums[low]);
                  temp.add(nums[high]);
                  
                  if(!set.contains(temp)){
                	  set.add(temp);
                	  res.add(temp);
                  }
                  
                  low++;
                  high--;
 
			  }else {
				  if(sum>0){
					  high--;
				  }else{
					  low++;
				  }
			  }
			  
		  }
	  }
	  return res;        
	  
 }
}
