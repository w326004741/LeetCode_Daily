package Others;

import java.util.Stack;

/**
 * @author Weichen Wang
 * @date 2020/2/17 - 3:21 PM
 * @description: Stack是栈，特性是：(FILO，First In Last Out) 先进后出.
 * 2. 继承于Vector， 由于Vector是通过数组实现的，这就意味着，Stack也是通过数组实现的，而非链表。
 * boolean empty() : It returns true if nothing is on the top of the stack. Else, returns false.
 */
public class Stack_Data_Structure {
    /**
     * Pushes an element on the top of the stack.
     */
    public static void stack_Push(java.util.Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
    }

    /**
     * pop() method:
     * Removes and returns the top element of the stack. 删除并返回堆栈的顶部元素
     * An 'EmptyStackException' exception is thrown if we call pop() when the invoking stack is empty 如果在调用堆栈为空时调用pop（），则会抛出“ EmptyStackException”异常。
     */
    public static void stack_Pop(java.util.Stack<Integer> stack) {
        System.out.println("Stack_Data_Structure Pop: ");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(stack);
        }
    }

    /**
     * peek() method:
     * Returns the element on the top of the stack, but does not remove it.
     */
    public static void stack_Peek(java.util.Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    /**
     * search() method:
     * 1. It determines whether an object exists in the stack.
     * 2. If the element is found, it returns the position of the element from the top of the stack. Else, it returns -1.
     * 返回的element position是 from top to bottom. such as: [0,1,2,3,4] -> search 4 -> position = 1. search 0 -> position = 5.
     */
    public static void stack_Search(java.util.Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at position " + pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_Push(stack);
        stack_Peek(stack);
        stack_Search(stack, 4);
        stack_Search(stack, 0);
        System.out.println(stack.empty());

        stack_Pop(stack);
        /**
         * boolean empty() : It returns true if nothing is on the top of the stack. Else, returns false.
         */
        System.out.println(stack.empty());


    }
}
