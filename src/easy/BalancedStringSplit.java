package easy;
/**
 * @author Weichen Wang
 * @date 2020/8/30 - 3:21 PM
 * @description: No.1221. 分割平衡字符串
 *
 * Qusetion: 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *
 * Example 1:
 *
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 *
 * Input: s = "LLLLRRRR"
 * Output: 1
 * Explanation: s can be split into "LLLLRRRR".
 *
 * 总结： Greedy Algorithm 贪心算法，寻找局部最优解。不考虑整体最优解。例如：最小生成树，求哈夫曼编码。
 *       这道题恰好适合这个算法，因为「平衡字符串」的前提是： 'L' 和 'R'的数量相同。所以一个if condition就可以结束'L'&'R'的计算
 */
public class BalancedStringSplit {

    public int balancedStringSplit(String s) {

        int num = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                num++;
            } else {
                num--;
            }

            if (num == 0) {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String input = "RLRRLLRLRL";

        BalancedStringSplit balancedStringSplit = new BalancedStringSplit();
        balancedStringSplit.balancedStringSplit(input);
    }
}
