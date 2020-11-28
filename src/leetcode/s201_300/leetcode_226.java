package leetcode.s201_300;

public class leetcode_226 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        leetcode_226 t = new leetcode_226();
    }
}
