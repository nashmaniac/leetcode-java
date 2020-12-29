package easy;

public class leetcode_110 {
    public void solve() {
    }

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1+ Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(l-r) > 1) {
            return false;
        }
        return isBalanced(root.right) && isBalanced(root.left);
    }

    public static void main(String[] args) {
        leetcode_110 t = new leetcode_110();
        t.solve();
    }
}
