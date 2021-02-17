package easy;


import utils.TreeNode;

public class leetcode_226 {
    public void solve() {
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        leetcode_226 t = new leetcode_226();
        t.solve();
    }
}
