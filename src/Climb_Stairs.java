/*
 * 70. Climbing Stairs My Submissions QuestionEditorial Solution
Total Accepted: 101092 Total Submissions: 277387 Difficulty: Easy
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Subscribe to see which companies asked this question

Show Tags

 * 
 */
public class Climb_Stairs {
	 public int climbStairs(int n) {
	        if(n==1)  return 1;
	        if(n==2)  return 2;
	        int number = 0;
	        int one = 1;
	        int two = 2;
	        while(n>2){
	            number = one+two;
	            
	            one = two;
	            two = number;
	            n--;
	        }
	        
	        return number;
	    }
}
