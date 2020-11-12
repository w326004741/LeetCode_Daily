package easy.Week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Weichen Wang
 * @date 2020/11/3 - 11:33 上午
 * @description: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class Valid_Anagram {

    public boolean isAnagram(String s, String t) {

        //判断两个String 是否拥有一样的字母，如果一样 True, 不一样 false
        char[] array = s.toCharArray();
        char[] arrays = t.toCharArray();

        Arrays.sort(array);
        Arrays.sort(arrays);

        return Arrays.equals(array, arrays);


    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        Valid_Anagram valid_anagram = new Valid_Anagram();
        valid_anagram.isAnagram(s, t);
    }
}
