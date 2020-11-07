package leetcode.s301_400;

public class leetcode_328 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode oddHead = head;
        ListNode evenHead = oddHead.next;
        ListNode even = evenHead;

        while (even != null) {
            oddHead.next = even.next;
            oddHead = oddHead.next;
            even.next = oddHead.next == null ? null : oddHead.next;
            even = even.next;
        }

        if(evenHead != null) {
            oddHead.next = evenHead;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        leetcode_328 t = new leetcode_328();
    }
}
