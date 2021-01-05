package medium;

import java.util.HashMap;

public class leetcode_146 {
    public void solve() {
    }


    class LRUCache {


        class DLinkNode {
            int val;
            int key;
            DLinkNode next;
            DLinkNode prev;

            DLinkNode(int v, int k) {
                this.val = v;
                this.key = k;
                this.next = null;
                this.prev = null;
            }
        }

        public void add(DLinkNode node) {
            node.next = head.next;
            node.prev = head.next.prev;

            head.next.prev = node;
            head.next = node;
        }

        public void remove(DLinkNode node) {
            DLinkNode prev = node.prev;
            DLinkNode next = node.next;
            next.prev = prev;
            prev.next = next;
        }

        public void moveToHead(DLinkNode node) {
            remove(node);
            add(node);
        }

        DLinkNode head;
        DLinkNode tail;
        int capacity, size;
        HashMap<Integer, DLinkNode> hashMap;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            head = new DLinkNode(-1, -1);
            tail = new DLinkNode(-1, -1);
            head.next = tail;
            tail.prev = head;

            hashMap = new HashMap<>();
        }

        public int get(int key) {
            DLinkNode node = hashMap.get(key);
            if(node != null) {
                return node.val;
            }
            return -1;
        }

        public void put(int key, int value) {
            DLinkNode node = hashMap.get(key);
            if(node == null) {
                // nothing in the chain add the number to the chain
                DLinkNode n = new DLinkNode(value, key);
                hashMap.put(key, n);
                add(n);
                moveToHead(n);
                this.size++;
                if(this.size > this.capacity) {
                    DLinkNode no = this.tail.prev;
                    hashMap.remove(no.key);
                    remove(no);
                    this.size--;
                }
            } else {
                node.val = value;
                hashMap.put(key, node);
                moveToHead(node);
            }
        }
    }

    public static void main(String[] args) {
        leetcode_146 t = new leetcode_146();
        t.solve();
    }
}
