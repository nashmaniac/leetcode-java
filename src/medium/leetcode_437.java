package medium;

import java.util.HashMap;

public class leetcode_437 {
    public void solve() {
    }

    int count = 0;
    HashMap<Integer, Integer> h = new HashMap<>();
    public int pathSum(TreeNode root, int sum){
        pathSum(root, sum , 0);
        return count;
    }

    public void pathSum(TreeNode root, int sum, int val) {
        if(root == null) {
            return;
        }

        val += root.val;
        if(val == sum) {
            count++ ;
        }
        count += h.getOrDefault(val-sum, 0);
        h.put(val, h.getOrDefault(val, 0) + 1);
        pathSum(root.left, sum, val);
        pathSum(root.right, sum, val);
        h.put(val, h.get(val)-1);
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
