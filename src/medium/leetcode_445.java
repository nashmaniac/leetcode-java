package medium;

public class leetcode_445 {
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

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = reverseList(l1);
        ListNode n2 = reverseList(l2);
        ListNode prevHead = new ListNode(0);
        ListNode current = prevHead;
        int carry = 0;
        while(n1 != null & n2 != null) {
            int temp = carry + n1.val + n2.val;
            prevHead.next = new ListNode(temp%10);
            carry = temp / 10;

            prevHead = prevHead.next;
            n1 = n1.next;
            n2 = n2.next;
        }

        while (n1 != null) {
            int temp = carry + n1.val;
            prevHead.next = new ListNode(temp%10);
            carry = temp / 10;

            prevHead = prevHead.next;
            n1 = n1.next;
        }
        while (n2 != null) {
            int temp = carry + n2.val;
            prevHead.next = new ListNode(temp%10);
            carry = temp / 10;

            prevHead = prevHead.next;
            n2 = n2.next;
        }

        if(carry > 0) {
            prevHead.next = new ListNode(carry);
        }
        return reverseList(current.next);
    }

    public static void main(String[] args) {
        leetcode_445 t = new leetcode_445();
        t.solve();
    }
}
