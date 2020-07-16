package Easy;

/**
 * @author Weichen Wang
 * @date 2020/7/16 - 5:00 PM
 * @description: No.1470 - Given the array nums consisting of 2n elements in form [x1,x2,...,xn,y1,y2,....yn]/
 * return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * <p>
 * Example 1:
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 * <p>
 * Example 2:
 * Input: nums = [1,2,3,4,4,3,2,1], n = 4
 * Output: [1,4,2,3,3,2,4,1]
 * <p>
 * Example 3:
 * Input: nums = [1,1,2,2], n = 2
 * Output: [1,2,1,2]
 * <p>
 * Constraints:
 * 1 <= n <= 500
 * nums.length == 2n
 * 1 <= nums[i] <= 10^3
 * <p>
 * 总结：  nums.length = 2*n, 因为规律为每隔一个单位去数值，所以for循环的递增为 i+=2.
 * <p>
 * confuse: 直接在nums[left++] & nums[n++] 比下面的方法运行速度快，且内存使用也少。
 * left++;
 * n++;
 */
public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {

        int[] array = new int[n * 2];

        int left = 0;
        for (int i = 0; i < array.length; i += 2) {
            array[i] = nums[left++];
            array[i + 1] = nums[n++];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        ShuffleArray shuffleArray = new ShuffleArray();
        shuffleArray.shuffle(nums, n);
    }
}

