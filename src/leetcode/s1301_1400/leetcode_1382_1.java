package leetcode.s1301_1400;

public class leetcode_1382_1 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1+Math.min(height(root.left), height(root.right));
    }

    public int findBf(TreeNode root) {
        return height(root.left)-height(root.right);
    }

    public TreeNode rightRotation(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode x = root;
        TreeNode y = root.left;
        if(y!=null) {
            TreeNode b = y.right;
            x.left = b;
        }
        y.right = x;
        return y;
    }

    public TreeNode leftRotation(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode x = root;
        TreeNode y = root.right;
        if(y!=null) {
            TreeNode b = y.left;
            y.left = x;
            x.right = b;
        }
        return root;
    }

    public TreeNode rebalance(TreeNode root) {
        int bf = findBf(root);

        if(bf >= -2) {
            // right heavy node
            if(findBf(root.right)>0) {
                // right turn
                root.right = rightRotation(root.right);
                // left turn
                return leftRotation(root);
            }
            if(findBf(root.right)<0) {
                // left turn
                return leftRotation(root);
            }
        }

        if(bf >= 2) {
            // left heavy node
            if(findBf(root.left)>0) {
                // right turn
                return rightRotation(root);
            }

            if(findBf(root.left)<0) {
                // left turn
                root.left = leftRotation(root.left);
                // right turn
                return rightRotation(root);
            }
        }
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        root.left = balanceBST(root.left);
        root.right = balanceBST(root.right);
        return rebalance(root);
    }

    public static void main(String[] args) {
        leetcode_1382_1 t = new leetcode_1382_1();
    }
}
