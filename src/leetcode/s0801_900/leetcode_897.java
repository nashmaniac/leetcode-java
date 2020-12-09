package leetcode.s0801_900;

import java.util.ArrayList;
import java.util.List;

public class leetcode_897 {

    class TreeNode {
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

    public List<Integer> inOrder(TreeNode root, ArrayList<Integer> intList) {
        if(root == null) {
            return null;
        }
        inOrder(root.left, intList);
        intList.add(root.val);
        inOrder(root.right, intList);
        return intList;
    }

    public TreeNode insert(TreeNode root, Integer i) {
        if(root == null) {
            return new TreeNode(i);
        }
        if(root.val > i) {
            root.left = insert(root.left, i);
        } else {
            root.right = insert(root.right, i);
        }
        return root;
    }

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> numbers = inOrder(root, new ArrayList<>());
        root = null;
        for(Integer i: numbers) {
            root = insert(root, i);
        }
        return root;
    }

    public static void main(String[] args) {
        leetcode_897 t = new leetcode_897();
    }
}
