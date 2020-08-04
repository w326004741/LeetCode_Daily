package algorithms;

/**
 * @author Weichen Wang
 * @date 2020/2/12 - 9:49 PM
 * @description: ${description}
 * <p>
 * Binary Search的前提是 数组已排序
 * 如果提供的数组为乱序，则必须 先排序，再调用binarySort
 */
public class Binary_Sort {

    public static int binarySort(int[] array, int target) {
        int left = 0;
        int right = array.length;
        int mid = (left + right) / 2;

        while (left < right) {
            if (target < array[mid]) { // target on the left side
                right = mid - 1;
            } else if (target > array[mid]) { // target on the right side
                left = mid + 1;
            } else {
                right = mid;
            }
            mid = (left + right) / 2; // re-set mid
        }
        return mid;
    }

    public static void main(String[] args) {
        /**1. 数组已排序*/
        int[] binary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14};
        System.out.println(binarySort(binary, 13));


        /**2. 数组为乱序 则必须 先排序 再调用binarySort*/
//        int[] binary = {3, 7, 1, 13, 5, 2, 4, 6, 9};
//        Arrays.sort(binary);     // 先排序
//        System.out.println(binarySort(binary, 13));
//        System.out.println(Arrays.toString(binary));
    }
}
