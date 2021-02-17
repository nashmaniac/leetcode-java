package hard;

import java.util.List;

public class leetcode_23 {


    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public void solve() {
    }

    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(-1);
        ListNode current = prev;
        while (l1!=null && l2!=null) {
            if(l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }


        if(l1!=null) {
            prev.next = l1;
        }

        if(l2!=null) {
            prev.next = l2;
        }
        return current.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        ListNode current = lists[0];
        for(int i=1;i<lists.length;i++) {
            current = mergeTwoList(current, lists[i]);
        }
        return current;
    }

    public static void main(String[] args) {
        leetcode_23 t = new leetcode_23();
        t.solve();
    }
}
