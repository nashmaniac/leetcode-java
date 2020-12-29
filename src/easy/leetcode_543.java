package easy;

public class leetcode_543 {
    public void solve() {
    }

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }


    int ans;
    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        ans = Math.max(ans, l+r+1);
        return Math.max(l, r) + 1;

    }

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        depth(root);
        return ans;
    }



    public static void main(String[] args) {
        leetcode_543 t = new leetcode_543();
        t.solve();
    }
}
