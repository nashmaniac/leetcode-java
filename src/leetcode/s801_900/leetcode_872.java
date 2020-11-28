package leetcode.s801_900;

import java.util.ArrayList;

public class leetcode_872 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


    public void dfs(TreeNode root, ArrayList<Integer> nodes) {
        if(root.right == null && root.left == null) {
            nodes.add(root.val);
        }
        dfs(root.left, nodes);
        dfs(root.right, nodes);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> roots1 = new ArrayList<>();
        ArrayList<Integer> roots2 = new ArrayList<>();

        dfs(root1, roots1);
        dfs(root2, roots2);

        return roots1.equals(roots2);

    }

    public static void main(String[] args) {
        leetcode_872 t = new leetcode_872();
    }
}
