package easy.Week1;

/**
 * @author Weichen Wang
 * @date 2020/11/7 - 11:39 上午
 * @description: 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        //纵向扫描法

        if (strs == null || strs.length == 0) {
            return "";
        }

        //先横向遍历第一个字符串，并得到第一个字符串的所有字符
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            // 再纵向遍历数组内其他字符串，并纵向比较每个字符是否一样
            for (int j = 1; j < strs.length; j++) {
                // 或||条件 ，第一个条件成功了就不考虑后面的条件了
                // 所以要先判断 长度是不是相等，再判断长度相等的情况下，每个字符是否相等
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        lcp.longestCommonPrefix(s);
    }
}
