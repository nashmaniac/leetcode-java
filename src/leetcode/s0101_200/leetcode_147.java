package leetcode.s0101_200;
public class leetcode_147 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            ListNode dummy = head;
            while (dummy!=current) {
                if(dummy.val > current.val) {
                    int t = dummy.val;
                    dummy.val = current.val;
                    current.val = t;
                }
                dummy = dummy.next;
            }

            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        leetcode_147 t = new leetcode_147();
    }
}
