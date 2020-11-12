package easy;

/**
 * @author Weichen Wang
 * @date 2020/10/13 - 10:14 上午
 * @description: 子数组求和：给你一个正整数数组arr，请你计算所有可能的奇数长度子数组的和。
 * 子数组 定义为原数组中的一个连续子序列。
 * 请你返回 arr中 所有奇数长度子数组的和 。
 *
 * Ps: 数组的子数组：是从数组中取出的0个或多个值的连续序列。前提必须是连续的。
 * e.g [1,3,7]: [],[1],[3],[7],[1,3],[3,7],[1,3,7]. 其中 [1,7] 就不属于子数字，因为[1,7]不是连续的，中间还有[3].
 * 另外，[7,3]也不是，因为值的顺序错了。
 * 所以，子数组的条件为：连续的，顺序的
 *
 * ref: https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/solution/zi-shu-zu-qiu-he-mian-shi-wen-ti-si-tan-fu-de-ti-j/
 */
public class SumOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {

        int singleSum = 0;
        int oddSum = 0;
        int len = arr.length;
        int result = 0;
        // 如何定义奇数index
        // index % 2 != 0 就是奇数
        // 1. iterate all elements of array, get sum of array length is 1.
        for (int i = 0; i < len; i++) {
            singleSum += arr[i];
        }
        // 2. 控制数组长度为奇数。split 数组
//        for ()


        if (len % 2 != 0 && len > 0) {
            for (int i = 0; i < len; i++) {
                oddSum += arr[i];
            }
        }
        result = singleSum + oddSum;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        SumOddLengthSubarrays sumOddLengthSubarrays = new SumOddLengthSubarrays();
        sumOddLengthSubarrays.sumOddLengthSubarrays(arr);
    }
}
