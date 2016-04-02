/*
 * 
 * 228. Summary Ranges My Submissions Question
Total Accepted: 38157 Total Submissions: 164595 Difficulty: Easy
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 */




public class SummaryRange {
   
	 public List<String> summaryRanges(int[] nums) {
	        
	        List<String> res = new ArrayList();
	        int e=0,s=0;
	        
	        while(e<nums.length){
	            if((e+1<nums.length)&&(nums[e+1]==nums[e]+1))
	            {
	                e++;
	            }
	            else{ if(s==e){
	                res.add(Integer.toString(nums[s]));
	            }else{
	                String a = nums[s] + "->" +nums[e];
	                res.add(a);
	            }
	            
	            e++;
	            s=e;}
	              
	        }
	        
	        return res;
	    }
}
