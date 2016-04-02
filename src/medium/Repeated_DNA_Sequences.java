/*
 * 187. Repeated DNA Sequences My Submissions QuestionEditorial Solution Total Accepted: 40407 Total Submissions: 162907 Difficulty: Medium
All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
 */

package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repeated_DNA_Sequences {
public List<String> findRepeatedDnaSequences(String s) {
     List<String>  res = new ArrayList<String>();
     if(s==null||s.length()<11)  return res;
     HashSet<String> set = new HashSet<String>();
     for(int i=0;i<=s.length()-10;i++){
    	 String a=s.substring(i, i+10);
    	 if(set.contains(a)&&!res.contains(a)){
    		 res.add(a);
    	 }else{
    		 set.add(a);
    	 }
     }
     return res;
    }
}
