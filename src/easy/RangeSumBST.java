package easy;

import javax.swing.tree.TreeNode;

/**
 * @author Weichen Wang
 * @date 2020/9/3 - 2:14 PM
 * @description: ${description}
 */
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        return result;
    }

    public static void main(String[] args) {

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


