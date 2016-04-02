import java.util.Stack;

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Subscribe to see which companies asked this question
 * 
 */ 
public class Min_Stack {
    Stack<Integer> stk = new Stack<Integer>();
    Stack<Integer>  min = new Stack<Integer>();
    
    public void push(int x){
    	stk.push(x);
    	if(min.isEmpty()||min.peek()>=x)
    		min.push(x);
    }
    
    public void pop(){
    	int x = stk.pop();
    	if(!min.isEmpty()&&min.peek()==x)
    		min.pop();
    }
    
    public int top(){
    	if(!stk.isEmpty()){
    		return stk.peek();
    	}else{
    		return 0;
    	}
    }
    
    public int get_min(){
    	if(!min.isEmpty()){
    		return min.peek();
    	}else{
    		return 0;
    	}
    }
    
}
