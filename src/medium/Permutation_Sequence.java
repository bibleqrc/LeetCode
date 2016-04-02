/*60. Permutation Sequence My Submissions QuestionEditorial Solution Total Accepted: 51930 Total Submissions: 208174 Difficulty: Medium
The set [1,2,3,…,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order,
We get the following sequence (ie, for n = 3):

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

Note: Given n will be between 1 and 9 inclusive.
 * 
 */

/*题解：

n有n!个permutation, 那么n-1个数就有(n-1)!种排列, n可以分成n组，每组有(n-1)!个数.

比如n = 6，那么以1,2,3,4,5,6开头的组合必然是各有(n-1)! = 5! = 120中组合, 若K = 299，那么我们先要求解这个k在第几组，k/(n-1)! = 299/120 = 2,也就是说k应该在第3组(注意组号从0开始)，组数应该从0开始; 第三组的首个数字应该是3，第一个数字就确定了。

确定第2个数字的时候，注意这个时候，k应该等于k % 120 = 59,为什么要这么算呢，因为每个组有120个数字，

而且k在第三组，那么前两组加起来是240，k在第二次循环的时候，应该是从(5-1)!中确定是属于哪个组，其实就是确定k在第三组中是属于哪个位置。

这个时候59/24 = 2,确定应该是属于第三组，因为在上一步中，3已经用过了，所以这个时候的5个数字是1,2,4,5,6，所以第三组的首个数字是4，依次类推，一直到n个数字全部算完为止。

k是从1开始的，实际的index是从0开始，所以需要k--.

Time Complexity: O(n). Space: O(n).
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Sequence {
	 public String getPermutation(int n, int k) {
	        if(n<=0||k<=0)  return "";
	        
	        StringBuilder sb = new StringBuilder();
	        int[] factorial = new int[n+1];
	        List<Integer> nums = new ArrayList<Integer>();
	        factorial[0] = 1;
	        for(int i=1;i<=n;i++){
	        	factorial[i] = factorial[i-1]*i;
	        	nums.add(i);
	        }
	        
	        k--;             //这里的k是从1开始，实际的index从0开始
	        
	        //获取数字
	        for(int i=1;i<=n;i++){
	        	int index = k/factorial[n-i];
	        	sb.append(nums.get(index));
	        	nums.remove(index);
	        	k = k%factorial[n-i];
	        }
	        return sb.toString();
	    }
}
