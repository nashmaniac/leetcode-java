package easy;

public class leetcode_876 {
    public void solve() {
    }

    class ListNode {
        int val;
        ListNode next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        leetcode_876 t = new leetcode_876();
        t.solve();
    }
}
