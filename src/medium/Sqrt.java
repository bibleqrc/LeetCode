package medium;

public class Sqrt {
 public int mySqrt(int x) {
	  long low = 0,high = x;
	  while(low<=high){
		  long mid = (low+high)/2;
		  if(mid*mid<x){
			  low = mid+1;
		  }else if(mid*mid>x){
			  high = mid-1;
		  }else{
			  return (int)mid;
		  }
			
	  }
	  return (int)high;
   }
}
