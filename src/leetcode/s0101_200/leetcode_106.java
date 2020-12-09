package leetcode.s0101_200;

import java.util.HashMap;

public class leetcode_106 {

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
    int[] in;
    int[] post;
    int postIndex;

    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int size = postorder.length;
        postIndex = size - 1;
        this.in = inorder;
        this.post = postorder;
        for(int i=0;i< inorder.length;i++) {
            hashMap.put(in[i], i);
        }
        return buildTree(0, size, size);
    }

    public TreeNode buildTree(int start, int end, int size) {
        if(size == 0 || start == end) {
            return null;
        }
        if(size == 1) {
            TreeNode root = new TreeNode(post[postIndex--]);
            return root;
        }
        int val = post[postIndex--];
        int index = hashMap.get(val);

        TreeNode root = new TreeNode(val);
        root.right = buildTree(index+1, end, end-(index+1));
        root.left = buildTree(start, index, index-start);
        return root;
    }

    public static void main(String[] args) {
        leetcode_106 t = new leetcode_106();
    }
}
