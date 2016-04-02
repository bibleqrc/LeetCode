import java.lang.reflect.Array;
import java.util.Arrays;

public class Contains_Duplicate {
public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        if(len==0||len==1)  return false;
        Arrays.sort(nums);
        for(int i =0;i<len-1;i++){
        	if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
}
