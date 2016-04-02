import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * 38. Count and Say My Submissions Question
Total Accepted: 75519 Total Submissions: 265254 Difficulty: Easy
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
public class Count_and_Say {
	 public String countAndSay(int n) {
//		    if(n<=0) return "";
//	        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
//	        while(n!=0){
//	        	int a = n%10;
//	        	if(!map.containsKey(a)){
//	        		map.put(a, 1);
//	        	}else{
//	        		map.put(a, map.get(a)+1);
//	        	}
//	        	n=n/10;
//	        }
//	        
//	        StringBuffer s =new StringBuffer();
//	        for (int key : map.keySet()) {   
//	         
//	          s.append(map.get(key)); s.append(key);
//	        }
//	        
//	        return s.toString();
		 
		 if(n<=0)  return "";
		 String curRes ="1";
		 int start = 1;
		 while(start<n){
			 StringBuilder res = new StringBuilder();
			 int count = 1;
			 for(int j=1;j<curRes.length();j++){
				 if(curRes.charAt(j)==curRes.charAt(j-1))
					  count++;
				 else{
					 res.append(count);
					 res.append(curRes.charAt(j-1));
					 count=1;
				 }
			 }
			 res.append(count);
			 res.append(curRes.charAt(curRes.length()-1));
			 curRes = res.toString();
			 start++;
		 }
		 return curRes;
	    }
}
