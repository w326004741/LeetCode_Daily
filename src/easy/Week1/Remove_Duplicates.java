package easy.Week1;

/**
 * @author Weichen Wang
 * @date 2020/11/11 - 12:46 下午
 * @description: 26. 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class Remove_Duplicates {

    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        int left = 0;
        int right = 1;

        while (right < len) {
            if (nums[left] != nums[right]) {
                nums[left + 1] = nums[right];
                left++;
            }
            // if nums[left] == nums[right]
            right++;
        }
        return left + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        Remove_Duplicates rd = new Remove_Duplicates();
        rd.removeDuplicates(nums);
    }
}
