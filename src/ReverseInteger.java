
/*
 * 7. Reverse Integer My Submissions Question
Total Accepted: 123569 Total Submissions: 524454 Difficulty: Easy
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Update (2014-11-10):
Test cases had been added to test the overflow behavior.

Subscribe to see which companies asked this question
 * 
 */


public class ReverseInteger {
	public int reverse(int x) {
	       boolean isNegative = false;
	       int max= Integer.MAX_VALUE/10;
	       if(x<0)
	       {
	           isNegative=true;
	           x*=-1;
	       }
	       
	        int res = 0;  
	        while(x >0){  
	            // 每一次都在原来结果的基础上变大10倍，再加上余数  
	            res = res*10 + x%10;  
	            x=x/10;  
	            if(x==0)
	               break;
	            if(res>max || res>=max && isNegative && x>=8 || res>=max && x>=7)
	            {
	                res=0;
	                break;
	            }
	        }  
	        return (isNegative?res*-1:res);  
	    }
}
