package leetcode.s101_200;

public class leetcode_101 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        return (left.val == right.val) && isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public static void main(String[] args) {
        leetcode_101 t = new leetcode_101();
    }
}
