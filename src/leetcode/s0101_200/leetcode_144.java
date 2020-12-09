package leetcode.s0101_200;

import java.util.ArrayList;
import java.util.List;

public class leetcode_144 {
    
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

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> inList) {
        if(root == null) {
            return new ArrayList<Integer>();
        }
        inList.add(root.val);
        preorderTraversal(root.left, inList);
        preorderTraversal(root.right, inList);
        return inList;
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        return preorderTraversal(root, new ArrayList<Integer>());
    }

    public static void main(String[] args) {
        leetcode_144 t = new leetcode_144();
    }
}
