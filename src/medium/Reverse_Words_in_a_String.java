/*151. Reverse Words in a String My Submissions QuestionEditorial Solution Total Accepted: 102547 Total Submissions: 652986 Difficulty: Medium
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Update (2015-02-12):
For C programmers: Try to solve it in-place in O(1) space.

click to show clarification.

Clarification:
What constitutes a word?
A sequence of non-space characters constitutes a word.
Could the input string contain leading or trailing spaces?
Yes. However, your reversed string should not contain leading or trailing spaces.
How about multiple spaces between two words?
Reduce them to a single space in the reversed string.
Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Reverse_Words_in_a_String {
 public String reverseWords(String s) {
     if(s==null || s.length()==0) return "";
     
     String[] arr = s.split(" ");
     StringBuilder str = new StringBuilder();
     int len = arr.length;
     
     for(int i=len-1;i>=0;i--){
    	 if(!arr[i].equals("")){
    		 str.append(arr[i]).append(" ");
    	 }
     }
     return str.length()==0?"":str.substring(0,str.length()-1);
   }
}
