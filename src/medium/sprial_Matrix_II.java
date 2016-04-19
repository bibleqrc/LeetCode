/*59. Spiral Matrix II   My Submissions QuestionEditorial Solution
Total Accepted: 51501 Total Submissions: 147749 Difficulty: Medium
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
Subscribe to see which companies asked this question
 * 
 */
package medium;

public class sprial_Matrix_II {
   public int[][] generateMatrix(int n) {
     if(n<0) {
    	 return null;
     }
     
     int [][] res = new int[n][n];
     int temp=n;
     int x=0;
     int y=0;
     int num=1;
     while(temp>0){
    	 for(int i=0;i<temp-1;i++){
    		 res[x][y++]=num++;
    	 }
    	 for(int j=0;j<temp-1;j++){
    		 res[x++][y]=num++;
    	 }
    	 for(int i=0;i<temp-1;i++){
    		 res[x][y--]=num++;
    	 }
    	 for(int j=0;j<temp-1;j++){
    		 res[x--][y]=num++;
    	 }
    	 x++;
    	 y++;
    	 temp=temp-2;
     }
     if((n&1)==1){
    	 res[n/2][n/2]=num;
    	 
     }
     return res;
  }
}
