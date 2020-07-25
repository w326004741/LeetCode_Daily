package Easy;

/**
 * @author Weichen Wang
 * @date 2020/7/21 - 2:45 PM
 * @description: No.1486. XOR Operation in an Array

 * Question: Given an integer n and an integer start.
 * Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
 * Return the bitwise XOR of all elements of nums.

 * Example 1:
 * Input: n = 5, start = 0
 * Output: 8
 * Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
 * Where "^" corresponds to bitwise XOR operator.
 *
 * Example 2:
 * Input: n = 4, start = 3
 * Output: 8
 * Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.

 * XOR: Exclusive OR, 缩写XOR, 异或(XOR)是一个数学运算符。应用于逻辑运算，基于二进制的位运算。
 * 运算法则：对运算符两侧的每一个二进制位同值则取0，异值则取1。
 * Example: 1+1=0, 0+0=0, 1+0=1
 * 3^5=6 -> 转换成二进制binary -> 0011 ^ 0101 = 0110 = 6
 * 3^5^7^9 -> 0011 ^ 0101 ^ 0111 ^ 1001 -> 0110->0001->1000 = 8

 * 总结: XOR的java运算符为 ^, 可直接使用。该运算基于二进制的位运算。
 * 该运算符号^直接运算二进制过程.such as:  System.out.println(60 ^ 13) = 49
 */
public class XOROperation {

    public int xorOperation(int n, int start) {

        int[] nums = new int[n];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
            count = count ^ nums[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5, start = 0;
        XOROperation xorOperation = new XOROperation();
        xorOperation.xorOperation(n, start);
    }
}
