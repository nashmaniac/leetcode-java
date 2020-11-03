package leetcode.s1301_1400;

public class leetcode_1382 {

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

    int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public TreeNode leftRotation(TreeNode root) {
        if(root == null) {
            return root;
        }
        TreeNode x = root;
        TreeNode y = root.right;
        if(y!=null) {
            TreeNode t2 = y.left;
            x.right = t2;
            y.left = x;
        }
        return y;
    }

    public TreeNode rightRotation(TreeNode root) {
        if(root == null) {
            return root;
        }
        TreeNode x = root;
        TreeNode y = root.left;
        if(y!=null) {
            TreeNode t2 = y.right;
            x.left = t2;
            y.right = x;
        }
        return y;
    }


    int findBf(TreeNode root) {
        return height(root.left) - height(root.right);
    }

    public TreeNode rebalance(TreeNode root) {
        int bf = findBf(root);
        if(bf <= -2) {
            if(findBf(root.right) <=0) {
                return leftRotation(root);
            } else {
                root.right = rightRotation(root.right);
                return leftRotation(root);
            }
        }
        if (bf >= 2) {
            if(findBf(root.left) >= 0) {
                return rightRotation(root);
            } else {
                root.left = leftRotation(root.left);
                return rightRotation(root);
            }
        }
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        root.left = balanceBST(root.left);
        root.right = balanceBST(root.right);

        // balance here

        return rebalance(root);
    }

    TreeNode root;
    leetcode_1382() {
        root = null;
    }
    void buildTree() {
        root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        balanceBST(root);
    }

    public static void main(String[] args) {
        leetcode_1382 t = new leetcode_1382();
        t.buildTree();
    }
}
