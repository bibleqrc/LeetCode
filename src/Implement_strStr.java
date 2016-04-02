/*
 * 
 * 28. Implement strStr() My Submissions Question
Total Accepted: 98541 Total Submissions: 401275 Difficulty: Easy
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 */


public class Implement_strStr {
  public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null) return -1;
        
        if(needle.equals("")) return 0;
        int flag = 0;
        for(int i = 0;i<haystack.length();i++){
        	int j = i;
        	int m = needle.length();
        	if(i+m>haystack.length()) {  return -1; }
        	for(int k = 0;k<m;k++,j++){
        		if(haystack.charAt(j)==needle.charAt(k)){
        			if(k==m-1) return i;
        		}
        		else{
        			break;
        		}
        	}
        	
        }
        return -1;
    }
}
