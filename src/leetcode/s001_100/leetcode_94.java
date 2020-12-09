package leetcode.s001_100;

import java.util.ArrayList;
import java.util.List;

public class leetcode_94 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> intList) {
        if(root == null) {
            return new ArrayList<Integer>();
        }
        inorderTraversal(root.left, intList);
        intList.add(root.val);
        inorderTraversal(root.right, intList);
        return intList;

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal(root, new ArrayList<Integer>());
    }

    public static void main(String[] args) {
        leetcode_94 t = new leetcode_94();
    }
}
