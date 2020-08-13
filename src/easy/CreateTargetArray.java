package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Weichen Wang
 * @date 2020/8/13 - 8:50 AM
 * @description: No.1389 Create Target Array in the Given Order 按既定顺序创建目标数组

 * Question: 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 * 目标数组 target 最初为空。
 * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 * 请你返回目标数组。
 * 题目保证数字插入位置总是存在。

 * Example 1:

 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * Output: [0,4,1,3,2]
 * Explanation:
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]

 * 总结： 难度简单，只需要利用ArrayList内的add(int index, E element)方法把index和num 遍历添加进去就好了
 * 然后在给 target数组重新遍历把 ArrayList内的值按顺序get(i)到target就结束了。
 *
 * Runtime: 0ms, faster than 100.00%, Memory Usage: 37.3MB, less than 99.62%
 */
public class CreateTargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        List<Integer> res = new ArrayList<>();

        // nums是数组的值，index是数组的位置index，target[index] = int[nums]
        for (int i = 0; i < nums.length; i++) {
            res.add(index[i], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            target[i] = res.get(i);
        }

        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        CreateTargetArray createTargetArray = new CreateTargetArray();
        createTargetArray.createTargetArray(nums, index);
    }
}
