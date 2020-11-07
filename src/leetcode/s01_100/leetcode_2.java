package leetcode.s01_100;

public class leetcode_2 {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private ListNode reverseList(ListNode head) {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode m = new ListNode(-1);
        ListNode head = m;
        int carry = 0;
        while (l1!=null && l2!=null) {
            int total = l1.val + l2.val + carry;
            m.next = new ListNode(total%10);
            carry = total/10;
            m = m.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1!=null) {
            int total = l1.val + carry;
            m.next = new ListNode(total%10);
            carry = total/10;
            m = m.next;
            l1 = l1.next;
        }

        while (l2!=null) {
            int total = l2.val + carry;
            m.next = new ListNode(total%10);
            carry = total/10;
            m = m.next;
            l2 = l2.next;
        }

        if(carry > 0) {
            m.next = new ListNode(carry);
            m = m.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        leetcode_2 t = new leetcode_2();
    }
}
