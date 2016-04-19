/*11. Container With Most Water My Submissions QuestionEditorial Solution
Total Accepted: 74891 Total Submissions: 217332 Difficulty: Medium
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems
Have you met this question in a real interview? Yes  No
Discuss


 * 
 */
package medium;

public class Container_With_Most_Water {
  public int maxArea(int[] height) {
	  int len = height.length;
	  if(len==0)  return 0;
	  int low=0,high = len-1;
	  int max = 0;
	  int cap = 0;
	 
	  while(low<high){
		  cap = (high-low)*Math.min(height[high], height[low]);
		  if(max<cap){
			  max=cap;
		  }
		  
		  if(height[low]<height[high]){
			  low++;
		  }else{
			  high--;
		  }
	  }
	  
	  return  max;
	 }
}
