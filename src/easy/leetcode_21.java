package easy;

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
        ListNode prevHead = new ListNode(-1);
        ListNode prev = prevHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val){
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
        if (l2!=null) {
            prev.next = l2;
        }
        return prevHead.next;
    }


    public void solve() {
    }

    public static void main(String[] args) {
        leetcode_21 t = new leetcode_21();
        t.solve();
    }
}
