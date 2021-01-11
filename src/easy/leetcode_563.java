package easy;

public class leetcode_563 {
    public void solve() {

    }

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int setTilt(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int val = root.val;
        int left = setTilt(root.left);
        int right = setTilt(root.right);
        root.val = Math.abs(left-right);
        return val;
    }
    public int addTilt(TreeNode root, int ans) {
        if(root == null) {
            return 0;
        }

        ans += root.val;

        return addTilt(root.left, ans) + addTilt(root.right, ans);
    }

    public int findTilt(TreeNode root) {
        setTilt(root);
        return addTilt(root, 0);
    }

    public static void main(String[] args) {
        leetcode_563 t = new leetcode_563();
        t.solve();
    }
}
