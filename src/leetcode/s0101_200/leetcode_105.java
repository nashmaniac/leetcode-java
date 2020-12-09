package leetcode.s0101_200;

import java.util.HashMap;

public class leetcode_105 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    int[] pre;
    int[] in;
    int preIndex = 0;

    HashMap<Integer, Integer> inorderMap = new HashMap<>();


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.pre = preorder;
        this.in = inorder;
        int N = preorder.length;
        for(int i=0;i<inorder.length;i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTree(0, N, N);
    }

    public TreeNode buildTree(int start, int end, int size) {
        if(size == 0 || start == end) {
            return null;
        }
        if(size == 1) {
            TreeNode root = new TreeNode(this.pre[preIndex++]);
            return root;
        }
        int val = this.pre[preIndex++];
        int index = this.inorderMap.get(val);
        TreeNode root = new TreeNode(val);
        root.left = buildTree(start, index, index-start);
        root.right = buildTree(index+1, end, end-(index+1));
        return root;
    }

    public static void main(String[] args) {
        leetcode_105 t = new leetcode_105();
    }
}
