package leetcode.s1001_1100;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class leetcode_1022 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;

        }
    }

    public boolean isLeaf(TreeNode root) {
        return root.right == null && root.left == null;
    }

    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, new ArrayList<Integer>());
    }

    public int sumRootToLeaf(TreeNode root, ArrayList<Integer> data) {
        if(root == null) {
            return 0;
        }
        if(isLeaf(root)) {
            // calculate here
            data.add(0, root.val);
            int size = data.size();
            int answer = 0;
            for(int i=0;i<size;i++) {
                answer += (Math.pow(2, i)*data.get(i));
            }
            data.remove(0);
            return answer;
        }
        data.add(0, root.val);
        int a = sumRootToLeaf(root.left, data) + sumRootToLeaf(root.right, data);
        data.remove(0);
        return a;
    }


    public void buildTree() {

        Integer[] vals = new Integer[] {1,0,1,0,1,0, 1};
        TreeNode[] nodes = new TreeNode[vals.length];
        for(int i=0;i<vals.length;i++) {
            if(vals[i] == null) {
                nodes[i] = null;
            } else {
                nodes[i] = new TreeNode(vals[i]);
            }
        }

        for(int i=0;i<nodes.length;i++) {
            if(2*i+1 < nodes.length) {
                nodes[i].left = nodes[2*i+1];
            }
            if(2*i+2 < nodes.length) {
                nodes[i].right = nodes[2*i+2];
            }
        }
        System.out.println(sumRootToLeaf(nodes[0]));

    }

    public void solve() {
        buildTree();

    }

    public static void main(String[] args) {
        leetcode_1022 t = new leetcode_1022();
        t.solve();
    }
}
