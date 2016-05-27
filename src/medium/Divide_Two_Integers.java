/*29. Divide Two Integers My Submissions QuestionEditorial Solution Total Accepted: 67773 Total Submissions: 431667 Difficulty: Medium
Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.

Subscribe to see which companies asked this question
 * 
 */

/*
 *这道题题意是算余数不能用乘、除和取模运算。

循环减会超时。

可以采用位运算，下次写注意下。

这道题主要在对于边界的处理上，-2147483648, -1会输出2147483647， 如果除数是1，则会输出-2147483648，将除数是1，被除数是Integer.MIN_VALUE拿出来单独讨论即可，除数>1时，被除数是边界值那么大的多1少1对商没有影响。

注意abs还有取相反数对于最小边界值都是无效的，会返回值本身。 
 */
package medium;

public class Divide_Two_Integers {
 public int divide(int dividend, int divisor) {
	if(dividend==0 || divisor==0) return 0;
	boolean flag = (dividend>0 && divisor<0)||(dividend<0 && divisor>0);
	
	long dd = dividend,dr = divisor;
	
	if(dd==Integer.MIN_VALUE && flag==false && dr==-1){
		dd = Integer.MAX_VALUE;
	}else if(dd<0){
		dd = -dd;    //abs对Integer.MIN_VALUE无效会输出原值，方法是将其先转化为long型再abs  
	}
	
	if(dr<0) dr = -dr;
	
	if(dd<dr) return 0;
	if(dr==1) return flag?(int)-dd:(int)dd;
	
	int quo = 0;
	while(dd>=dr){           //循环内找到第一个sum+sum > dividend后 缩小找的范围 
		long sum = dr; 
		long temp = 1;        //已经排除了0情况，商最小为1 
		while(sum+sum<=dd){  //每次翻倍加
			sum+=sum;
			temp+=temp;       //计数也是翻倍加
		}
		dd -=sum;          //sum+sum> dividend了  需要在dividend-sum的余数中继续找  
		quo+=temp;
	}
	return flag?-quo:quo;
   }
}
