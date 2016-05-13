/*84. Largest Rectangle in Histogram   My Submissions QuestionEditorial Solution Total Accepted: 58589 Total Submissions: 242458 Difficulty: Hard
Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.


Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].


The largest rectangle is shown in the shaded area, which has area = 10 unit.

For example,
Given heights = [2,1,5,6,2,3],
return 10.

Subscribe to see which companies asked this question
 * 
 */

//http://www.cnblogs.com/lichen782/p/leetcode_Largest_Rectangle_in_Histogram.html
package medium;

import java.util.Arrays;
import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
 public int largestRectangleArea(int[] heights) {
//	if(heights==null||heights.length==0) return 0;
//    Arrays.sort(heights);
//    int len = heights.length;
//    int area = len*heights[0];
//    for(int i=1;i<len;i++){
//    	if(heights[i]==heights[i-1]){
//    		continue;
//    	}else{
//    		area = Math.max(area, heights[i]*(len-i));
//    	}
//    }
//    return area;
//    
	 Stack<Integer> stack = new Stack<Integer>();
	 int i=0;
	 int maxArea = 0;
	 int[] h = new int[heights.length+1];
	 h = Arrays.copyOf(heights, heights.length+1);
	 while(i<h.length){
		 if(stack.isEmpty()||h[stack.peek()]<=h[i]){
			 stack.push(i++);
		 }else{
			 int t = stack.pop();
			 maxArea = Math.max(maxArea, h[t]*(stack.isEmpty()?i:i-stack.peek()-1));
		 }
	 }
	 return maxArea;
   }
}
