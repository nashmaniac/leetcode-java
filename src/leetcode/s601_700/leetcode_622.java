package leetcode.s601_700;

public class leetcode_622 {

    class MyCircularQueue {

        int size = 0;
        int limit;
        class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        Node tail;

        /** Initialize your data structure here. Set the size of the queue to be k. */
        public MyCircularQueue(int k) {
            this.limit = k;
            this.size = 0;
            this.tail = null;
        }

        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value) {
            if(this.isFull()) {
                return false;
            }
            Node n = new Node(value);
            if (this.size == 0) {
                this.tail = n;
                this.tail.next = this.tail;
            } else {
                n.next = this.tail.next;
                this.tail.next = n;
                this.tail = n;
            }
            size++;
            return true;
        }

        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() {
            if(this.isEmpty()) {
                return false;
            }
            if(this.size == 1) {
                this.tail = null;
            } else {
                this.tail.next = this.tail.next.next;
            }
            size--;
            return true;
        }

        /** Get the front item from the queue. */
        public int Front() {
            if(!this.isEmpty()) {
                return this.tail.next.val;
            }
            return -1;
        }

        /** Get the last item from the queue. */
        public int Rear() {
            if(!this.isEmpty()) {
                return this.tail.val;
            }
            return -1;
        }

        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            return this.size == 0;
        }

        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            return this.size == this.limit;
        }
    }
    MyCircularQueue circularQueue;
    leetcode_622(int k) {
        circularQueue = new MyCircularQueue(k);
    }


    public static void main(String[] args) {
        leetcode_622 t = new leetcode_622(7);
        System.out.println(t.circularQueue.enQueue(0));  // return true
        System.out.println(t.circularQueue.Front());  // return true
        System.out.println(t.circularQueue.enQueue(4));  // return true
        System.out.println(t.circularQueue.Rear());  // return false, the queue is full
        System.out.println(t.circularQueue.enQueue(6));  // return true
        System.out.println(t.circularQueue.enQueue(3));  // return true
        System.out.println(t.circularQueue.Rear());  // return true
        System.out.println(t.circularQueue.deQueue());  // return true
        System.out.println(t.circularQueue.Front());  // return true
        System.out.println(t.circularQueue.deQueue());  // return 4
        System.out.println(t.circularQueue.Front());  // return 4
    }
}
