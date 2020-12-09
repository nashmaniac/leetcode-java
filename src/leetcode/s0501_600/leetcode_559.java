package leetcode.s0501_600;

import java.util.List;

public class leetcode_559 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        int maxHeight = 0;
        for(Node c: root.children) {
            maxHeight = Math.max(maxHeight, maxDepth(c));
        }
        return 1+maxHeight;
    }


    public static void main(String[] args) {
        leetcode_559 t = new leetcode_559();
    }
}
