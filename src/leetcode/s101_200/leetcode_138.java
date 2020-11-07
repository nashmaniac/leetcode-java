package leetcode.s101_200;

import java.util.HashMap;

public class leetcode_138 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node dummy = new Node(-1);
        Node newHead = dummy;
        Node current = head;
        HashMap<Node, Node> h = new HashMap<>();

        while (current!=null) {
            Node n = new Node(current.val);
            dummy.next = n;
            dummy = n;
            h.putIfAbsent(current, n);
            current = current.next;
        }

        current = head;
        while (current!=null) {
            if(current.random != null) {
                h.get(current).random = h.get(current.random);
            } else {
                h.get(current).random = null;
            }

            current = current.next;
        }
        return newHead.next;
    }

    public void solve() {

    }

    public static void main(String[] args) {
        leetcode_138 t = new leetcode_138();
    }
}
