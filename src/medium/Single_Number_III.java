package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * 
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 * 
 */
public class Single_Number_III {
	 public int[] singleNumber(int[] nums) {
         Set<Integer> set = new HashSet<Integer>();
    	  int len = nums.length;
    	  
    	  for(int i=0;i<len;i++){
    		  if(!set.contains(nums[i])){
    			  set.add(nums[i]);
    		  }
    		  else{
    			  set.remove(nums[i]);
    		  }
    	  }
    	  

    	  ArrayList<Integer> list = new ArrayList<Integer>(set);
    	   int size = list.size();
    	  int[] a = new int[size];
    	  for(int i =0;i<size;i++){
    		  a[i]=list.get(i);
    	  }
    	 return a;
    }
}
