package medium;

import java.util.ArrayList;
import java.util.List;

public class leetcode_113 {
    public void solve() {
    }

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    List<List<Integer>> arr;

    public List<List<Integer>> pathSum(TreeNode root, int sum, List<Integer> a) {
        if(root == null && sum == 0) {
            arr.add(a);
            return arr;
        }
        sum -= root.val;
        a.add(root.val);
        pathSum(root.left, sum, a) ;
        pathSum(root.right, sum, a) ;
        return arr;
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        arr = new ArrayList<>();
        pathSum(root, sum, new ArrayList<>());
        return  arr;
    }

    public static void main(String[] args) {
        leetcode_113 t = new leetcode_113();
        t.solve();
    }
}
