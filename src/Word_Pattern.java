import java.util.*;

/*
 * 
 * 290. Word Pattern My Submissions Question
Total Accepted: 26733 Total Submissions: 94996 Difficulty: Easy
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.

Credits:
Special thanks to @minglotus6 for adding this problem and creating all test cases.
 */

public class Word_Pattern {
   
	public boolean wordPattern(String pattern, String str) {
        char[]  patterns = pattern.toCharArray();
        Map<Character,String> maps = new HashMap<>();
        String[] strs = str.split(" ");
        
        if(!(patterns.length==strs.length))
            return false;
            
        for(int i = 0;i<patterns.length;i++)
        {
            char ch = patterns[i];
            if(maps.containsKey(ch))
            {
                String value = maps.get(ch);
                if(!value.equals(strs[i]))
                    return false;
            }
            else{
                if(maps.containsValue(strs[i]))
                    return false;
                 maps.put(ch,strs[i]);
            }
        }
        
        return true;
   }
	
}
