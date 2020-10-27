package leetcode;

public class leetcode_1302 {

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

    public int height(TreeNode root) {
        if(root==null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }


    public int deepestLeavesSum(TreeNode root, int count, int height, int level) {
        if(level == height-1) {
            count += root.val;
        }
        if(root.left != null) {
            count = deepestLeavesSum(root.left, count, height, level+1);
        }
        if(root.right != null) {
            count = deepestLeavesSum(root.right, count, height, level+1);
        }
        return count;
    }

    TreeNode root = null;


    public int deepestLeavesSum(TreeNode root) {
        int height =height(root);
        return deepestLeavesSum(root, 0, height, 0);
    }

    void buildTree() {
        Integer[] a = {6,7,8,2,7,1,3,9,null,1,4,null,null,null,5};
        TreeNode[] nodes = new TreeNode[a.length];

        for(int i=0;i<a.length;i++) {
            if(a[i] == null) {
                nodes[i] = null;
            } else {
                nodes[i] = new TreeNode(a[i]);
            }
        }

        for(int i=0;i<nodes.length;i++) {
            int l = 2*i+1;
            int r = 2*i+2;
            if(l<nodes.length) {
                nodes[i].left = nodes[l];
            }
            if(r<nodes.length) {
                nodes[i].right = nodes[r];
            }
        }

        TreeNode root = nodes[0];
        System.out.println(height(root));
        System.out.println(deepestLeavesSum(root));
    }
    public static void main(String[] args) {
        leetcode_1302 t = new leetcode_1302();
        t.buildTree();
    }
}


/*
[6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
                        6
                     7      8
                   2   7  1   3
                  9   1 4





 */