package medium;

public class leetcode_148 {
    public void solve() {
        int[] a = new int[] {4, 2, 1, 3};
        ListNode[] nodes = new ListNode[a.length];
        for(int i=0;i<a.length;i++) {
            nodes[i] = new ListNode(a[i]);
            if(i>0) {
                nodes[i-1].next = nodes[i];
            }
        }
        sortList(nodes[0]);

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode prevHead = new ListNode(-1);
        ListNode current = prevHead;

        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                prevHead.next = l1;
                l1 = l1.next;
            } else {
                prevHead.next = l2;
                l2 = l2.next;
            }
            prevHead = prevHead.next;
        }
        if(l1 != null) {
            prevHead.next = l1;
        }
        if(l2 != null) {
            prevHead.next = l2;
        }
        return current.next;
    }

    public ListNode getMid(ListNode head) {
        ListNode prevHead = new ListNode(-1);
        prevHead.next = head;
        ListNode fast = head, slow = head;
        while (fast != null  && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            prevHead = prevHead.next;
        }
        ListNode mid = prevHead.next;
        prevHead.next = null;
        return mid;
    }


    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(mid);
        return merge(l1, l2);
    }

    public static void main(String[] args) {
        leetcode_148 t = new leetcode_148();
        t.solve();
    }
}
