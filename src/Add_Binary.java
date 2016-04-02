/*
 * 二进制加法
 * 
 *  Add Binary My Submissions QuestionEditorial Solution
Total Accepted: 79329 Total Submissions: 292662 Difficulty: Easy
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
public class Add_Binary {
	   public String addBinary(String a,String b){
	    	int len1 = a.length();
	    	int len2 = b.length();
	    	StringBuilder sum = new StringBuilder();
	    	boolean jinwei = false;
	    	while(len1>0&&len2>0){
	    		if(a.charAt(len1-1)=='0'&&b.charAt(len2-1)=='0'){
	    			if(jinwei==false) {sum.append('0');jinwei = false;}
	    			else{ sum.append('1');jinwei = false;}
	    		}
	    		
	    		if((a.charAt(len1-1)=='0'&&b.charAt(len2-1)=='1')||
	    				(a.charAt(len1-1)=='1'&&b.charAt(len2-1)=='0')){
	    			if(jinwei==false) {sum.append('1');jinwei = false;}
	    			else{ sum.append('0');jinwei = true;}
	    		}
	    		
	    		if((a.charAt(len1-1)=='1'&&b.charAt(len2-1)=='1')){
	    			if(jinwei==false) {sum.append('0');jinwei = true;}
	    			else{ sum.append('1');jinwei = true;}
	    		}
	    		
	    		len1--;
	    		len2--;
	    	}
	    	
	    	while(len1>0){
	    		if(a.charAt(len1-1)=='0') { 
	    			if(jinwei==false) { sum.append('0');jinwei=false;}
	    			else{ sum.append('1');jinwei=false;}
	    		}
	    		if(a.charAt(len1-1)=='1') { 
	    			if(jinwei==false) { sum.append('1');jinwei=false;}
	    			else{ sum.append('0');jinwei=true;}
	    		}
	    		
	    		len1--;
	    	}
	    	
	    	while(len2>0){
	    		if(b.charAt(len2-1)=='0') { 
	    			if(jinwei==false) { sum.append('0');jinwei=false;}
	    			else{ sum.append('1');jinwei=false;}
	    		}
	    		if(b.charAt(len2-1)=='1') { 
	    			if(jinwei==false) { sum.append('1');jinwei=false;}
	    			else{ sum.append('0');jinwei=true;}
	    		}
	    		
	    		len2--;
	    	}
	    	
	    	if(jinwei==true)  sum.append('1');
	    	
	    	StringBuilder S = sum.reverse();
	    	return S.toString();
	    }
}
