package medium;

public class leetcode_236 {
    public void solve() {
    }

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if(p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        leetcode_236 t = new leetcode_236();
        t.solve();
    }
}
