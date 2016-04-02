
public class Multiply_Strings {
	 public String multiply(String num1, String num2) {  
	        if(num1.equals("0") || num2.equals("0")) return "0";  
	        StringBuffer x1 = new StringBuffer(num1);  
	        StringBuffer x2 = new StringBuffer(num2);  
	        x1.reverse();   //大数乘法一般都倒过来存，比较好处理 尤其是两个数位数不一样时  
	        x2.reverse();   //如果不reverse的话 数组第0位存的是最高位  
	        int[] num = new int[x1.length() + x2.length()];  //相乘，数组要开的大  
	          
	        for(int i = 0; i < x1.length(); i++){  
	            int a = x1.charAt(i) - '0';     //***注意减去0  
	            for(int j = 0; j < x2.length(); j++){  
	                int b = x2.charAt(j) - '0';  
	                num[i + j] += a * b;  
	                  
	            }  
	        }  
	          
	        StringBuffer res = new StringBuffer();  
	        for(int i = 0; i < num.length; i++){  
	            int temp = num[i] % 10;  
	            int carry = num[i] / 10;  
	            res.insert(0, temp);    //正着存  
	            if(i < num.length - 1) num[i + 1] += carry;  
	              
	        }  
	          
	        while(res.charAt(0) == '0'){  
	            res.deleteCharAt(0);  
	        }  
	        return res.toString();  
	    }
	 
	 public static void main(String[] args){
		 Multiply_Strings mu = new Multiply_Strings();
		 String mul = mu.multiply("12", "11");
		 System.out.println(mul);
	 }
}
