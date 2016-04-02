/*
 * 190. Reverse Bits My Submissions QuestionEditorial Solution
Total Accepted: 57847 Total Submissions: 197966 Difficulty: Easy
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer


取出n最后一位digit，res左移一位后加上digit. 需要注意的是loop中需要让res先左移一位再加digit, 若是在loop中先写加digit再左移会把首位溢出掉。

e.g. 如果是 32位的int, 其实能够左移的只有31位。
 * 
 */

public class Reverse_Bit {
   public int reverseBits(int n){ 
	  int res=0;
	  for(int i=0;i<32;i++){
		  int digit = n&1;
		  n=n>>1;
	  
	       res = res<<1;
	       res+=digit;
	  }
	    return res;
   }
}
