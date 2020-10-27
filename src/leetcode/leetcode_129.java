package leetcode;

public class leetcode_129 {

    class TreeNode {
        int val;
        leetcode_1302.TreeNode left;
        leetcode_1302.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, leetcode_1302.TreeNode left, leetcode_1302.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }

    public int sumNumbers(TreeNode root, String parent, int sum) {
        if(root == null) {
            return sum;
        }
        parent = parent.concat(String.valueOf(root.val));
        if(root.left != null) {
//            sum = sumNumbers(root.left, parent, sum);
        }
        if (root.right != null) {
//            sum = sumNumbers(root.right, parent, sum);
        }
        if(isLeaf(root)) {
            return sum+Integer.valueOf(parent);
        }
        return sum;
    }

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, "", 0);
    }

    public static void main(String[] args) {
        leetcode_129 t = new leetcode_129();
    }
}
