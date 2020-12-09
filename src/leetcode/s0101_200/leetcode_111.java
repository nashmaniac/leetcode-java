package leetcode.s0101_200;

public class leetcode_111 {


    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }


    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static void main(String[] args) {
        leetcode_111 t = new leetcode_111();
    }
}
