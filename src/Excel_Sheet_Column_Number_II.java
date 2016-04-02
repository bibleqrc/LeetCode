/*
 * 171. Excel Sheet Column Number My Submissions Question
Total Accepted: 71300 Total Submissions: 174082 Difficulty: Easy
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 * 
 */
public class Excel_Sheet_Column_Number_II {
	 public int titleToNumber(String s) {
	        int len = s.length();
	        int result = 0;
	        for(int i=0;i<len;i++){
	        	result = result*26+(s.charAt(i)-'A')+1;
	        }
	        
	        return result;
	    }
}
