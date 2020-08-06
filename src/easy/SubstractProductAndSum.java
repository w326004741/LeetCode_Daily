package easy;

/**
 * @author Weichen Wang
 * @date 2020/8/6 - 9:21 AM
 * @description: No.1281: Subtract the Product and Sum of Digits of an Integer
 * Question: Given an integer number n, return the difference between the product of its digits and the sum of its digits.

 * Example 1:
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15

 * 总结：1. 获取整数每个位置的数值，用module取余的算法。利用while Loop得到每个位置上的数。
 *      2. 乘法的初始值为1，不是0。
 *      3. while循环：不知道需求明确的循环次数，只有需求条件 用while
 *         for: 知道需求明确的循环次数 用for
 * Runtime 0ms, faster than 100%. Memory usage: 36.1MB, less than 54.63%.
 */
public class SubstractProductAndSum {

    public int subtractProductAndSum(int n) {

        int result = 0, temp = 0, sum = 0;
        //初始值为1。如果为0，乘法结果永远为0
        int product = 1;

        // 因为需求没有明确指出需要循环的次数，只知道一个需求，所以用while，只要n !=0，循环判断就继续。
        while (n != 0) {
            // 利用module求余获得最后一位数，从个数开始
            temp = n % 10;
            // int的属性，保留小数点前的整数内容
            n = n / 10;

            sum += temp;
            product *= temp;
            result = product - sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 114, n1 = 234, n2 = 4421;
        SubstractProductAndSum s = new SubstractProductAndSum();
        s.subtractProductAndSum(n);
    }
}
