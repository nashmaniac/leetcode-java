package medium;

import java.util.List;

public class leetcode_19 {
    public void solve() {
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;

        while (n>0) {
            first = first.next;
            n--;
        }

        while (first!=null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        leetcode_19 t = new leetcode_19();
        t.solve();
    }
}
