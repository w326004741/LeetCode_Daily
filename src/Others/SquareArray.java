package Others;

/**
 * @author Weichen Wang
 * @date 2020/2/12 - 8:58 PM
 * @description: 多维数组的输出
 * <p>
 * Summary:
 * magicSquare实际没有多维数组，只有一维数组，多维数组被解读为"数组的数组"，
 * 例如二维数组magicSquare是包含{magicSquare[0]，magicSquare[1]，magicSquare[2]}三个元素的一维数组，
 * magicSqure[0]是包含{16,3,2,13}四个元素的一维数组，同理magicSquare[1]，magicSquare[2]也一样
 */
public class SquareArray {

    public static void squareArray(int[][] array) {

        /**For loop output*/
//        System.out.println("{ ");                                   // 最外的大括号
//        for (int i = 0; i < array.length; i++) { // i 为3组数组
//            System.out.print("  {"); // 数组的小括号
//            for (int j = 0; j < array[i].length; j++) { // j 为数组内的个数的index
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println("},");                               // 数组的小括号
//        }
//        System.out.println("}");                                    // 最外的大括号

        /**Foreach output*/
        for (int[] i : array) {    // array type为int[]
            for (int j : i) {
                System.out.print(j + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] magicSquare =
                {
                        {16, 3, 2, 13},
                        {5, 10, 11, 8},
                        {9, 6, 7, 3}
                };
        squareArray(magicSquare);
    }
}
