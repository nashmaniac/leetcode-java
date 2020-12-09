package leetcode.s001_100;

public class leetcode_83 {

    class ListNode {
        int val;
        ListNode next;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current!=null && current.next!=null) {
            if(current.next.val == current.val) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;

    }

    public static void main(String[] args) {
        leetcode_83 t = new leetcode_83();
    }
}
