package leetcode.s01_100;

public class leetcode_19 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode first = d;
        ListNode second = d;
        for(int i=0;i<n+1;i++){
            first = first.next;
        }
        while (first!=null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return d.next;
    }

    public static void main(String[] args) {
        leetcode_19 t = new leetcode_19();
    }
}
