/*131. Palindrome Partitioning   My Submissions QuestionEditorial Solution
Total Accepted: 64553 Total Submissions: 233719 Difficulty: Medium
Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

  [
    ["aa","b"],
    ["a","a","b"]
  ]
Subscribe to see which companies asked this question
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
	   //dfs+检测
	 public List<List<String>> partition(String s) {
	    List<List<String>> result = new ArrayList<List<String>>();
	    if(s==null || s.length()==0){
	    	return result;
	    }
	    
	    ArrayList<String> partition = new ArrayList<String>();
	    addPalindrome(s,0,partition,result);
	    
	    return result;
	  }

	private void addPalindrome(String s, int start, ArrayList<String> partition, List<List<String>> result) {
	    
		if(start==s.length()){
			ArrayList<String> temp = new ArrayList<String>(partition);
			result.add(temp);
			return;
		}
		
		for(int i=start+1;i<=s.length();i++){
			String str = s.substring(start,i);
			if(isPalindrome(str)){
				partition.add(str);
				addPalindrome(s,i,partition,result);
				partition.remove(partition.size()-1);
			}
		}
	 
	}

	private boolean isPalindrome(String str) {
		int left  =0;
		int right = str.length()-1;
		while(left<right){
			if(str.charAt(left)!=str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}  
}
