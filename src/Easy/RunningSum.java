package Easy;

/**
 * @author Weichen Wang
 * @date 2020/7/15 - 10:25 AM
 * @description: LeetCode Problem No.1480 Running Sum of 1d Array
 * <p>
 * Give an array nums. We define a running sum of an array as runningSum[i] = sum(num[0]...num[i]).
 * Return the running sum of nums.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * <p>
 * Constraints 限制条件
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 * <p>
 * <p>
 * 总结： num[x] = num[x] + num[x-1] 找规律题
 */
public class RunningSum {

    public int[] runningSum(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];   //找规律
        }

        return nums;
    }

    public static void main(String[] args) {
        RunningSum rs = new RunningSum();

        int[] nums = {1, 2, 3, 4};
        rs.runningSum(nums);


    }


}
