package medium;

/**
 * @author Weichen Wang
 * @date 2020/3/8 - 4:46 PM
 * @description: Problem #289
 * <p>
 * Conway's Game of Life 康威的生命游戏
 * Rule:
 * 1. Any live cell with fewer than two live neighbors dies, as if caused by under-population. 一个活的细胞周围有少于2个活细胞邻居，则会死亡
 * 2. Any live cell with two or three live neighbors lives on to the next generation. 一个活的细胞周围有2 or 3个活细胞邻居，则保持活着状态
 * 3. Any live cell with more than three live neighbors dies, as if by over-population.. 如果一个活的细胞周围有多于3个活细胞，则变为死亡
 * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction. 如果一个死亡的细胞周围有且仅有3个活细胞，则变为活着状态
 * <p>
 * births and deaths occur simultaneously. 活着和死亡的状态为同时发生。
 * 意味着至少遍历2次，时间复杂度为O(n*n), 空间复杂度为常数，因为没有额外的存储空间
 * <p>
 * 题目数组的状态设定： Die：0， Live: 1
 */
public class Game_of_Life {
    //  思路：
    // mark die -> live: -1
    // mark live -> die: 2
    // count(board, i, j); 计算有几个活着细胞
    // update(); -1 => 1, 2=>0
    // 遍历2次数组，所以 时间复杂度为O(n*n), 空间复杂度为常数，因为没有额外的存储空间
    final static int[][] dirs = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}}; // 方向

    public static void gameOfLift(int[][] board) {
        if (board == null || board.length == 0) return; // 数组为空 直接return.
        int rows = board.length, cols = board[0].length; // board[row][cols]数组为 二维数组
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 0) { // 死亡状态
                    int lives = count(board, i, j); // count 活着的个数
                    if (lives == 3) {
                        board[i][j] = -1; // die -> live: -1 标记为活着
                    }
                }
                if (board[i][j] == 1) { // Live状态
                    int lives = count(board, i, j);
                    if (lives < 2 || lives > 3) {
                        board[i][j] = 2;  // live -> die: 2 标记为死亡
                    }
                }
            }
        }
        update(board);
        print(board);
    }

    public static void update(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == -1) { // 确认状态变没变，变成-1,则为活着 live = 1
                    board[i][j] = 1;
                } else if (board[i][j] == 2) { // 状态变为2 则为死亡状态 die = 0
                    board[i][j] = 0;
                }
            }
        }
    }

    public static int count(int[][] board, int row, int col) {
        int result = 0;
        // 计算几个活得 对于每个方向
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            // 确保newRow and newCol 符合条件 可用，且board =1 or board = 2的情况下 为活着状态
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length
                    && (board[newRow][newCol] == 1 || board[newRow][newCol] == 2)) {
                result++;
            }
        }
        return result;
    }

    public static void print(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Game_of_Life gl = new Game_of_Life();
        int[][] arr = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        gameOfLift(arr);
    }
}
