/*274. H-Index   My Submissions QuestionEditorial Solution Total Accepted: 31761 Total Submissions: 108237 Difficulty: Medium
Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."

For example, given citations = [3, 0, 6, 1, 5], which means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively. Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, his h-index is 3.

Note: If there are several possible values for h, the maximum one is taken as the h-index.

Hint:

An easy approach is to sort the array first.
What are the possible values of h-index?
A faster approach is to use extra space.
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
 * 
 */
/*h-index ，又称为h指数或h因子（h-factor），是一种评价学术成就的新方法。h代表“高引用次数”（high citations），一名科研人员的h指数是指他至多有h篇论文分别被引用了至少h次。h指数能够比较准确地反映一个人的学术成就。一个人的h指数越高，则表明他的论文影响力越大。例如，某人的h指数是20，这表示他已发表的论文中，每篇被引用了至少20次的论文总共有20篇。要确定一个人的h指数非常容易，到SCI网站，查出某个人发表的所有SCI论文，让其按被引次数从高到低排列，往下核对，直到某篇论文的序号大于该论文被引次数，那个序号减去1就是h指数。中国读者较为熟悉的霍金的h指数比较高，为62。生物学家当中h指数最高的为沃尔夫医学奖获得者、约翰斯·霍普金斯大学神经生物学家施奈德，高达191，其次为诺贝尔生理学或医学奖获得者、加州理工学院生物学家巴尔的摩，160。生物学家的h指数都偏高，表明h指数就像其他指标一样，不适合用于跨学科的比较。
 * 
 */
package medium;

import java.util.Arrays;

public class H_Index {
public int hIndex(int[] citations) {
//	if(citations==null||citations.length==0){
//		return 0;
//	}
//	Arrays.sort(citations);
//	int res = 0;
//	for(int i=citations.length-1;i>=0;i--){
//		if(citations[i]>=citations.length-i){
//			res = citations.length-i;
//		}
//	}
//	return res;
	if(citations==null||citations.length==0) return 0;
	
	int len = citations.length;
	int[] count = new int[len+1];
	for(int i=citations.length-1;i>=0;i--){
		if(citations[i]>=citations.length){
			count[len]++;
		}else{
			count[citations[i]]++;
		}
	}
	
	int total = 0;
	for(int i=len;i>=0;i--){
		total+=count[i];
		if(total>=i){
			return i;
		}
	}
	return 0 ;
  }
}
