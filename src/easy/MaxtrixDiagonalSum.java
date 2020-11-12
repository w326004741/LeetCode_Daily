package easy;

/**
 * @author Weichen Wang
 * @date 2020/9/11 - 3:02 下午
 * @description: No.1527 Matrix Diagonal Sum
 *
 * 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
 * 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
 *
 * 示例：
 * 输入：mat = [[1,2,3],
               [4,5,6],
 *            [7,8,9]]
 * 输出：25
 * 解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
 * 请注意，元素 mat[1][1] = 5 只会被计算一次。
 *
 * 总结： 主副对角线元素直接相加，若边长为奇数则减去重复添加的中心元素。
 */
public class MaxtrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;

        for (int i = 0; i < len; i++) {
            // 正对角线 + 反对角线
            // 主副对角线元素直接相加，若边长为奇数则减去重复添加的中心元素。
            sum += mat[i][i] + mat[i][len - 1 - i];
        }
        if (len % 2 != 0) {
            // 因为要求不能算两次相同的位置数值，所以要单独进行判断=kl m,
            // 如果数组长度为奇数，则sum减去重复的中心元素。即 mat[len/2][len/2]=5
            sum -= mat[len / 2][len / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};

        MaxtrixDiagonalSum maxtrixDiagonalSum = new MaxtrixDiagonalSum();
        maxtrixDiagonalSum.diagonalSum(mat);
    }
}
