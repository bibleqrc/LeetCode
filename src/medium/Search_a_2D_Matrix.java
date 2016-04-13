/*74. Search a 2D Matrix My Submissions QuestionEditorial Solution Total Accepted: 75592 Total Submissions: 224798 Difficulty: Medium
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.

Subscribe to see which companies asked this question
 * 
 */

package medium;

public class Search_a_2D_Matrix {
	 public boolean searchMatrix(int[][] matrix, int target) {
	       if(matrix==null||matrix.length==0||matrix[0].length==0) return false;
	       
	       boolean result = false;
	       int m = matrix.length;
	       int n = matrix[0].length;
	       
	       for(int i=0;i<m;i++){
	    	   
	    	   if(target<matrix[i][0]) return false;
	    	   if(target>matrix[i][n-1])  continue;
	    	   
	    	   int low = 0;
	    	   int high = n-1;
	    	   int[] num = matrix[i];
	    	   
	    	   while(low<=high){
	    		   
	    		   int mid = low+(high-low)/2;
	    		   if(num[mid]==target){
	    			   return true;
	    		   }else{
	    			   if(num[mid]<target){
	    				   low = mid+1;
	    			   }else{
	    				   high = mid -1;
	    			   }
	    		   }
	    	   }
	       }
	        return result;
	    }
}
