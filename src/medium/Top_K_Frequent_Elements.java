/*347. Top K Frequent Elements   My Submissions QuestionEditorial Solution
Total Accepted: 2206 Total Submissions: 5056 Difficulty: Medium
Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
Subscribe to see which companies asked this question
 * 
 */

//
package medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Top_K_Frequent_Elements {
  public List<Integer> topKFrequent(int[] nums, int k) {
	List<Integer> result = new ArrayList<Integer>();
	HashMap<Integer,Integer> counter = new HashMap<Integer,Integer>();

    for(int i:nums){
    	if(counter.containsKey(i)){
    		counter.put(i, counter.get(i)+1);
    	}else{
    		counter.put(i, 1);
    	}
    }
    
    TreeMap<Integer,Integer> sortedMap = new TreeMap<Integer,Integer>(new ValueComparator(counter));
    sortedMap.putAll(counter);
    
    int i=0;
    for(Map.Entry<Integer, Integer> entry:sortedMap.entrySet()){
    	result.add(entry.getKey());
    	i++;
    	if(i==k){
    		break;
    	}
    }
    return result;
  }   
  
  class ValueComparator implements Comparator<Integer>{
	  HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
	  
	  public ValueComparator(HashMap<Integer,Integer> m){
		  map.putAll(m);
	  }
	  
	  public int compare(Integer i1,Integer i2){
		  int diff = map.get(i2)-map.get(i1);
		  
		  if(diff==0){
			  return 1;
		  }else{
			  return diff;
		  }
	  }
  }
}
