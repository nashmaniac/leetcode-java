package leetcode;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class leetcode_1290 {

    public int getDecimalValue(ListNode head) {
        int count = 0, chain_length=0;
        ListNode dummy = head;

        while (dummy != null) {
            chain_length++;
            dummy = dummy.next;
        }
//        System.out.println(chain_length);
        int index_count = 0;
        dummy = head;
        while (dummy != null) {
            if (dummy.val == 1) {
                count += Math.pow(2, chain_length-1-index_count);
            }
            index_count++;
            dummy = dummy.next;
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_1290 t = new leetcode_1290();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(1);
        head.next = second;
        second.next = third;

        System.out.println(t.getDecimalValue(head));

    }
}
