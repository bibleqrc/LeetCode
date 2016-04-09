package medium;

public class House_Robber {
	 public int rob(int[] nums) {
		 int result;
		 int len = nums.length;
		 
		 if(len==0)  return 0;
		 if(len==1)  return nums[0];
		 if(nums[1]<nums[0])  nums[1]=nums[0];
		 
		 for(int i=0;i<len;i++){
			 nums[i]=Math.max(nums[i-2]+nums[i], nums[i-1]);
		 }
		 
		 return nums[len-1];
	 }
}
