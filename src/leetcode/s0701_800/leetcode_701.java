package leetcode.s0701_800;

public class leetcode_701 {


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

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            root = new TreeNode(val);
            return root;
        }
        if(root.val < val) {
            root.right = insertIntoBST(root.right, val);
        } else if(root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            return root;
        }
        return root;
    }

    public void solve() {
        int[] a = new int[]{4,2,7,1,3};
        int val = 5;
        TreeNode[] nodes = new TreeNode[a.length];

        for(int i=0;i<a.length;i++) {
            nodes[i] = new TreeNode(a[i]);
        }

        for(int i=0;i<nodes.length;i++) {
            if(2*i+1< nodes.length) {
               nodes[i].left = nodes[2*i+1];
            }

            if(2*i+2< nodes.length) {
               nodes[i].right = nodes[2*i+2];
            }
        }
        insertIntoBST(nodes[0], val);
    }


    public static void main(String[] args) {
        leetcode_701 t = new leetcode_701();
        t.solve();
    }
}
