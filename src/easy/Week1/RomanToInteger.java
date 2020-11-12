package easy.Week1;

/**
 * @author Weichen Wang
 * @date 2020/11/6 - 8:26 下午
 * @description: 罗马数字转整数
 * 罗马数字包含以下七种字符:I，V，X，L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        /**罗马数字由 I,V,X,L,C,D,M 构成；
         当小值在大值的左边，则减小值，如 IV=5-1=4；
         当小值在大值的右边，则加小值，如 VI=5+1=6；
         由上可知，右值永远为正，因此最后一位必然为正。
         想办法比较
         */
        int ans = 0;
        // 取第一位作为首位字符，再与后面一位作比较大小，判断是 + or -
        int preNum = getValue(s.charAt(0));
        // 用循环遍历
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num) {
                ans = ans - preNum;
            } else {
                ans = ans + preNum;
            }
            // 当num为最后一位是，num就是preNum
            preNum = num;
        }
        // 如果 没有后一位数，则默认为 +
        ans = ans + preNum;
        return ans;
    }

    public int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String s = "III";

        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt(s);
    }
}
