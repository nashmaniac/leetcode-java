package easy;


public class leetcode_206 {

    class ListNode {
        int val;
        ListNode next;
    }
    public void solve() {
    }

    public ListNode reverseListIterative(ListNode head) {
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


    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }




    public static void main(String[] args) {
        leetcode_206 t = new leetcode_206();
        t.solve();
    }
}
