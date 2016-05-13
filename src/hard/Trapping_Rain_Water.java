/*42. Trapping Rain Water   My Submissions QuestionEditorial Solution Total Accepted: 66377 Total Submissions: 205259 Difficulty: Hard
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

Subscribe to see which companies asked this question
 * 
 */
/*
 * 解题思路
首先，碰到这样的题目不要慌张，挨个分析每个A[i]能trapped water的容量，然后将所有的A[i]的trapped water容量相加即可

其次，对于每个A[i]能trapped water的容量，取决于A[i]左右两边的高度（可延展）较小值与A[i]的差值，即volume[i] = [min(left[i], right[i]) - A[i]] * 1，这里的1是宽度，如果the width of each bar is 2,那就要乘以2了
 */

/*
 * 对照着代码再看原来的例子：

        index:  0  1  2  3  4  5  6  7  8  9  10 11

    A[index]:  0  1  0  2  1  0  1  3  2  1  2  1

  left[index]: 0  1  1  2  2  2  2  3  3  3  3  3

right[index]: 3  3  3  3  3  3  3  3  2  2  2  1

        min[i]: 0  1  1  2  2  2  2  3  2  2  2  1

          bit[i]: -  0  1  0  1  2  1  0  0  1  0  0 

 
 * 
 */

package hard;

public class Trapping_Rain_Water {
public int trap(int[] height) {
    if(height==null || height.length==0){
    	return 0;
    }
    
    int i,max,total=0;
    int left[] = new int[height.length];
    int right[]= new int[height.length];
    
    left[0] = height[0];
    max = height[0];
    for(i=1;i<height.length;i++){
    	left[i] = Math.max(max, height[i]);
    	max = Math.max(max, height[i]);
    }
    
    right[height.length-1] = height[height.length-1];
    max = height[height.length-1];
    for(i=height.length-2;i>=0;i--){
    	right[i] =Math.max(max, height[i]);
    	max = Math.max(max, height[i]);
    }
    
    for(i=1;i<height.length-1;i++){
    	int bit = Math.min(right[i], left[i])-height[i];
    	if(bit>0){
    		total+=bit;
    	}
    }
    
    return total;
  }
}
