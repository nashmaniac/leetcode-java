package leetcode.s601_700;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val=val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class leetcode_700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        TreeNode left=null, right = null;
        if (root.left != null) {
            left = searchBST(root.left, val);
        }
        if(left!=null) {
            return left;
        }
        if (root.right != null) {
            right = searchBST(root.right, val);
        }
        if(right!=null) {
            return right;
        }
        return null;
    }


    public static void main(String[] args) {
        leetcode_700 t = new leetcode_700();
//        TreeNode one = new TreeNode(1);
//        TreeNode three = new TreeNode(3);
//        TreeNode two = new TreeNode(2, one, three);
//        TreeNode seven = new TreeNode(7);
//        TreeNode four = new TreeNode(4, two, seven);
//
//        System.out.println(t.searchBST(four, 5));

        TreeNode eight_four = new TreeNode(84);
        TreeNode six_three = new TreeNode(63, null, eight_four);
        TreeNode two_two = new TreeNode(22, null, six_three);
        TreeNode two = new TreeNode(2);
        TreeNode one_eight = new TreeNode(18, two, two_two);

        System.out.println(t.searchBST(one_eight, 63));

    }
}
