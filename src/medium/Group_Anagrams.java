/*49. Group Anagrams My Submissions QuestionEditorial Solution
Total Accepted: 70994 Total Submissions: 261501 Difficulty: Medium
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
 public List<List<String>> groupAnagrams(String[] strs) {
	  Map<String, List<String>> map =new HashMap<String,List<String>>();  
	  for(String str:strs){
		  char[] carr = str.toCharArray();       
		  Arrays.sort(carr);               //单词按照字母排序
		  String key = new String(carr);
		  List<String> list  = map.get(key);
		  if(list==null){
			  list = new ArrayList<String>();
		  }
		  list.add(str);
		  map.put(key, list);
	  }
	  List<List<String>> res  = new ArrayList<List<String>>();
	  
	  for(String key:map.keySet()){
		  List<String> curr = map.get(key);
		  Collections.sort(curr);        //列表按照单词排序
		  res.add(curr);
	  }
	  return res;
	  }
}
