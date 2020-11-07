package leetcode.s01_100;

import leetcode.s01_100.leetcode_21.ListNode;

public class leetcode_21 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode newHead = dummy;
        while (l1!=null && l2!=null) {
            if(l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        while (l1!=null) {
            dummy.next = l1;
            dummy = dummy.next;
            l1 = l1.next;
        }
        while (l2!=null) {
            dummy.next = l2;
            dummy = dummy.next;
            l2 = l2.next;
        }

        return newHead.next;
    }

    public static void main(String[] args) {
        leetcode_21 t = new leetcode_21();
    }
}
