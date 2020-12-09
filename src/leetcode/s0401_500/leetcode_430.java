package leetcode.s0401_500;

import java.util.ArrayList;

public class leetcode_430 {

    class Chain {
        Node head;
        Node tail;
        public Chain() {
            this.head = null;
            this.tail = null;
        }
        public boolean isEmpty() {
            return this.head == null;
        }

        public void insert(int val) {
            Node n = new Node(val);
            if(this.isEmpty()) {
                this.head = n;
                this.tail = n;
            } else {
                this.tail.next = n;
                n.prev = this.tail;
                this.tail = n;
            }
        }
        public void insert(Node n) {
            if(this.isEmpty()) {
                this.head = n;
                this.tail = n;
            } else {
                this.tail.next = n;
                n.prev = this.tail;
                this.tail = n;
            }
        }

        public void printChain() {
            Node c = this.head;
            while (c!=null) {
                System.out.print(c.val + " ");
                c = c.next;
            }
            System.out.println();
        }


    }

    class Node {
        int val;
        Node next;
        Node prev;
        Node child;
        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
            this.child = null;
        }
    }

    public Node flatten(Node head) {
        if(head == null) {
            return head;
        }
        Node current = head;
        while (current != null) {
            Node childHead = flatten(current.child);
            if(childHead != null) {

                Node next = current.next;

                // set the next pointer
                current.next = childHead;
                childHead.prev = current;
                current.child = null;

                // set the tail pointer
                Node n = childHead;
                while (n.next!=null) {
                    n = n.next;
                }
                n.next = next;
                if(next!=null) {
                    next.prev = n;
                }
                current = next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public void solve() {
        Chain t1 = new Chain();
        Chain t2 = new Chain();
        Chain t3 = new Chain();
        ArrayList<Node> t1_list = new ArrayList<>();
        ArrayList<Node> t2_list = new ArrayList<>();
        ArrayList<Node> t3_list = new ArrayList<>();
        for(int i=1;i<2;i++) {
            Node n = new Node(i);
            t1_list.add(n);
            t1.insert(n);
        }

        for(int i=2;i<3;i++) {
            Node n = new Node(i);
            t2_list.add(n);
            t2.insert(n);
        }
        for(int i=3;i<4;i++) {
            Node n = new Node(i);
            t3_list.add(n);
            t3.insert(n);
        }

        t1.printChain();
        t2.printChain();
        t3.printChain();

        t1_list.get(0).child = t2_list.get(0);
        t2_list.get(0).child = t3_list.get(0);

        Node n = this.flatten(t1_list.get(0));
        while (n!=null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        leetcode_430 t = new leetcode_430();
        t.solve();

    }
}
