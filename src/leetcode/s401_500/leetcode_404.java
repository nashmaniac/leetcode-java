package leetcode.s401_500;

public class leetcode_404 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int sumOfLeftLeaves(TreeNode root, int sum) {
        if(root == null) {
            return sum;
        }
        int leftCount = sumOfLeftLeaves(root.left, 0);
        int rightCount = sumOfLeftLeaves(root.right, 0);
        if(root.left != null) {
            return sum + root.left.val + leftCount + rightCount;
        } else {
            return sum+ leftCount + rightCount;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, 0);
    }

    public static void main(String[] args) {
        leetcode_404 t = new leetcode_404();
    }
}
