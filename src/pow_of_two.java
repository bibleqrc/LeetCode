/*
 * 231. Power of Two My Submissions QuestionEditorial Solution
Total Accepted: 64113 Total Submissions: 178249 Difficulty: Easy
Given an integer, write a function to determine if it is a power of two.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
public class pow_of_two {
	 public boolean isPowerOfTwo(int n) {
	        if(n==0)  return false;
	        if(n==1)  return true;
	        if((n&0x01)==1)  return false;
	        else {
	           while(n!=0){
	           n=n>>1;
	           if((n&0x01)==1) {
	              if(n==1)return true;
	              else return false;
	           }
	        }
	        }
	        return true;
	    }
}
