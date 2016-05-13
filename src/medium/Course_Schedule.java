/*207. Course Schedule   My Submissions QuestionEditorial Solution Total Accepted: 38414 Total Submissions: 142583 Difficulty: Medium
There are a total of n courses you have to take, labeled from 0 to n - 1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

For example:

2, [[1,0]]
There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.

2, [[1,0],[0,1]]
There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * 
 */

/*http://www.cnblogs.com/TinyBobo/p/4544860.html
 * 
 * 思路：首先要里解题意 一些课程有先修课程--这些课程必须先学，类似下面的图片，这个就是典型的有向图的拓扑排序



步骤1：找到一个入度为零的顶点

步骤2：从图中删除这个顶点

步骤3：循环1、2 如果所有顶点都走过了 那么就是一个可以完成的图

其次还要了解题中算法的输入 numCourse为要选的课的总数 而prerequisite矩阵是先决条件矩阵（开始一直以为是邻接矩阵）

所以，第一步要先将给出的矩阵，换算出邻接矩阵(也可以是邻接链表)，然后再步步进行。
 * 
 * 
 */
package medium;

import java.util.Stack;

public class Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int[][] matrix = new int[numCourses][numCourses];
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<prerequisites.length;i++){
        	if(matrix[prerequisites[i][1]][prerequisites[i][0]]==1){ continue;} //输入有重复
        		indegree[prerequisites[i][0]]++;  //入度加一
        		matrix[prerequisites[i][1]][prerequisites[i][0]]=1;  //p中[j]<-[i]
        	
        }
        
        for(int i=0;i<numCourses;i++){
        	if(indegree[i]==0){      //将入度为0的压入栈
         		stack.push(i);  
        	}
        }
        
        while(!stack.isEmpty()){
        	int temp = stack.pop();  //删掉入度为零的点所有连出的线 
        	for(int i=0;i<numCourses;i++){   //每删掉一个 将对应的入度减一
        		if(matrix[temp][i]==1){
        			matrix[temp][i]=0;
        			indegree[i]--;  //如果减去后i对应的入度为0 则将其入栈
        			if(indegree[i]==0){
        				stack.push(i);
        			}
        		}
        	}
        }
        
        for(int i=0;i<numCourses;i++){      //判断是否有入度不为0的点
        	if(indegree[i]>0){
        		return false;
        	}
        }
        
        return true;
    }
}
