package medium;

public class Product_of_Array_Except_Self {
//   public int[] productExceptSelf(int[] nums) {
//    int[] a = new int[nums.length];
//    if(nums.length==0||nums==null) return a;
//    int multy = 1;
//    for(int i=0;i<nums.length;i++)
//    	multy *=nums[i];
//    
//    for(int i=0;i<nums.length;i++){
//    	if(nums[i]==0){
//    		a[i]=0;
//    	}else{
//    	a[i] = multy/nums[i];
//    	}
//    }
//    
//    return a;
//   }
	public int[] productExceptSelf(int[] nums){
		
		int first = nums[0];
		int product  =1;
		int numZero = 0;
		for(int val: nums){
			if(val==0){
				numZero++;
				if(numZero==2){
					break;
				}
			}else{
				product*=val;
			}
		}
		nums[0]=(numZero==2)?0:(numZero==0?product/first:(first==0?product:0));
		for(int i=1;i<nums.length;i++){
			nums[i]=(numZero==2)?0:(numZero==0?product/nums[i]:(nums[i]==0?product:0));
		}
		return nums;
	}
	
}
