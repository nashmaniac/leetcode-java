package leetcode.s0601_700;

import java.util.ArrayList;
import java.util.List;

public class leetcode_637 {


    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int findHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+ Math.max(findHeight(root.left), findHeight(root.right));
    }

    public List<Integer>[] traverseTree(TreeNode root, int level, List<Integer>[] arr) {
        if(root == null) {
            return null;
        }
        arr[level].add(root.val);
        traverseTree(root.left, level+1, arr);
        traverseTree(root.right, level+1, arr);
        return arr;
    }

    public double average(List<Integer> arr) {
        double a = 0.0;
        for(Integer b: arr) {
            a+=b;
        }
        return a/arr.size();
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> levels = new ArrayList<>();
        int height = findHeight(root);
        List<Integer>[] arr = new List[height];
        for(int i=0;i<height;i++) {
            arr[i] = new ArrayList<>();
            levels.set(i, 0.0);
        }

        arr = traverseTree(root, 0, arr);

        for(int i=0;i<arr.length;i++) {
            levels.set(i, average(arr[i]));
        }



        return levels;
    }

    public static void main(String[] args) {
        leetcode_637 t = new leetcode_637();
    }
}
