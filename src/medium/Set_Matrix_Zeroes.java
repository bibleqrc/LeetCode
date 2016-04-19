/*73. Set Matrix Zeroes   My Submissions QuestionEditorial Solution Total Accepted: 64243 Total Submissions: 192539 Difficulty: Medium
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

click to show follow up.

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Set_Matrix_Zeroes {
   public void setZeroes(int[][] matrix) {
    
    int r=matrix.length;
    int c= matrix[0].length;
    
    if(r==0||c==0) return;
    
    int[] flag_row = new int[r];
    int[] flag_col = new int[c];
    
    for(int i=0;i<r;i++){
    	for(int j =0;j<c;j++){
    		if(matrix[i][j]==0){
    			flag_row[i]=1;
    			flag_col[j]=1;
    		}
    	}
    }
    	for(int i=0;i<r;i++){
    		for(int j=0;j<c;j++){
    			if(flag_row[i]==1||flag_col[j]==1){
    				matrix[i][j]=0;
    			}
    		}
    	}
    
  }
}
