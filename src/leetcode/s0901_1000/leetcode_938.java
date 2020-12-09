package leetcode.s0901_1000;

public class leetcode_938 {


    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        return rangeSumBST(root, L, R, 0);
    }

    public int rangeSumBST(TreeNode root, int L, int R, int sum) {
        if(root == null) {
            return sum;
        }
        int leftcount = rangeSumBST(root.left, L, R, sum);
        int rightcount = rangeSumBST(root.right, L, R, sum);
        if( root.val >= L && root.val <= R) {
            sum += root.val;
        }
        return sum + leftcount + rightcount;
    }



    public static void main(String[] args) {
        leetcode_938 t = new leetcode_938();
    }
}
