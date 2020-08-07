package easy;

/**
 * @author Weichen Wang
 * @date 2020/8/6 - 11:35 AM
 * @description: 剑指Offer 58. Reverse String II 左旋转字符串
 * Question: 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

 * 示例 1：
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"

 * 总结： StringBuilder: 一个可变对象，可以预分配缓冲区，往StringBuilder中新增字符时，不会创建新的临时对象
 *      普通的方法： + 运算符，可以拼接字符串，但在循环中每次都会创建新的String对象，然后扔掉旧的String对象。
 *      因为，绝大部分String都是临时对象，所以这样不但浪费内存，还影响Garbage Collection（GC）效率。
 *      这种方法实现的Runtime比 Brute-force暴力解决快，Memory Storage更少。（即双for loop实现）
 */
public class ReverseStringII {

    public String reverseLeftWords(String s, int n) {

        StringBuilder res = new StringBuilder(s.length());
        for (int i = n; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            res.append(s.charAt(i));
        }

        return res.toString();

        /** 第二种Solution: Brute-Force暴力解决，双循环。 Runtime较长，Memory Usage更多
         String res = "";
         for (int i = n; i < s.length(); i++) {
         res += s.charAt(i);
         }
         for (int i = 0; i < n; i++) {
         res += s.charAt(i);
         }
         return res;
         */
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        int k = 2;

        ReverseStringII reverseStringII = new ReverseStringII();
        reverseStringII.reverseLeftWords(s, k);
    }
}
