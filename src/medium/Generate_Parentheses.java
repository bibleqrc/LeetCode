package medium;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
public List<String> generateParenthesis(int n) {
     
	ArrayList<String> res = new ArrayList<String>();
	if(n<=0) return res;
	dfs(res,"",n,n);
	return res;
    }

   private void dfs(ArrayList<String> res, String tmp, int left, int right) {
	 if(left==0&&right==0){
		 res.add(tmp);
		 return;
	 }
	 if(left>0){
		 String ntmp = tmp+"(";
		 dfs(res,ntmp,left-1,right);
		 tmp = ntmp.substring(0,ntmp.length()-1);
	 }
	 if(left<right){
		 String ntmp=tmp+")";
		 dfs(res,ntmp,left,right-1);
		 tmp = ntmp.substring(0, ntmp.length()-1);
	 }
	
}
}
