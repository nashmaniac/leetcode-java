package leetcode.s601_700;

public class leetcode_641 {


    class MyCircularDeque {
        class Node {
            int val;
            Node next;
            Node prev;

            Node(int val) {
                this.val = val;
                this.next = null;
                this.prev = null;
            }

            public void setNext(Node next) {
                this.next = next;
            }

            public void setPrev(Node prev) {
                this.prev = prev;
            }
        }

        int limit;
        int size = 0;
        Node head;
        Node tail;

        /** Initialize your data structure here. Set the size of the deque to be k. */
        public MyCircularDeque(int k) {
            this.limit = k;
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        /** Adds an item at the front of Deque. Return true if the operation is successful. */
        public boolean insertFront(int value) {
            if(this.isFull()) {
                return false;
            }
            Node n = new Node(value);
            if(this.size == 0) {
                this.head = n;
                this.tail = this.head;
                this.head.setPrev(this.tail);
                this.tail.setNext(this.head);
            } else {
                n.setNext(this.head);
                this.head.setPrev(n);
                this.head = n;
                this.head.setPrev(this.tail);
                this.tail.setNext(this.head);
            }
            size++;
            return true;

        }

        /** Adds an item at the rear of Deque. Return true if the operation is successful. */
        public boolean insertLast(int value) {
            if(this.isFull()) {
                return false;
            }
            Node n = new Node(value);
            if(this.size == 0) {
                this.head = n;
                this.tail = this.head;
            } else {
                this.tail.setNext(n);
                n.setPrev(this.tail);
                this.tail = n;
            }
            this.head.setPrev(this.tail);
            this.tail.setNext(this.head);
            size++;
            return true;
        }

        /** Deletes an item from the front of Deque. Return true if the operation is successful. */
        public boolean deleteFront() {
            if(this.isEmpty()) {
                return  false;
            }
            if(this.size == 1) {
                this.tail = null;
                this.head = null;
            } else {
                this.head.next.setPrev(this.tail);
                this.head = this.head.next;
                this.tail.setNext(this.head);
            }
            size--;
            return true;

        }

        /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
        public boolean deleteLast() {
            if(this.isEmpty()) {
                return  false;
            }
            if(this.size == 1) {
                this.tail = null;
                this.head = null;
            } else {
                this.tail.prev.setNext(this.head);
                this.tail = this.tail.prev;
                this.head.setPrev(this.tail);
            }
            size--;
            return true;
        }

        /** Get the front item from the deque. */
        public int getFront() {
            if(!this.isEmpty()) {
                return this.head.val;
            }
            return -1;
        }

        /** Get the last item from the deque. */
        public int getRear() {
            if(!this.isEmpty()) {
                return this.tail.val;
            }
            return -1;
        }

        /** Checks whether the circular deque is empty or not. */
        public boolean isEmpty() {
            return this.size == 0;
        }

        /** Checks whether the circular deque is full or not. */
        public boolean isFull() {
            return this.size == this.limit;
        }
    }

    /**
     * Your MyCircularDeque object will be instantiated and called as such:
     * MyCircularDeque obj = new MyCircularDeque(k);
     * boolean param_1 = obj.insertFront(value);
     * boolean param_2 = obj.insertLast(value);
     * boolean param_3 = obj.deleteFront();
     * boolean param_4 = obj.deleteLast();
     * int param_5 = obj.getFront();
     * int param_6 = obj.getRear();
     * boolean param_7 = obj.isEmpty();
     * boolean param_8 = obj.isFull();
     */

    public static void main(String[] args) {
        leetcode_641 t = new leetcode_641();
    }
}
