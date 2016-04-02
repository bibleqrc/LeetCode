/*
 * 205. Isomorphic Strings My Submissions QuestionEditorial Solution
Total Accepted: 51796 Total Submissions: 177464 Difficulty: Easy
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 */
public class Isomorphic_Strings {
 public boolean isIsomorphic(String s, String t) {
         
		 int len1 = s.length();
		 int len2 = t.length();
		 
		 if(len1!=len2)  return false;
		 if(len1==1)   return true;
		 
		 HashMap<Character,Character> map = new HashMap<Character,Character>();
		 for(int i=0;i<len1;i++){
			 if(!map.containsKey(s.charAt(i))&&!map.containsValue(t.charAt(i))){
				 map.put(s.charAt(i), t.charAt(i));
			 }
			 
			 if(map.get(s.charAt(i))==null)  return false;
			 
			 if(!map.get(s.charAt(i)).equals(t.charAt(i))){
				 return false;
			 }
		 }
		 return true;
    }
}
