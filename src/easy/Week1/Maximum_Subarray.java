package easy.Week1;

/**
 * @author Weichen Wang
 * @date 2020/11/3 - 10:19 下午
 * @description:
 */
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {

        // 先遍历数组，设 max为当前最大子序列和， ans为结果
        // if sum > 0, sum += nums[i]; if sum < 0, sum = nums[i]
        // Math.max(result, sum)
        int sum = 0;
        int ans = nums[0];

        for (int i : nums) {
            if (sum > 0) {
                sum += i;
            } else {
                sum = i;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Maximum_Subarray maximum_subarray = new Maximum_Subarray();
        maximum_subarray.maxSubArray(nums);
    }

}
