package leetcode.s001_100;

public class leetcode_100 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if((p != null && q == null)||(p == null && q != null)) {
            return false;
        }

        if(p.val!=q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public static void main(String[] args) {
        leetcode_100 t = new leetcode_100();
    }
}
