//Gray  Code
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> st=new ArrayList<Integer>();
        if(n==0){
            st.add(0);
            return st;
        }
        
        for(int i=0;i<(i<<n);i++){
            st.add(i^(i>>1));
        }
        return st;
    }
    
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(new Solution().grayCode(n));
    }
}




/*
 * 
 * 258. Add Digits My Submissions Question
Total Accepted: 70196 Total Submissions: 146035 Difficulty: Easy
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

Hint:

A naive implementation of the above process is trivial. Could you come up with other methods? Show More Hint 
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 * */
 */
 
 /*
   public class Solution {
    public int addDigits(int num) {
        while(num>9)
        {
            int c=0;
            while(num!=0)
            {
                c=c+num%10;
                num=num/10;
            }
            num=c;
        }
        return num;
    }
}


public class Solution {
    public int addDigits(int num) {
        return ((num-1)%9+1);
    }
}

*/
  */