package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_590 {
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
    }

    public List<Integer> postorder(Node root, List<Integer> intList) {
        if(root != null) {
            for(Node n: root.children) {
                postorder(root, intList);
            }
            intList.add(root.val);
        }
        return intList;
    }

    public List<Integer> postorder(Node root) {
        ArrayList<Integer> t = new ArrayList<>();
        return postorder(root, new ArrayList<>());

    }


    public static void main(String[] args) {
        leetcode_590 t = new leetcode_590();
    }
}
