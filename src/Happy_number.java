import java.util.HashSet;
import java.util.Set;

public class Happy_number {
   public boolean isHappy(int n){
	   Set<Integer> unique = new HashSet<Integer>();
        int value = 0;
	   while(unique.add(n)){
    	   value = 0;
    	   
    	   while(n!=0){
    		   int b = n%10;
    		   value = (int) (value+Math.pow(b, 2));
    		   n=n/10;
    	   }
    	   n=value;
       }
	   if(n == 1) return true;
	   else return false;
   }
}
