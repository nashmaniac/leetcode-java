package leetcode.s0301_400;

public class leetcode_337 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int[] rob(TreeNode root, int level, int[] cost) {
        if(root == null) {
            return null;
        }
        if(level%2 == 0) {
            cost[level%2] += root.val;
        } else {
            cost[level%2] += root.val;
        }
        rob(root.left, level+1, cost);
        rob(root.right, level+1, cost);
        return cost;
    }

    public int rob(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int[] a = rob(root, 0, new int[]{0, 0});

        if(a[0] >= a[1]) {
            return a[0];
        } else {
            return a[1];
        }
    }

    public static void main(String[] args) {
        leetcode_337 t = new leetcode_337();
    }
}
