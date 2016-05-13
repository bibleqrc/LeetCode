/*200. Number of Islands   My Submissions QuestionEditorial Solution Total Accepted: 44371 Total Submissions: 160019 Difficulty: Medium
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
 * 
 */
/*若是碰到一个1, 用DFS把与它相连的1 都换成0. 继续扫描，最后算出能有多少个 单独的 1.

Time Complexity: O(m*n), m = grid.length, n = grid[0].length. 看起来像 O(m^2 * n^2), 对于每一个点 做DFS 用O(m*n). 一共m*n个点。

其实每个点最多扫描两遍。

Space: O(m*n) 最多可以有O(m*n)层 stack. 
 * 
 */
package medium;

public class Number_of_Islands {
 public int numIslands(char[][] grid) {
    if(grid==null || grid.length==0 || grid[0].length==0){
    	return 0;
    }
    int res = 0;
    for(int i=0;i<grid.length;i++){
    	for(int j=0;j<grid[0].length;j++){
    		if(grid[i][j]=='1'){
    			res++;
    			replace(grid,i,j);
    		}
    	}
    }
    return res;
  }

private void replace(char[][] grid, int i, int j) {
	if(i<0 || i>=grid.length || j<0 ||j>=grid[0].length || grid[i][j]!='1'){
		return;
	}
	grid[i][j]='0';
	replace(grid,i-1,j);
	replace(grid,i+1,j);
	replace(grid,i,j-1);
	replace(grid,i,j+1);
}
}
