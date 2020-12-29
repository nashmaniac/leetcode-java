package easy;

import java.util.List;

public class leetcode_83 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }
    public void solve() {
    }

    public static void main(String[] args) {
        leetcode_83 t = new leetcode_83();
        t.solve();
    }
}
