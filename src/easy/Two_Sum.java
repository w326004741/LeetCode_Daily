package easy;

/**
 * @author Weichen Wang
 * @date 2020/2/12 - 7:31 PM
 * @description: Problem #1
 * </>
 * Question: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * 给定一个整数数组，返回两个数字的索引，以便它们加起来成为一个特定的目标。 您可以假设每个输入都只有一个解决方案，并且您可能不会两次使用同一元素。
 * <p>
 * Summary: left=0; right=left+1,而不是right=0;需要考虑target是第一个数的2倍，例如target=6,nums[0]=3,则3(right) = 6(target)-3(left)
 * 则指针indice选择了2个index一样的数字 不符合题目条件
 */
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        for (int left = 0; left < nums.length; left++) {
            for (int right = left + 1; right < nums.length; right++) {
                if (nums[right] == target - nums[left]) {
                    return new int[]{left, right};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
//        return nums;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;

        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = twoSum(nums, target);

        for (Integer i : result) {
            System.out.println(i);
        }
//        System.out.println(Arrays.toString(result));
    }
}
