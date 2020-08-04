package easy;
/**
 * @author Weichen Wang
 * @date 2020/8/4 - 11:48 AM
 * @description: Question 1528: Shuffle String

 * 给你一个字符串 s 和一个 长度相同 的整数数组 indices。
 * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。返回重新排列后的字符串。
 *
 * Example
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 *
 * 总结：
 */
public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        // create 一个辅助char数组(因为要输出字符，如果是int[]数组，输入temp中的会是字符键盘相对应的keycode)
        char[] temp = new char[indices.length];

        for (int i : indices) {
            // 遍历String字符串内容到temp的char数组内，indices的数组为temp数组内的index
            temp[indices[i]] = s.charAt(i);
        }

        String result = String.valueOf(temp);
        return result;
    }

    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        ShuffleString shuffleString = new ShuffleString();
        shuffleString.restoreString(s, indices);
    }
}
