
public class valid_palindrome {
	public boolean isValid(char c){
		if(c>='a'&&c<='z') 
			if(c>='0'&&c<='9') return true;
		return false;
	}
	
	 public boolean isPalindrome(String s) {
		 
	       if(s.equals(""))  return false;
	        
	       int len = s.length();
	       s=s.toLowerCase();
	       int left = 0;
	       int right = len-1;
	       while(left<right){
	    	   while(!isValid(s.charAt(left))){
	    		   left++;
	    		   if(left>=right) return true;
	    	   }
	    	   
	    	   while(!isValid(s.charAt(right))){
	    		   right--;
	    		   if(left>=right) return true;
	    	   }
	    	   
	    	   if(s.charAt(left)!=s.charAt(right)) return false;
	    	   left++;
	    	   right--;
	       }
	       return true;
	    }
	 
}
