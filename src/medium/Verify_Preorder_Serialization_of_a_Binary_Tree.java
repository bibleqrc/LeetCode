/*331. Verify Preorder Serialization of a Binary Tree   My Submissions QuestionEditorial Solution
Total Accepted: 10238 Total Submissions: 32356 Difficulty: Medium
One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as #.

     _9_
    /   \
   3     2
  / \   / \
 4   1  #  6
/ \ / \   / \
# # # #   # #
For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.

Given a string of comma separated values, verify whether it is a correct preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.

Each comma separated value in the string must be either an integer or a character '#' representing null pointer.

You may assume that the input format is always valid, for example it could never contain two consecutive commas such as "1,,3".

Example 1:
"9,3,4,#,#,1,#,#,2,#,6,#,#"
Return true

Example 2:
"1,#"
Return false

Example 3:
"9,#,#,1"
Return false
 * 
 */

/*Method 2 利用stack来表示层级. 两种情况，一是遇到数字, push into stack.

一是#, 看栈顶是不是#, 若是，就一直pop, 每次pop不来两个, 直到不再是#,最后把当前的#再压入stack; 若不是#就 push into stack.

举例

　　　_1_
    /   \
   3     2
  / \   / \
 #   # #   #
压栈1, 压栈3, 压栈3的左侧叶子节点#. 当遇到3的右侧叶子节点时, pop出来两个, stack顶部变成1, 再把当前叶子节点压入stack中，stack现在有1, #.

就相当于

　　　_1_
    /   \
   #     2
     　　/ \
    　　#   #
以此类推，看最后stack的size是不是1, 并且唯一的保留就是#.

Time Complexity: O(n). Space: O(n). String array 大小 O(n), stack 大小O(logn).
 * 
 */
package medium;

import java.util.Stack;

public class Verify_Preorder_Serialization_of_a_Binary_Tree {
public boolean isValidSerialization(String preorder){
	Stack<String> stk = new Stack<String>();
	String[] strArr = preorder.split(",");
	for(String str:strArr){
		while(str.equals("#")&&!stk.isEmpty()&&stk.peek().equals("#")){
			stk.pop();
			if(stk.isEmpty()){
				return false;
			}
			stk.pop();
		}
		stk.push(str);
	}
	return stk.size()==1&&stk.peek().equals("#");
}
}
