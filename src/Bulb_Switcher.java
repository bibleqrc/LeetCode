
public class Bulb_Switcher {
     public int bulbSwitch(int n){
    	 int count=0;
    	 boolean a[] = new boolean[n];
    	 for(int i=0;i<n;i++){
    		 a[i] = true;
    	 }
    	 
    	 for(int i=2;i<n;i++){
    		 for(int j=i;j<n;j++){
    			 if(j%i==0) a[j]=!a[j]; 
    		 }
    	 }
    	 
    	 for(int i = 0;i<n;i++){
    		 if(a[i]==true) count++;
    	 }
    	 return count;
     }
     
     /*
      * 
      *  public class Solution {
2     public int bulbSwitch(int n) {
3         return (int)Math.sqrt(n);
4     }
5 }
      * 
      */
     
}
