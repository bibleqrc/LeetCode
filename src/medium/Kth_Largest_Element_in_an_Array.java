/*215. Kth Largest Element in an Array   My Submissions QuestionEditorial Solution
Total Accepted: 52076 Total Submissions: 157578 Difficulty: Medium
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note: 
You may assume k is always valid, 1 ≤ k ≤ array's length.

Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
package medium;

public class Kth_Largest_Element_in_an_Array {
   public int findKthLargest(int[] nums, int k) {
	  return findK(nums,nums.length-k,0,nums.length-1);      
  }

private int findK(int[] nums, int k, int start, int end) {
    if(start>=end){
    	return nums[start];
    }
    
    int m = partition(nums,start,end);
    if(m==k){
    	return nums[m];
    }else if(m<k){
    	return findK(nums,k,m+1,end);
    }else{
    	return findK(nums,k,start,m-1);
    }

}

private int partition(int[] nums, int start, int end) {
	int pivot = nums[start];
	int m=start;
	int n = start+1;
	while(n<=end){
		if(nums[n]<pivot){
			swap(nums,++m,n);
		}
		n++;
	}
	swap(nums,start,m);
	return m;
}

private void swap(int[] nums, int i, int j) {
	int temp = nums[j];
	nums[j] = nums[i];
	nums[i] = temp;
	
}
   
}
