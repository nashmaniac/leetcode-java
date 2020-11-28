package leetcode.s201_300;

public class leetcode_203 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;

        while (current!=null) {
            if(current.val == val) {
                prev.next = prev.next.next;
                current = current.next;
            } else {
                prev = prev.next;
                current = current.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        leetcode_203 t = new leetcode_203();
    }
}
