package easy;

/**
 * @author Weichen Wang
 * @date 2020/7/25 - 3:10 PM
 * @description: ${description}
 */
public class TargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {

        // target数组为空，定义数组长度
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

        }

        return target;
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        TargetArray targetArray = new TargetArray();
        targetArray.createTargetArray(nums, index);
    }

}
