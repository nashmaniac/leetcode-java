package leetcode.s101_200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_102 {
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

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+ Math.max(height(root.left), height(root.right));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> arrayList = new ArrayList<List<Integer>>();
        int height = height(root);
        for(int i=0;i<height;i++) {
            arrayList.add(i, new ArrayList<Integer>());
        }
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> heights = new LinkedList<>();

        nodes.add(root);
        heights.add(0);
        while (!nodes.isEmpty()) {
            TreeNode n = nodes.remove();
            Integer index = heights.remove();

            arrayList.get(index).add(n.val);
            if(n.left!=null) {
                nodes.add(n.left);
                heights.add(index+1);
            }
            if(n.right!=null) {
                nodes.add(n.right);
                heights.add(index+1);
            }
        }

        return arrayList;


    }



    public static void main(String[] args) {
        leetcode_102 t = new leetcode_102();
    }
}
