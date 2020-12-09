package leetcode.s0101_200;

public class leetcode_110 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1+Math.max(findHeight(root.left), findHeight(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(Math.abs(findHeight(root.left)-findHeight(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        leetcode_110 t = new leetcode_110();
    }
}
