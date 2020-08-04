package easy;

/**
 * @author Weichen Wang
 * @date 2020/7/24 - 3:02 PM
 * @description: No. 1313  Decompress Run-Length Encoded List 解压缩编码列表
 * <p>
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list. Return the decompressed list.
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 * 请你返回解压后的列表。
 * <p>
 * Example 1：
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 * <p>
 * Example 2:
 * Input: nums = [1,1,2,3]
 * Output: [1,3,3]
 * <p>
 * 总结： 1: 先确定新数组的长度，因为新数组的长度是：nums[i] + num[i+2]. E.g. {1,2,3,4} = 1 + 3 = 4.
 * 2：确定freq,val在数组对应的index
 * 3: 再把val值存入新数组
 * 4: result[temp]的temp是控制数组中val的index.
 */
public class DecompressRLElist {

    public int[] decompressRLElist(int[] nums) {

        int size = 0;
        // 确定新数组长度，因为新数组的长度是：nums[i] + num[i+2]. E.g. {1,2,3,4} = 1 + 3 = 4.
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] result = new int[size];
        int temp = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // the length of array
            int freq = nums[i];
            // the element value of array
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                result[temp] = val;
                temp++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        DecompressRLElist decompressRLElist = new DecompressRLElist();
        decompressRLElist.decompressRLElist(nums);
    }
}
