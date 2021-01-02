package medium;

public class leetcode_2 {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prevhead = new ListNode(-1);
        ListNode current = prevhead;
        int carry = 0;
        while (l1 != null && l2!=null) {
            int temp = l1.val + l2.val + carry;
            current.next = new ListNode(temp%10);
            carry = temp / 10;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int temp = l1.val + carry;
            current.next = new ListNode(temp%10);
            carry = temp / 10;
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int temp = l2.val + carry;
            current.next = new ListNode(temp%10);
            carry = temp / 10;
            current = current.next;
            l2 = l2.next;
        }

        if(carry > 0) {
            current.next = new ListNode(carry);
        }
        return prevhead.next;
    }


    public static void main(String[] args) {
        leetcode_2 t = new leetcode_2();
        t.solve();
    }
}
