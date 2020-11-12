package easy.Week1;

/**
 * @author Weichen Wang
 * @date 2020/11/4 - 11:14 上午
 * @description:
 */
public class Reverse_Integer {

    public int reverse(int x) {
        //反转整数
        int ans = 0;
        while (x != 0) {
            // module求余 取尾数
            int pop = x % 10;
            // 溢出判断 最大的值与最小的值为：[−2^31, 2^31 − 1]， 即：[-2147483648, 2147483647]
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            // ans = x的尾数， ans *10 = 把ans变为十位数 再 + 上pop出来的最新的尾数。
            ans = ans * 10 + pop;
            x = x / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
//        int x = 123;
        int x = -123;
//        int x = 120;
        Reverse_Integer reverse_integer = new Reverse_Integer();
        reverse_integer.reverse(x);
    }
}
