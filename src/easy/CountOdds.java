package easy;

/**
 * @author Weichen Wang
 * @date 2020/7/25 - 3:30 PM
 * @description: No.5456. 在区间范围内统计奇数数目
 *
 * Question: 给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。
 * 示例 1：
 * 输入：low = 3, high = 7 or low = 14, high = 17
 * 输出：3
 * 解释：3 到 7 之间奇数数字为 [3,5,7] 。
 *
 * 示例 2：
 * 输入：low = 8, high = 10
 * 输出：1
 * 解释：8 到 10 之间奇数数字为 [9] 。
 *
 * 总结：low在不确定是奇数或偶数时，先把low固定变成奇数，判断low是否为奇数的条件是：(x % 2 != 0), if true，则从low开始，low+2 建立数组
 *      这道题要先把偶数情况的Low变成奇数，即if(low % 2 == 0) then low += 1; 这样low的所有情况都统一了。
 *      针对这道题只需得出两个数之间的奇数的个数。所以直接用计算个数的方式解决。
 *      正常偶数之间算奇数个数为：(high-low)/2, 但 +2是因为存在 low 和 high 都为奇数的情况下。 只+1是行不通的。
 */
public class CountOdds {

    public int countOdds(int low, int high) {

        //偶数
        if (low % 2 == 0) {
            // 把low变成奇数，这样情况都全部统一了，一种计算的方法
            low += 1;
        }
        return (high - low + 2) / 2;

        /**下面的方法虽然可以，但是会超处内存限制（仅有效限于有限的数字）。*/
//        if (low % 2 == 0 && high % 2 == 0) {
//            int[] array = new int[(high - low) / 2];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = low + 1;
//                low += 2;
//                count++;
//            }
//            for (int s : array) {
//                System.out.println(s);
//            }
//        } else {
//            int[] array = new int[(high - low) / 2 + 1];
//            for (int i = 0; i < array.length; i++) {
//                if (low % 2 != 0) {
//                    array[i] = low;
//                } else {
//                    array[i] = low + 1;
//                }
//                low += 2;
//                count++;
//
//            }
//        for (int s : array) {
//            System.out.println(s);
//        }
//    }
    }

    public static void main(String[] args) {
        int low = 14, high = 17;

        CountOdds s = new CountOdds();
        s.countOdds(low, high);
    }
}
