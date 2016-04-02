/*
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 * 
 */

import java.util.Scanner;

public class Excel_Sheet_Column_Title {
	public static void main(String[] args){
   	 Scanner in = new Scanner(System.in);
   	 while(in.hasNext()){
   	 int a = in.nextInt();
   	 String res="";
   	 
   	 while(a>0){
   		 res=(char)((a-1)%26+'A')+res;
   		 a=(a-1)/26;
   	 }
   			 
   	 System.out.print(res);
   	 }
     }
}
