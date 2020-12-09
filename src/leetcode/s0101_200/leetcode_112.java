package leetcode.s0101_200;

public class leetcode_112 {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            if(root.val != sum) {
                return false;
            } else {
                return true;
            }
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }

    public static void main(String[] args) {
        leetcode_112 t = new leetcode_112();
    }
}
