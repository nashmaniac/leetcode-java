package medium;

import java.util.List;

public class leetcode_143 {
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

    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode current = slow;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode first = head, second = prev;
        while (second != null) {
            ListNode tmp = first.next;
            first.next = second;
            first = tmp;
            tmp = second.next;
            second.next = first;
            second = tmp;
        }
    }

    public static void main(String[] args) {
        leetcode_143 t = new leetcode_143();
        t.solve();
    }
}
