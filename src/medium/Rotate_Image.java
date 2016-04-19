/*48. Rotate Image My Submissions QuestionEditorial Solution Total Accepted: 65846 Total Submissions: 190519 Difficulty: Medium
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?

Subscribe to see which companies asked this question

Show Tags

 * 
 */
package medium;

public class Rotate_Image {
 public void rotate(int[][] matrix) {
       int n = matrix.length;
       if(n==0)  return;
       
       for(int i=0;i<n;i++){
    	   for(int j=i;j<n;j++){
    		   int temp=matrix[i][j];
    		   matrix[i][j] = matrix[j][i];
    		   matrix[j][i] = temp;
    	   }
       }
    	   for(int i=0;i<n;i++){
    		   for(int j=0;j<n/2;j++){
    			   int temp = matrix[i][j];
    			   matrix[i][j] = matrix[i][n-1-j];
    			   matrix[i][n-1-j]=temp;
    		   }
    	  }
       
    }
}
