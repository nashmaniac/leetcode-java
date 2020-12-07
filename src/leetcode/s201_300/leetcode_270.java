package leetcode.s201_300;

public class leetcode_270 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int closestValue(TreeNode root, double target, int lowest) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        int leftReturn = closestValue(root.left, target, lowest);
        int rightReturn = closestValue(root.right, target, lowest);
        int lowestval;
        int node;
        //
        return -1;
    }

    public int closestValue(TreeNode root, double target) {
        return closestValue(root, target, Integer.MAX_VALUE);
    }





    public static void main(String[] args) {
        leetcode_270 t = new leetcode_270();
    }
}
