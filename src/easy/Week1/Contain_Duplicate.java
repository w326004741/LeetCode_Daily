package easy.Week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Weichen Wang
 * @date 2020/11/1 - 11:52 上午
 * @description: Q:217 给定一个整数数组，判断是否存在重复元素。
 * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * <p>
 * ref: https://leetcode-cn.com/problems/contains-duplicate/solution/cun-zai-zhong-fu-yuan-su-by-leetcode/
 */
public class Contain_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        // 判断是否存在重复元素，1. Set 可去重复
        // 把原数组遍历add进set，然后比较set和array的size, if set.size != array.length -> true, else -> false
        // 以后遍历数组尽量使用foreach， 效率Rank: Iterator > ForEach > For(),
        // 对于HashSet & HashMap， ForEach效率更高，优先级更高
        // 对于无序数组的查找操作，HashSet & HashMap 比 二叉树搜索（TreeMap & TreeSet）更适合解决 时间复杂度的问题
        // 最坏情况为 O(n),线性时间
        Set<Integer> set = new HashSet<>(nums.length);

        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;

        /** 先排序 在查找，最坏情况为 O(nlogn)的时间复杂度
         * 时间复杂度最快：O(1) > O(nlogn) > O(n)
         * 前提是 借用了Arrarys.sort 这个工具类方法，如果不用Java工具类方法，HashSet更好
         * */
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                return true;
//            }
//        }
//        return false;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};

        Contain_Duplicate contain_duplicate = new Contain_Duplicate();
        contain_duplicate.containsDuplicate(input);
    }

}
