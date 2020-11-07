package leetcode.s101_200;

public class leetcode_142 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && slow!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                slow = head;
                while (slow!=fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;


    }

    public static void main(String[] args) {
        leetcode_142 t = new leetcode_142();
    }
}
