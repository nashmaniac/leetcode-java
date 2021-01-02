package medium;

import java.util.ArrayList;
import java.util.List;

public class leetcode_94 {
    public void solve() {
    }

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    List<Integer> arr = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        inorderTraversal(root.left);
        arr.add(root.val);
        inorderTraversal(root.right);
        return arr;
    }


    public static void main(String[] args) {
        leetcode_94 t = new leetcode_94();
        t.solve();
    }
}
