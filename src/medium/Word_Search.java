/*79. Word Search   My Submissions QuestionEditorial Solution Total Accepted: 75092 Total Submissions: 325623 Difficulty: Medium
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
Subscribe to see which companies asked this question
 * 
 */

/*在给定数组char[][] board中，搜寻是否有给定单词，搜寻方式为：

1）只能上下左右四个方向搜寻；

2）每个位置只能使用一次。

依然DFS
 * 
 */
package medium;

public class Word_Search {
  public boolean exist(char[][] board, String word) {
    
	  if(board.length<1 || board[0].length<1){
		  return false;
	}
	  if(word.length()<1){
		  return true;
	  }
	  boolean flag = false;
	  boolean[][] bBoard = new boolean[board.length][board[0].length];
	  
	  for(int i=0;i<board.length;i++){
		  for(int j=0;j<board[0].length;j++){
			  if(board[i][j]==word.charAt(0))
				  flag = dfs(board,bBoard,word.substring(1),i,j);
			  if(flag){
				  return true;
			  }
		  }
	  }
	  return false;
  }

private boolean dfs(char[][] board, boolean[][] bBoard, String word, int row, int col) {
   if(word.equals("")){
	   return true;
   }
   bBoard[row][col] = true;
   boolean flag = false;
   
   if(row>=1&&!bBoard[row-1][col] && board[row-1][col]==word.charAt(0)){
	   flag = dfs(board,bBoard,word.substring(1),row-1,col);
   }
   if(flag){
	   return true;
   }
   
   if(row<board.length-1&&!bBoard[row+1][col] && board[row+1][col]==word.charAt(0)){
	   flag = dfs(board,bBoard,word.substring(1),row+1,col);
   }
   if(flag){
	   return true;
   }
   if(col>=1&&!bBoard[row][col-1] && board[row][col-1]==word.charAt(0)){
	   flag = dfs(board,bBoard,word.substring(1),row,col-1);
   }
   if(flag){
	   return true;
   }
   
   if(col<board[0].length-1&&!bBoard[row][col+1] && board[row][col+1]==word.charAt(0)){
	   flag = dfs(board,bBoard,word.substring(1),row,col+1);
   }
   if(flag){
	   return true;
   }
   
   bBoard[row][col] = false;
   
   return false;
}
}
