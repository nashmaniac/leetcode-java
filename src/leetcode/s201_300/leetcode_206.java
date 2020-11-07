package leetcode.s201_300;

public class leetcode_206 {

    class ListNode {
        int val;
        ListNode next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current!=null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        leetcode_206 t = new leetcode_206();
    }
}
