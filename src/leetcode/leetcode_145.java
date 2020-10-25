package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_145 {

    class BinarySearchTree {
        TreeNode root = null;

        BinarySearchTree () {

        }

        TreeNode insert(TreeNode r, int i) {
            if(r == null) {
                return new TreeNode(i);
            }
            if(r.val > i) {
                r.left = this.insert(r.left, i);
            } else {
                r.right = this.insert(r.right, i);
            }
            return r;
        }

        void insert(int i) {
            this.root = this.insert(this.root, i);
        }
    }

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



    public List<Integer> postorderTraversal(TreeNode root, ArrayList<Integer> b) {
        if(root == null) {
            return new ArrayList<>();
        }
        postorderTraversal(root.left, b);
        postorderTraversal(root.right, b);
        b.add(root.val);
        return b;
    }

    public void solve() {
        BinarySearchTree b = new BinarySearchTree();
        int[] m = {1, 2, 3, 4, 5, 6};
        for(int i: m) {
            b.insert(i);
        }
        ArrayList<Integer> t = (ArrayList<Integer>) this.postorderTraversal(b.root, new ArrayList<Integer>());
        for(Integer i: t) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        leetcode_145 t = new leetcode_145();
        t.solve();
    }
}
