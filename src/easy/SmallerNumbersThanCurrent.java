package easy;

/**
 * @author Weichen Wang
 * @date 2020/8/5 - 9:16 AM
 * @description:  No.1365: Smaller Numbers Than Current
 * Question: 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * 以数组形式返回答案。
 *
 * Example 1:
 *
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 *
 * 总结： 暴力双循环遍历数组，设置条件判断过滤。 int count = 0; 放在第一个for循环内，每次内部循环结束 则count归零。重新计数。
 */
public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;

        /** 第二种Solution, 更慢
         int[] count = new int[nums.length];
         List<Integer> list = new ArrayList<>();
         for (int n : nums)
         list.add(n);
         Collections.sort(list);

         for (int i = 0; i < nums.length; i++) {
         count[i] = list.indexOf(nums[i]);
         }


         for (int i : count)
         System.out.println(i);
         return count;
         */
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        SmallerNumbersThanCurrent smallerNumbersThanCurrent = new SmallerNumbersThanCurrent();
        smallerNumbersThanCurrent.smallerNumbersThanCurrent(nums);
    }
}
