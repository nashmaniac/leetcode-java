package leetcode.s0201_300;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode_297 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    public String serialize(TreeNode root) {
        if(root == null) {
            return "";
        }
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<String> arr = new ArrayList<>();
        q.add(root);
        arr.add(String.valueOf(root.val));
        while (!q.isEmpty()) {
            TreeNode n = q.remove();
            if(n.left!=null) {
                q.add(n.left);
                arr.add(String.valueOf(n.left.val));
            } else {
                arr.add("null");
            }
            if(n.right!=null) {
                q.add(n.right);
                arr.add(String.valueOf(n.right.val));
            } else {
                arr.add("null");
            }

        }
        int max = -1;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i)!="null") {
                max = i;
            }
        }
        for(int i=arr.size()-1;i>max;i--) {
            arr.remove(i);
        }
        return String.join(",", arr);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") {
            return null;
        }
        String[] n = data.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(n[0]));
        q.add(root);
        for(int i=1;i<n.length;i=i+2) {
            TreeNode node = q.remove();

            if("null".equals(n[i])) {
                node.left = null;
            } else {
                TreeNode t = new TreeNode(Integer.valueOf(n[i]));
                node.left = t;
                q.add(t);
            }
            if(i+1<n.length) {
                if("null".equals(n[i+1])) {
                    node.right = null;
                } else {
                    TreeNode t = new TreeNode(Integer.valueOf(n[i+1]));
                    node.right = t;
                    q.add(t);
                }
            }

        }
        return root;
    }

    public void solve() {
        String[] n = new String[]{"1","2","3","null","null","4","5","6","7" };
        TreeNode[] nodes = new TreeNode[n.length];
        for(int i=0;i<n.length;i++) {
            if(n[i].equals("null")) {
                nodes[i] = null;
            } else {
                nodes[i] = new TreeNode(Integer.valueOf(n[i]));
            }

        }
        for(int i=0;i<nodes.length;i++) {
            if(nodes[i] != null) {
                if(2*i+1<nodes.length) {
                    nodes[i].left = nodes[2*i+1];
                }
                if(2*i+2<nodes.length) {
                    nodes[i].right = nodes[2*i+2];
                }
            }
        }

        String s = serialize(nodes[0]);
        System.out.println();
        deserialize(s);
    }

    public static void main(String[] args) {
        leetcode_297 t = new leetcode_297();
        t.solve();
    }
}
