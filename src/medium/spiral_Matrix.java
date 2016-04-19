/*54. Spiral Matrix   My Submissions QuestionEditorial Solution
Total Accepted: 57259 Total Submissions: 255057 Difficulty: Medium
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
package medium;

import java.util.ArrayList;
import java.util.List;

public class spiral_Matrix {
public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> res = new ArrayList<Integer>();
     if(matrix==null||matrix.length==0)  return res;
     
     int row = matrix.length;
     int col = matrix[0].length;
     int x=0;
     int y=0;
     
     while(row>0&&col>0){
    	 if(row==1){
    		 for(int i=0;i<col;i++){
    			 res.add(matrix[x][y++]);
    		 }
    		 break;
    	 }else if(col==1){
    		 for(int j=0;j<row;j++){
    			 res.add(matrix[x++][y]);
    		 }
    		 break;
    	 }
    	 
    	 
    	 for(int i=0;i<col-1;i++){
    		 res.add(matrix[x][y++]);
    	 }
    	 
    	 for(int j=0;j<row-1;j++){
    		 res.add(matrix[x++][y]);
    	 }
    	 
    	 for(int i=0;i<col-1;i++){
    		 res.add(matrix[x][y--]);
    	 }
    	 
    	 for(int j=0;j<row-1;j++){
    		 res.add(matrix[x--][y]);
    	 }
    	 
    	 x++;
    	 y++;
    	 col=col-2;
    	 row=row-2;
     }
     
//     if(col>0){
//    	 for(int i=0;i<col-1;i++){
//    		 res.add(matrix[x][y++]);
//    	 }
//     }
//     
//     if(row>0){
//    	 for(int j=0;j<row-1;j++){
//    		 res.add(matrix[x++][y]);
//    	 }
//     }
     
     return res;
    }
}
