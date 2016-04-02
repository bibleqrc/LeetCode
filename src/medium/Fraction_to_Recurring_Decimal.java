/*
 * 166. Fraction to Recurring Decimal My Submissions QuestionEditorial Solution
Total Accepted: 28603 Total Submissions: 191680 Difficulty: Medium
Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

For example,

Given numerator = 1, denominator = 2, return "0.5".
Given numerator = 2, denominator = 1, return "2".
Given numerator = 2, denominator = 3, return "0.(6)".
Show Hint 

 */
package medium;

import java.util.HashMap;

public class Fraction_to_Recurring_Decimal {
	public String fractionToDecimal(int numerator, int denominator) {
		if(numerator==0)  return new String("0");
		boolean flag = (numerator<0)^(denominator<0);
		long Numerator = Math.abs( numerator);
		long Denominator  = Math.abs(denominator);
		StringBuffer res = new StringBuffer();
		if(flag==true)  res.append("-");
		res.append(String.valueOf(Math.abs(Numerator/Denominator)));
		Numerator = Numerator%Denominator;
		if(Numerator==0)  return res.toString();
		res.append(".");
		HashMap<Long,Integer> map = new HashMap<Long,Integer>();
	    for(int i=res.length();Numerator!=0;i++){
	    	if(map.get(Numerator)!=null) break;
	    	map.put(Numerator, i);
	    	Numerator*=10;
	    	res.append(String.valueOf(Math.abs(Numerator/Denominator)));
	    	Numerator = Numerator%Denominator;
	    }
	    if(Numerator==0)  return res.toString();
	    res.insert(map.get(Numerator), "(");
	    res.append(')');
	    return res.toString();
	}
}
