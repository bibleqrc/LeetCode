/*341. Flatten Nested List Iterator My Submissions QuestionEditorial Solution Total Accepted: 5649 Total Submissions: 21348 Difficulty: Medium
Given a nested list of integers, implement an iterator to flatten it.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.

Example 1:
Given the list [[1,1],2,[1,1]],

By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

Example 2:
Given the list [1,[4,[6]]],

By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].

Subscribe to see which companies asked this question
 * 
 */
package medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
public interface NestedInteger {
*
*     // @return true if this NestedInteger holds a single integer, rather than a nested list.
*     public boolean isInteger();
*
*     // @return the single integer that this NestedInteger holds, if it holds a single integer
*     // Return null if this NestedInteger holds a nested list
*     public Integer getInteger();
*
*     // @return the nested list that this NestedInteger holds, if it holds a nested list
*     // Return null if this NestedInteger holds a single integer
*     public List<NestedInteger> getList();
* }
*/

//首先递归把integer元素集中到一个list中，然后再借助list的迭代器进行遍历。
public class Flatten_Nested_List_Iterator implements Iterator<Integer>{
    private List<Integer> nums = new ArrayList<>();
	private Iterator<Integer> iterator = null;
	
	public NestedIterator(List<NestedInteger> nestedList) {
	for(NestedInteger nestedInteger:nestedList){
		addNestedInteger(nestedInteger);
	}
	iterator = nums.iterator();
 }

	    @Override
	    public Integer next() {
	        return iterator.next();
	    }

	    @Override
	    public boolean hasNext() {
	        return iterator.hasNext();
	    }
	    
	    private void addNestedInteger(NestedInteger nestedInteger){
	    	if(nestedInteger.isInteger()){
	    		nums.add(nestedInteger.getInteger);
	    	}else{
	    		List<NestedInteger> nestedList = nestedInteger.getList();
	    		for(NestedInteger nested:nestedList){
	    			addNestedInteger(nested);
	    		}
	    	}
	    }
}
