package easy.Week1;

import javax.sound.midi.Soundbank;

/**
 * @author Weichen Wang
 * @date 2020/11/6 - 5:56 下午
 * @description: 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 附加 考虑 回文为String的Solution
 */
public class isPalindrome {
    public boolean isPalindrome(int x) {
        // 当 x 为负数时，则不是回文数
        // 当数字的最后一位是0，如果要满足回文数，则该数组的第一位也必须是0，那只有0能满足该条件
        // 随后 循环建立反转一半的数字
        // 针对奇数位和偶数位的数字 进行判断是否为回文。 因为奇数的中间数固定，不影响回文判断所以，反转一半的数字/10 就为奇数的判断条件；而偶数不需要/10
        // 因为每次迭代 需要把数字 /10，所以 时间复杂度为 O(log10(n)), 空间复杂度为 O（1）
        // tips: 溢出判断 最大的值与最小的值为：[−2^31, 2^31 − 1]， 即：[-2147483648, 2147483647]
        // Java中的数字反转是存在溢出最大，最小值的可能，所以前提是把 return false的情况写好，因为溢出的情况必定不是回文，所以直接return false。 回文reverse后必定相等。

        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int revertedNumber = 0;

        // 只有当 x > revertedNumber 才能进入循环，一旦 x < revertedNumber 说明数组已经过半了, 则保留 x 并跳出循环，进入下一步
        while (x > revertedNumber) {
            int pop = x % 10;
            revertedNumber = revertedNumber * 10 + pop;
            x = x / 10;
        }
        // if x= 12321 则 rev = 123， x = 12
        return revertedNumber / 10 == x || revertedNumber == x;
    }

    public boolean isStringPalindrome(int x) {
        /** 当 回文为String字符串时
         (x + ""): 加""为 整形转字符串的简单写法
         int -> String; int i=12345;  String s="";
         第一种方法：s = i + ""; 第二种方法：s = String.valueOf(i); */
        String revertedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(revertedStr);
    }

    public static void main(String[] args) {
        int num = 12321;

        isPalindrome isPalindrome = new isPalindrome();
        isPalindrome.isPalindrome(num);
        isPalindrome.isStringPalindrome(num);
    }
}
