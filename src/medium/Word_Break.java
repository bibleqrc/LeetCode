/*139. Word Break   My Submissions QuestionEditorial Solution Total Accepted: 86454 Total Submissions: 340314 Difficulty: Medium
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

Subscribe to see which companies asked this question
 * 
 */

/*The key to solve this problem by using dynamic programming approach:

Define an array t[] such that t[i]==true => 0-(i-1) can be segmented using dictionary
Initial state t[0] == true
 * 
 */
package medium;

import java.util.Set;

public class Word_Break {
  public boolean wordBreak(String s, Set<String> wordDict) {
    boolean[] t = new boolean[s.length()+1];
    t[0]=true;
    
    for(int i=0;i<s.length();i++){
    	if(!t[i]){
    		continue;
    	}
    	
    	for(String str :wordDict){
    		int len = str.length();
    		int end = i+len;
    		if(end>s.length()){
    			continue;
    		}
    		if(t[end]) continue;
    		
    		if(s.substring(i,end).equals(str)){
    			t[end] = true;
    		}
    	}
    }
    return t[s.length()];
  }
}
