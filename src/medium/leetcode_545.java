package medium;

import java.util.*;

public class leetcode_545 {
    public void solve() {
    }

    class  TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    ArrayList<Integer> arr;
    Stack<Integer> stack;

    public void gatherLeftNode(TreeNode root) {
        if(root == null) {
            return;
        }
        arr.add(root.val);
        if(root.left != null ) {
            gatherLeftNode(root.left);
        } else {
            gatherLeftNode(root.right);
        }
    }

    public void gatherLeaves(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            arr.add(root.val);
        }

        gatherLeaves(root.left);
        gatherLeaves(root.right);
    }

    public void gatherRightNode(TreeNode root) {
        if(root == null) {
            return;
        }
        stack.push(root.val);

        if(root.right != null) {
            gatherRightNode(root.right);
        } else {
            gatherRightNode(root.left);
        }
    }

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        arr = new ArrayList<>();
        stack = new Stack<>();
        if(root != null) {
            arr.add(root.val);
            gatherLeftNode(root.left);
            gatherLeaves(root.left);
            gatherLeaves(root.right);
            gatherRightNode(root.right);

            while (!stack.isEmpty()) {
                arr.add(stack.pop());
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        leetcode_545 t = new leetcode_545();
        t.solve();
    }
}
