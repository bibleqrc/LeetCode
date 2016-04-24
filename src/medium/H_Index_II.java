/*275. H-Index II   My Submissions QuestionEditorial Solution
Total Accepted: 22092 Total Submissions: 67996 Difficulty: Medium
Follow up for H-Index: What if the citations array is sorted in ascending order? Could you optimize your algorithm?
Hint:

Expected runtime complexity is in O(log n) and the input is sorted.
Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

 * 
 */
package medium;

public class H_Index_II {
 public int hIndex(int[] citations) {
	if(citations==null||citations.length==0){
		return 0;
	}
	int len = citations.length;
	int right= len-1;
	int left=0;
	while(left<=right){
		int mid = left+(right-left)/2;
		if(citations[mid]==len-mid){
			return len-mid;
		}else if(citations[mid]<len-mid){
			left=mid+1;
		}else{
			right=mid-1;
		}
	}
	return len-left;
 }
}
