/*
 * 
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
Show Hint 


这道题很快就写出来了，因为之前编程之美上看到过一个方法求一个整数的二进制中包含1的个数。就是采用n&n-1的方法
为什么用n&n-1就能很快得到二进制中包含1的个数呢？ 下面进行分析：
（1）假设n为奇数100111
减去1后得到的数  100110
两数相与 得到       100110
 
（2）假设n为偶数101100
减去1后得到的数  101011
两数相与 得到        101000
从上面的说明得出，其实n&n-1每次做的就是从二进制中扣除最后面那个1.很神奇吧
以上就介绍了LeetCode Counting Bits，包括了方面的内容，希望对Java教程有兴趣的朋友有所帮助。
 * 
 */
public class Counting_Bits {
	 public int[] countBits(int num) {
	        if(num==0)  return new int[]{0};
	        int[] n =new int[num+1];
	        int count = 0;
	        for(int i=0;i<=num;i++){
	            int j=i;
	            count=0;
	            while(j!=0){
	                j=j&(j-1);
	                count++;
	            }
	           n[i]=count;
	        }
	       return n;
	    }
}

