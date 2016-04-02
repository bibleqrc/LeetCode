/*14. Longest Common Prefix My Submissions QuestionEditorial Solution
Total Accepted: 93728 Total Submissions: 336215 Difficulty: Easy
Write a function to find the longest common prefix string amongst an array of strings.

Subscribe to see which companies asked this question

Show Tags

 * 
 */
package easy;

public class Longest_Common_Prefix {
   public String longestCommonPrefix(String[] strs) {
	 if(strs==null||strs.length==0)  return "";
	 
	 StringBuilder res = new StringBuilder();
	 int index= 0;
	 int len = minlen(strs);
	 while(index<len){
		 for(int i=1;i<strs.length;i++){
			 if(strs[i].charAt(index)!=strs[0].charAt(index))
				 return res.toString();
		
		 }
		 res.append(strs[0].charAt(index));
		 index++;
	 }
	return res.toString();
 }

private int minlen(String[] strs) {
	int min = Integer.MAX_VALUE;
	for(int i=0;i<strs.length;i++){
		min=Math.min(min,strs[i].length());
	}
	return min;
}
}
