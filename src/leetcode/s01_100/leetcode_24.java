package leetcode.s01_100;

public class leetcode_24 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        int val = head.val;
        head.val = head.next.val;
        head.next.val = val;
        head.next.next = swapPairs(head.next.next);
        return head;
    }

    public static void main(String[] args) {
        leetcode_24 t = new leetcode_24();
    }
}
