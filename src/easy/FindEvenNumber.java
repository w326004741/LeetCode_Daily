package easy;

/**
 * @author Weichen Wang
 * @date 2020/9/10 - 10:03 上午
 * @description: No.1295 Find Number with Even Number of Digits
 * <p>
 * Question: Give an array 「nums」 of integers, return how many of them contain an even number of digits
 * 示例 1：
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * 解释：
 * 12 是 2 位数字（位数为偶数）
 * 345 是 3 位数字（位数为奇数）
 * 2 是 1 位数字（位数为奇数）
 * 6 是 1 位数字 位数为奇数）
 * 7896 是 4 位数字（位数为偶数）
 * 因此只有 12 和 7896 是位数为偶数的数字
 *
 * 总结：遍历数组内的每个数字的个数，可以先把数组内容 用 String.valueOf() 转成String，再进行奇偶数判断
 *      奇偶性判断： nums % 2 == 0 则为偶数，反之为奇数
 */
public class FindEvenNumber {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            String temp = String.valueOf(nums[i]);
            if (temp.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        
        FindEvenNumber findEvenNumber = new FindEvenNumber();
        findEvenNumber.findNumbers(nums);
    }
}
