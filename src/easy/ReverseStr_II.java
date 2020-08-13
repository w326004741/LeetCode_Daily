package easy;

/**
 * @author Weichen Wang
 * @date 2020/8/7 - 11:31 AM
 * @description: No.541 Reverse String II （进阶版）
 *
 * Question: 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
 *           如果剩余字符少于 k 个，则将剩余字符全部反转。
 *           如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *
 * 示例:
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 *
 * 总结：1.reverse的数组长度为k,起始点为0,所以后面的起始点为2*k.
 *      2.确定每次reverse的起始点和结束点的位置（start and end ）
 *      3.结束点位置存在2种情况：1）reverse的数组长度足够长，即满足2k.所以end的位置为 start + k -1.
 *                            2）reverse的数组长度不够长，即 < 2k.reverse的长度为 start -> s.length. 所以end的位置为 s.length - 1.
 *      4.交换位置
 */
public class ReverseStr_II {

    public String reverseStr(String s, int k) {
        // 把String转化成char数组
        char[] c = s.toCharArray();

        // 每2k为一组 进行reverse
        for (int i = 0; i < c.length; i += k * 2) {
            // start是即将开始reverse的位置
            int start = i;
            // end是判断每次reverse结尾的位置。判断end有两种情况，
            // 1.能reverse 2k个，能reverse的数组长度符合4个一组，即从start开始reverse的字符串足够长。
            // 2.能reverse的 < 2k 个，即字符串剩下的char字符不够4个，所以这组数组长度为从 start -> s.length.
            // Math.min()的方法是去两者的最小值。这里优化了 if/else的方法。即 if(start+k-1 < n) ? end = start + k -1 :  c.length - 1;(找end的位置)
            int end = Math.min(start + k - 1, c.length - 1);

            // 确定reverse的start 和 end位置后，判断
            while (start < end) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
        }
        String a = new String(c);
        return a;
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        int k = 2;
        ReverseStr_II reverseStr_ii = new ReverseStr_II();
        reverseStr_ii.reverseStr(s, k);
    }
}
