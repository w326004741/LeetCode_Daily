package Algorithms;

/**
 * @author Weichen Wang
 * @date 2020/3/5 - 2:12 PM
 * @description: The above function(nested for() loop) always runs O(n^2) time even if the array is sorted.
 * It can be optimized by stopping the algorithm if inner loop didn’t cause any swap.
 * 即使对数组排序，以上(嵌套循环)函数也始终运行O(n^2) 时间。
 * create a boolean swapped.
 * 如果内部循环没有引起任何交换 则可以停止算法进行优化
 * <p>
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.(最坏情况和平均情况下的时间复杂度: O(n*n). 最坏的情况是对数组进行反向排序时)
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.(最佳情况下时间复杂度：O（n）。最好的情况是对数组进行排序时)
 */
public class Bubble_Sort {
    public static void bubbleSort(int arr[]) {
        int x, y, temp = 0;

        for (x = 0; x < arr.length; x++) { // 整体排序次数 从头到尾才算一次

            boolean swapped = false;

            for (y = 0; y < arr.length - 1; y++) { //从头开始，两两对比，前者>后者则交换，否则不交换
                if (arr[y] > arr[y + 1]) {
                    // swap arr[y] and arr[y+1]
                    temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                    swapped = true;
                }
            }
            // if no two element were swapped by inner loop, then break 如果内部循环没有引起任何交换 则可以停止算法进行优化
            if (swapped == false) break;
        }
    }

    // Function to print an array
    public static void printArray(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {2, 1, 9, 0, 5, 4, 7, 6, 8};
        System.out.println("Original Array: ");
        printArray(array);
        System.out.println();

        bubbleSort(array);
        System.out.println("Sorted Array:");
        printArray(array);
    }
}
