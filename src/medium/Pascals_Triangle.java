/*118. Pascal's Triangle My Submissions QuestionEditorial Solution
Total Accepted: 79025 Total Submissions: 239256 Difficulty: Easy
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
package medium;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
	 public List<List<Integer>> generate(int numRows) {
	       List<List<Integer>> list = new ArrayList<List<Integer>>();
	       if(numRows==0)  return list;
	       List<Integer> t = new ArrayList<Integer>();
	       t.add(1);
	       list.add(t);
	       for(int i=2;i<=numRows;i++){
	    	   List<Integer> tt  = new ArrayList<Integer>();
	    	   tt.add(1);
	    	   for(int j=1;j<=i-2;j++){
	    		   tt.add(list.get(i-2).get(j-1)+list.get(i-2).get(j));
	    	   }
	    	   tt.add(1);
	    	   list.add(tt);
	       }
	       return list;
	    }
}
