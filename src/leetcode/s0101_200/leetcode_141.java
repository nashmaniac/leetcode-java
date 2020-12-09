package leetcode.s0101_200;

public class leetcode_141 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && slow!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode_141 t = new leetcode_141();
    }
}
