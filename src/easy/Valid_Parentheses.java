package easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Weichen Wang
 * @date 2020/2/17 - 3:05 PM
 * <p>
 * Question #20 :
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * <p>
 * Algorithm:
 * <p>
 * 1.Initialize a stack S.
 * 2. Process each bracket of the expression one at a time.
 * 3. If we encounter an opening bracket, we simply push it onto the stack. This means we will process it later, let us simply move onto the sub-expression ahead.
 * 4. If we encounter a closing bracket, then we check the element on top of the stack. If the element at the top of the stack is an opening bracket of the same type,
 * then we pop it off the stack and continue processing. Else, this implies an invalid expression.
 * 5. In the end, if we are left with a stack still having elements, then this implies an invalid expression.
 * <p>
 * Complexity analysis
 * Time complexity : O(n) because we simply traverse the given string one character at a time and push and pop operations on a stack take O(1) time.
 * Space complexity : O(n) as we push all opening brackets onto the stack and in the worst case, we will end up pushing all the brackets onto the stack. e.g. ((((((((((.
 */
public class Valid_Parentheses {

    public boolean isValid(String s) {
        // 先把String存在Stack，String转char[], 再判断
        // 遍历char[],
        if (s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for (char x : c) {
            if (x == '(') {
                stack.push(')');
            } else if (x == '{') {
                stack.push('}');
            } else if (x == '[') {
                stack.push(']');
            } else if (stack.empty() || x != stack.pop()) {
                // if stack为空 or 遍历的x不等于 stack.pop出的元素
                return false;
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "(){}[]";
//        String s = "([)]";
        Valid_Parentheses vp = new Valid_Parentheses();
        System.out.println(vp.isValid(s));
    }
}
