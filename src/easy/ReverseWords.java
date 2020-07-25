package Easy;

/**
 * @author Weichen Wang
 * @date 2020/7/16 - 4:29 PM
 * @description: 左旋转字符串
 * <p>
 * 示例 1：
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 * 示例 2：
 * 输入: s = "lrloseumgh", k = 6
 * 输出: "umghlrlose"
 *
 * 总结： String 的 charAt() 方法：返回字符串的index指定位置的字符。
 */
public class ReverseWords {

    public String reverseLeftWords(String s, int n) {
        String res = "";
        for (int i = n; i < s.length(); i++) {
            res += s.charAt(i); // 返回字符串的index位的字符
        }
        for (int i = 0; i < n; i++) {
            res += s.charAt(i);
        }

        return res;
    }


    public static void main(String[] args) {
        String s = "abcdefg";
        int n = 2;

        ReverseWords reverseWords = new ReverseWords();
        reverseWords.reverseLeftWords(s, n);
    }
}
