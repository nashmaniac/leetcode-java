package leetcode.s001_100;

public class leetcode_98 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.left!=null && root.left.val > root.val) {
            return false;
        }
        if(root.right!=null && root.right.val < root.val) {
            return false;
        }

        return isValidBST(root.left) && isValidBST(root.right);

    }

    public static void main(String[] args) {
        leetcode_98 t = new leetcode_98();
    }
}
