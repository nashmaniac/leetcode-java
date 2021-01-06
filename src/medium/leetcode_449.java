package medium;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode_449 {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode(int val){
            this.val = val;
            right = null;
            left = null;
        }
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            Queue<TreeNode> s = new LinkedList<>();
            s.add(root);

            ArrayList<String> so = new ArrayList<>();
            while (!s.isEmpty()) {
                TreeNode node = s.poll();
                so.add(node == null ? null : String.valueOf(node.val));
                if(node != null) {
                    s.offer(node.left);
                    s.offer(node.right);
                }
            }
            while (so.get(so.size()-1) == null) {
                so.remove(so.size()-1);
            }

            StringBuilder a = new StringBuilder();
            for(int i=0;i<so.size();i++) {
                a.append(so.get(i));
                if(i!=so.size()-1) {
                    a.append(",");
                }
            }
            return a.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] so = data.split(",");
            TreeNode[] nodes = new TreeNode[so.length];
            for(int i=0;i<so.length;i++) {
                if(so[i] != null) {
                    nodes[i] = new TreeNode(Integer.parseInt(so[i]));
                } else {
                    nodes[i] = null;
                }
            }

            for(int i=0;i<nodes.length;i++) {
                if(nodes[i] != null) {
                    if(2*i+1 < nodes.length) {
                        nodes[i].left = nodes[2*i+1];
                    }
                    if(2*i+2 < nodes.length) {
                        nodes[i].right = nodes[2*i+2];
                    }

                }
            }
            return nodes[0];
        }
    }
    public void solve() {
    }

    public static void main(String[] args) {
        leetcode_449 t = new leetcode_449();
        t.solve();
    }
}
