package Algorithms;

/**
 * @author Weichen Wang
 * @date 2020/3/18 - 10:45 PM
 * @description: ${description}
 * <p>
 * 1. 选数组的最后一个(end)数据为指针参照物p or 选最左/右边作为参照物都可以
 * 2. 数组最左指针(left), end-1 为右指针
 * 3. left index找比参照物p大，right index找比参照物p小 (左找大，右找小)
 * 4. 哪个指针先动，是取决于参照物p的位置。因为当最后两个指针相遇时，要交换参照物p到相遇的位置。
 * 所以最后相遇的数要和p交换,那么如果p选在最右边，则和比p大的数(left)交换，所以left指针先移动；
 * 如果p选在最左边，则和比p小的数(right)交换，所以right指针先移动
 */
public class Quick_Sort {


    // 思路： 左找大，右找小，交换
    public static int partition(int arr[], int start, int end) {

        int partition = arr[end]; // 数组最右边的值为参照物
        int left = start; // left index 从数组第一个 即0
        int right = end - 1; // right index， -1是因为index从0开始. right = end 为什么也可以？？

        while (true) {
            // 左右指针重合，循环解释
            if (left == end) {
                break;
            }
            // 从left->right找，只要比p大的,如果arr[left] <= partition,则指针移动 继续找
            while (left < end && arr[left] <= partition) {
                left++;
            }
            // 从right->left找，只要比p小的，如果arr[right] >= partition,则指针移动，继续找
            while (right >= left && arr[right] >= partition) {
                right--;
            }
            // 在找的过程中，left index找到比p大的，且right index找到比p小的，但left index < right index，即两者没有交叉
            // 则交换他们的数据值，但指针位子不变
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else {
                // 两者交叉,则交换 left和 partition的数据值，且partition的位置也移动
                // p为最右点，left->right找比p大的，r->l找比p小的，此时l&r交叉，则肯定交换p和left找到的大于p的值，而不是比p小的right
                int temp = arr[left];
                arr[left] = arr[end];
                arr[end] = temp;
                break; // 结束循环，此时partition为该数组的中心点(middle)，p的左边部分全为小于p的，右边全为大于p的. (小于P) - p - (大于P)
            }
        }
        return left; //一次循环后，此时的left为p参照物，即中间点
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        } else {
            int middle = partition(arr, start, end); // 找到分界点
            quickSort(arr, start, middle - 1); // 左半边
            quickSort(arr, middle + 1, end); // 右半边
        }
    }

    public static void main(String[] args) {
        int list[] = new int[]{4, 9, 11, 8, 4, 67, 3, 2, 32, 34, 41, 6};
        System.out.println("Print Array:");
        print(list);
        quickSort(list, 0, list.length - 1);
        System.out.println("Quick Sort");
        print(list);
    }

    public static void print(int list[]) {
        for (Integer data : list) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

}
