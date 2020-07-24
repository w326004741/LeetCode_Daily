package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Weichen Wang
 * @date 2020/7/22 - 10:03 AM
 * @description: ${description}
 */
public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {

//        int[] result = new int[nums.length];
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (nums[i] > nums[j] && j != i) {
//                    count++;
//                    System.out.println(nums[i] + ", count: " + count);
//                }
//            }
//        }

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

    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        SmallerNumbersThanCurrent smallerNumbersThanCurrent = new SmallerNumbersThanCurrent();
        smallerNumbersThanCurrent.smallerNumbersThanCurrent(nums);
    }
}
