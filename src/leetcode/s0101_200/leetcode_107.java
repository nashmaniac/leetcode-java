package leetcode.s0101_200;

import java.util.ArrayList;
import java.util.List;

public class leetcode_107 {


    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }


    public int findHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+Math.max(findHeight(root.left), findHeight(root.right));
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        int height = findHeight(root);
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<height;i++) {
            arr.add(new ArrayList<Integer>());
        }
        return levelOrderBottom(root, height, 0, arr);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root, int height, int level, List<List<Integer>> arr) {
        if(root == null) {
            return null;
        }
        arr.get(height-level-1).add(root.val);
        levelOrderBottom(root.left, height, level+1, arr);
        levelOrderBottom(root.right, height, level+1, arr);
        return arr;
    }


    public static void main(String[] args) {
        leetcode_107 t = new leetcode_107();
    }
}
