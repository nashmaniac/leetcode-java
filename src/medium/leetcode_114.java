package medium;

public class leetcode_114 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }
    public void solve() {
    }

    public TreeNode findRight(TreeNode root) {
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }


    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode right = root.right;
        root.right = root.left;
        TreeNode lowestRight = findRight(root.right);
        lowestRight.right = right;
    }

    public static void main(String[] args) {
        leetcode_114 t = new leetcode_114();
        t.solve();
    }
}
