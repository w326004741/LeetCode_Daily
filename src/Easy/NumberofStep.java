package Easy;

/**
 * @author Weichen Wang
 * @date 2020/7/19 - 11:22 AM
 * @description: No.1342. Number of Steps to Reduce a Number to Zero
 * Question: Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 *
 * Example 1:
 *
 * Input: num = 14
 * Output: 6
 * Explanation:
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 *
 * 总结： 正常逻辑的判断，Recursion回调函数的方法Runtime更快，内存使用基本一样
 */
public class NumberofStep {

    public int numberOfSteps(int num) {
        // 返回num归零的次数 偶数/2，奇数-1再/2

        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                count++;
                num = num / 2;
            } else {
                count++;
                num = num - 1;
            }
        }
        return count;

//     Recursion 回调函数方法，Runtime更快, 内存使用差不多
//        if (num == 0)
//            return 0;
//        if (num % 2 == 0) {
//            return 1 + numberOfSteps(num / 2);
//        } else
//            return 1 + numberOfSteps(num - 1);
//
    }

    public static void main(String[] args) {
        int num = 123;
        NumberofStep numberofStep = new NumberofStep();
        numberofStep.numberOfSteps(num);
    }
}
