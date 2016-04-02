/*
 * Maximal Square Total Accepted: 1312 Total Submissions: 6388
Given a 2D binary matrix filled with 0's and 1's, find the largest square containing all 1's and return its area.
For example, given the following matrix:
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
Return 4.
[思路]
dynamic programing.  以当前点(x,y) = '1' 为右下角的最大正方形的边长f(x,y) = min( f(x-1,y), f(x,y-1), f(x-1,y-1)) + 1.
递推公式已建立, dp就自然而然了.
 * 
 */
public class Maximal_Square {
	 public int maximalSquare(char[][] matrix) {
	      if(matrix==null||matrix.length==0||matrix[0].length==0)  return 0;
	      
	      int n = matrix.length;
	      int m = matrix[0].length;
	      
	      int[][] d =new int[n][m];
	      int max = 0;
	      
	      for(int i=0;i<n;i++){
	    	  if(matrix[i][0]=='1'){
	    		  d[i][0]=1;
	    		  max=1;
	    	  }
	      }
	      
	      for(int j=0;j<m;j++){
	    	  if(matrix[0][j]=='1'){
	    		  d[0][j]=1;
	    		  max=1;
	    	  }
	      }
	      
	      for(int i=1;i<n;i++){
	    	  for(int j=1;j<m;j++){
	    		 if(matrix[i][j]=='0') d[i][j]=0;
	    		 else{
	    			 d[i][j]=Math.min(Math.min(d[i-1][j],d[i-1][j-1]), d[i][j-1])+1;
	    			 max = Math.max(max, d[i][j]);
	    		 }
	    	  }
	      }
	      
	      return max*max;
	    }
}
