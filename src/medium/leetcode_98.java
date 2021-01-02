package medium;

public class leetcode_98 {
    public void solve() {
    }

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public boolean isValidBST(TreeNode root, int min, int max) {
        if(root == null) {
            return true;
        }

        if(root.val < min || root.val > max) {
            return false;
        }

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        leetcode_98 t = new leetcode_98();
        t.solve();
    }
}
