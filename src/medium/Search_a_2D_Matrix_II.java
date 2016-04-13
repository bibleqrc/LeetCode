/*240. Search a 2D Matrix II My Submissions QuestionEditorial Solution Total Accepted: 33380 Total Submissions: 97583 Difficulty: Medium
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */

/*分治法，以矩形中点为基准，将矩阵拆分成左上，左下，右上，右下四个区域

若中点值 < 目标值，则舍弃左上区域，从其余三个区域再行查找

若中点值 > 目标值，则舍弃右下区域，从其余三个区域再行查找

时间复杂度递推式：T(n) = 3T(n/2) + c

相关博文：http://articles.leetcode.com/2010/10/searching-2d-sorted-matrix-part-ii.html
 * 
 */
package medium;

public class Search_a_2D_Matrix_II {
	 public boolean searchMatrix(int[][] matrix, int target) {
	        int n=matrix.length, m =matrix[0].length;
	        return helper(matrix,0,n-1,0,m-1,target);
	    }

	private boolean helper(int[][] matrix, int rowStart, int rowEnd, int colStart, int colEnd, int target) {
		if(rowStart>rowEnd||colStart>colEnd)  return false;
	    
		int row_middle=(rowStart+rowEnd)/2;
		int col_middle=(colStart+colEnd)/2;
		if(matrix[row_middle][col_middle]==target){
			return true;
		}else if(matrix[row_middle][col_middle]>target){
			return helper(matrix,rowStart,row_middle-1,colStart,col_middle-1,target)||
					helper(matrix,row_middle,rowEnd,colStart,col_middle-1,target)||
					helper(matrix,rowStart,row_middle-1,col_middle,colEnd,target);
		}else{
			return  helper(matrix,row_middle+1,rowEnd,col_middle+1,colEnd,target)||
					helper(matrix,row_middle+1,rowEnd,colStart,col_middle,target)||
					helper(matrix,rowStart,row_middle,col_middle+1,colEnd,target);
		}
	}
}
