package leetcode.s0901_1000;

public class leetcode_965 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean isUnivalTree(TreeNode root, int val) {
        if(root == null) {
            return true;
        }
        if (root.val != val) {
            return false;
        }
        return isUnivalTree(root.left, val) && isUnivalTree(root.right, val);
    }

    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTree(root, root.val);
    }

    public static void main(String[] args) {
        leetcode_965 t = new leetcode_965();
    }
}
