package leetcode.s01_100;

import leetcode.s01_100.leetcode_61.ListNode;

public class leetcode_61 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public int countLength(ListNode head) {
        ListNode current = head;
        int c = 0;
        while (current!=null) {
            c++;
            current = current.next;
        }
        return c;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0 || countLength(head)==1) {
            return head;
        }

        ListNode newHead = reverseList(head);
        ListNode newTail = head;
        for(int i=0;i<k;i++) {
            ListNode next = newHead.next;
            newTail.next = newHead;
            newHead.next = null;
            newTail = newHead;
            newHead = next;
        }
        return reverseList(newHead);
    }

    public void solve() {
        ListNode l = new ListNode(1);
        rotateRight(l, 1);
    }

    public static void main(String[] args) {
        leetcode_61 t = new leetcode_61();
        t.solve();
    }
}
