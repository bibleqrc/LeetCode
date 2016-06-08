package medium;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
	public int evalRPN(String[] tokens) {
	    int result = 0;
	    int a=0;
	    int b = 0;
	    Stack<String> stack = new Stack<String>();
	    for(int i=0;i<tokens.length;i++){
	    	String temp = tokens[i];
	    	switch(temp){
	    	case "+":
	    		 a = Integer.parseInt(stack.pop());
	    		 b = Integer.parseInt(stack.pop());
	    		stack.push(String.valueOf(b+a));
	    		break;
	    	case "-":
	    		a = Integer.parseInt(stack.pop());
	    		b = Integer.parseInt(stack.pop());
	    		stack.push(String.valueOf(b-a));
	    		break;
	    	case "*":
	    		 a = Integer.parseInt(stack.pop());
	    		 b = Integer.parseInt(stack.pop());
	    		stack.push(String.valueOf(b*a));
	    		break;
	    	case "/":
	    		 a = Integer.parseInt(stack.pop());
	    		 b = Integer.parseInt(stack.pop());
	    		stack.push(String.valueOf(b/a));	
	    	     break;
	    	default:
	    		 stack.push(temp);
	    	}
	    }
	    result = Integer.parseInt(stack.peek());
	    return result;
   }

}
