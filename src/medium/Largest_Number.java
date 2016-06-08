/*179. Largest Number My Submissions QuestionEditorial Solution
Total Accepted: 47056 Total Submissions: 242577 Difficulty: Medium
Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */

/*按照首位数从大到下排序，然后把数字一个一个连起来。比较首位数可以先全部转化成string, 然后用String Comparator 排序。

更改Comparator 比较方法，(s2+s1).compareTo(s1+s2) 不但可以比较完从大到小排序，还可以排除一类特殊情况。

e.g. "30"和"3"比较，若是Comparator 是按照s2.compareTo(s1)生成的，那么"30" 会被认为比"3" 大，就好比 "87"比"85"大。但是这里需要把 "3"排在"30"前面，因为330 比303大。

排完序后一个一个连起来就好。但需注意若是strings 首个已经是 "0" 了, 没有必要把 后面的 "00", "000" 都连上，因为结果本身就是0.

若是nums 的大小有n, sort string数组会用O(nlogn)时间, Time Complexity O(nlogn). 新建了一个string 数组，Space O(n).
 * 
 */
package medium;

import java.util.Arrays;
import java.util.Comparator;

public class Largest_Number {
 public String largestNumber(int[] nums) {
	if(nums==null || nums.length==0){
		return "";
	}
	String[] string = new String[nums.length];
	for(int i=0;i<nums.length;i++){
		string[i]=String.valueOf(nums[i]);
	}
	
	Comparator<String> comp = new Comparator<String>(){
		public int compare(String s1,String s2){
			return (s2+s1).compareTo(s1+s2);
		}
	};
	
    Arrays.sort(string,comp);
    
    if(string[0].equals("0")){
    	return "0";
    }
    
    StringBuilder sb = new StringBuilder();
    for(String str:string){
    	sb.append(str);
    }
    
    return sb.toString();
   }
}

