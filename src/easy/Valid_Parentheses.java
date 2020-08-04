package easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Weichen Wang
 * @date 2020/2/17 - 3:05 PM
 *
 * Question #20 :
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *        1. Open brackets must be closed by the same type of brackets.
 *        2. Open brackets must be closed in the correct order.
 *
 * Algorithm:
 *
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

    private HashMap<Character, Character> mapping;

    // Initialize HashMap with mapping. This simply makes the code easier to read.
    public Valid_Parentheses() {
        this.mapping = new HashMap<Character, Character>();
        this.mapping.put(')', '('); //  key-value closing bracket is key, opening bracket is value
        this.mapping.put(']', '['); // 通过关闭括号为key 找到对应的 开口括号value
        this.mapping.put('}', '{');
    }

    public boolean isValid(String s) {
        // Initialize a stack to be used in the algorithm
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // if the current character is a closing bracket.
            // containsKey():是检查key的存在 如果这个key存在在mapping种，则继续，如果c不是key，则push到stack中，因为是开口括号，即value
            if (this.mapping.containsKey(c)) {
                // 如果stack为空，则set为# as a dummy假 value， 反之不为空，则pop
                char topElement = stack.empty() ? '#' : stack.pop();
                // if the mapping for this bracket doesn't match the stack's top element, return false.
                // 如果top的元素不能和mapping.get()的当前值匹配，则首尾不匹配，返回false;
                if (topElement != this.mapping.get(c))
                    return false;
            } else {
                // if it was an opening bracket, push to the stack  如果c不是key，则push到stack中，因为是开口括号，即value
                stack.push(c);
            }
        }
        // if the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s = "(){}[]";

        Valid_Parentheses vp = new Valid_Parentheses();
        System.out.println(vp.isValid(s));

    }
}
