package easy.Week1;

/**
 * @author Weichen Wang
 * @date 2020/11/11 - 3:58 下午
 * @description: 27. 移除元素
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 1:
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class Remove_Element {

    public int removeElement(int[] nums, int val) {
        // 双指针方法
        // Time Complexity: O(n). 一个for(), 区间为n
        // Space Complexity: O(n). 虽然有一个for(), 但没有分配新的空间; int len = nums.length 所分配的空间不会随着处理数量的变化
        // 所以 这一行代码的 空间复杂度为 O(1);
        // e.g. int[] m = new int[n]; 这里new可一个数组，这个数组占用的大小为 n, 所以这一行代码的空间复杂度就已经为 O(n)，
        int len = nums.length;
        // 首位
        int left = 0;
        while (left < len) {
            if (nums[left] == val) {
                nums[left] = nums[len - 1];
                len--;
            } else {
                left++;
            }
        }
        System.out.println(len);
        return len;

//        for (int i = 0; i < len; i++) {
//            if (nums[i] != val) {
//                // 如果 nums[i] != val, 把 nums[i]移到第一位，并下一次位置left++
//                nums[left] = nums[i];
//                left++;
//            }
//        }
//        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        Remove_Element re = new Remove_Element();
        re.removeElement(nums, val);
    }
}
