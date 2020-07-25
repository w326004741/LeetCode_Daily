package Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Weichen Wang
 * @date 2020/7/20 - 2:56 PM
 * @description: No.771 Jewels and Stones
 * Questin: You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * 总结： HashSet特点：没有重复内容，所有数据是唯一的。
 * ArrayList Vs HashSet
 * 1. ArrayList 有序， HashSet 无序
 * 2. ArrayList 可重复内容，HashSet 没有重复内容，所有数据是唯一的
 * 3. ArrayList 使用index来提高检索性能，例如：get(index),remove(index)。
 * 4. HashSet 完全基于Object对象，不提供get()方法。但是提供contains(Object o)去判断HashSet中是否存在某项。
 */
public class JewelsNStone {

    public int numJewelsInStones(String J, String S) {

        Set<Character> jewelSet = new HashSet<>(); // HashSet特点：没有重复内容，所有数据是唯一的。(加快foreach()遍历的速度)
        int count = 0;

        for (char c : J.toCharArray()) {
            jewelSet.add(c);
        }

        for (char c : S.toCharArray()) {
            if (jewelSet.contains(c)) {
                count++;
            }
        }
        return count;
    }
// 使用 ArrayList的 Solution, Runtime更慢，内存使用差不多。
//    int count = 0;
//    List<Character> jewelList = new ArrayList<>();
//
//        for(int i = 0; i<J.length();i++){
//        char jewel = J.charAt(i);
//        jewelList.add(jewel);
//    }
//
//        for(int x = 0; x < S.length(); x++){
//        char stone = S.charAt(x);
//        if(jewelList.contains(stone)){
//            count++;
//        }
//    }
//        return count;

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";

        JewelsNStone jewelsNStone = new JewelsNStone();
        jewelsNStone.numJewelsInStones(J, S);
    }
}
