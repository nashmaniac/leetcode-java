package medium;

public class leetcode_222 {
    public void solve() {
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
    int ans = 0;
    public int countNodes(TreeNode root) {
        if(root == null) {
            return ans;
        }
        ans++;
        countNodes(root.left);
        countNodes(root.right);
        return ans;
    }

    public static void main(String[] args) {
        leetcode_222 t = new leetcode_222();
        t.solve();
    }
}
