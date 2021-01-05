package medium;

public class leetcode_437 {
    public void solve() {
    }

    public int pathSum(TreeNode root, int sum){
        return pathSum(root, sum , 0);
    }

    public int pathSum(TreeNode root, int sum, int ans) {
        if(root == null) {
            return ans;
        }

        if(root.val == sum) {
            ans++;
        } else {
            ans = pathSum(root.left, sum - root.val, ans);
            ans = pathSum(root.right, sum - root.val, ans);
        }
        return ans;
    }


    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public static void main(String[] args) {
        leetcode_437 t = new leetcode_437();
        t.solve();
    }
}
