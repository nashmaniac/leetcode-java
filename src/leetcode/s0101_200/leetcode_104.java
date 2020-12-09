package leetcode.s0101_200;

public class leetcode_104 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        leetcode_104 t = new leetcode_104();
    }
}
