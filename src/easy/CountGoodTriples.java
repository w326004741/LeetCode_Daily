package easy;

/**
 * @author Weichen Wang
 * @date 2020/9/10 - 4:08 下午
 * @description: No.1534 Count Good Triplets
 * Question: 给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * 其中 |x| 表示 x 的绝对值。
 * 返回 好三元组的数量 。

 * 示例 1：
 * 输入：arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
 * 输出：4
 * 解释：一共有 4 个好三元组：[(3,0,1), (3,0,1), (3,1,1), (0,1,1)] 。

 * 总结： Time Complexity: O(n^3) ,其中 n 是数组 arr 的长度。 因为有3个循环 所以为 O(n)*O(n)*O(n)* = O(n^3).
 *       直接枚举法，三个循环后直接判断 arr[i], arr[j], arr[k] 是否满足条件。
 */
public class CountGoodTriples {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;

        CountGoodTriples countGoodTriples = new CountGoodTriples();
        countGoodTriples.countGoodTriplets(arr, a, b, c);
    }
}
