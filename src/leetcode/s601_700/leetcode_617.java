package leetcode.s601_700;

public class leetcode_617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        if(t1!=null && t2 != null) {
            t1.val = t2.val+t1.val;
            return t1;
        } else if(t1!=null && t2 == null) {
            return t1;
        } else if(t2!=null && t1==null) {
            return t2;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        leetcode_617 t = new leetcode_617();
    }
}
