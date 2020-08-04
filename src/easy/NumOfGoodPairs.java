package easy;

/**
 * @author Weichen Wang
 * @date 2020/7/15 - 11:38 AM
 * @description: LeetCode Problem No.1512 Number of Good Pairs
 * <p>
 * Given an array of integers nums.
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 * Return the number of good pairs.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * <p>
 * Example 2:
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 * <p>
 * Example 3:
 * Input: nums = [1,2,3]
 * Output: 0
 * <p>
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * <p>
 * 总结：正常逻辑题，简单，没有难度，跟着题目逻辑走就能完成
 */
public class NumOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int count = 0; // number of good pairs.

        for (int i = 0; i < nums.length; i++) {        // i和i+1的比较
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        NumOfGoodPairs numOfGoodPairs = new NumOfGoodPairs();
        int[] nums = {1, 2, 3, 1, 1, 3};
        numOfGoodPairs.numIdenticalPairs(nums);
    }
}

