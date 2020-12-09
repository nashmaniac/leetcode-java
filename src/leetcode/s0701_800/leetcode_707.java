package leetcode.s0701_800;

public class leetcode_707 {

    class MyLinkedList {

        class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        Node head, tail;
        int size;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        boolean isEmpty() {
            return this.head == null;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if(index >= this.size) {
                return -1;
            }

            if(this.isEmpty()) {
                return -1;
            }

            Node current = this.head;

            while (index > 0){
                current = current.next;
                index--;
            }
            return current.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            Node n = new Node(val);
            if(this.isEmpty()) {
                this.head = n;
                this.tail = this.head;
            } else {
                n.next = this.head;
                this.head = n;
            }
            size++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node n = new Node(val);
            if(this.isEmpty()) {
                this.head = n;
                this.tail = this.head;
            } else {
                this.tail.next = n;
                this.tail = n;
            }
            size++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if (index == 0) {
                this.addAtHead(val);
            } else if(index == this.size) {
                this.addAtTail(val);
            } else if (index < this.size) {
                Node current = this.head;
                while (index > 1) {
                    current = current.next;
                    index--;
                }
                Node n = new Node(val);
                n.next = current.next;
                current.next = n;
                size++;
            } else {

            }

        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {

            if(index<size && !this.isEmpty()) {
                if(index == 0) {
                    this.head = this.head.next;
                    if(this.size == 1) {
                        this.tail = this.head;
                    }
                    this.size--;
                } else {
                    Node current = this.head;
                    while (index > 1) {
                        current = current.next;
                        index--;
                    }
                    if(current.next == this.tail) {
                        this.tail = current;
                    }
                    current.next = current.next.next;
                    size--;

                }
            }


        }
    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */

    public void solve() {
        MyLinkedList l = new MyLinkedList();
        l.addAtHead(2);
        l.deleteAtIndex(1);
        l.addAtHead(2);
        l.addAtHead(7);
        l.addAtHead(3);
        l.addAtHead(2);
        l.addAtHead(5);
        l.addAtTail(5);
        l.get(5);
        l.deleteAtIndex(6);
        l.deleteAtIndex(4);
    }


    public static void main(String[] args) {
        leetcode_707 t = new leetcode_707();
        t.solve();


    }
}
