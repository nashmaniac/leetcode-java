package medium;

public class leetcode_143 {
    public void solve() {
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public int getLength(ListNode head) {
        int count = 0;
        while (head !=null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public void reorderList(ListNode head) {
        int length = getLength(head);
        if(length > 2) {
            int mid = length % 2 == 0 ? length/2 : (length/2)+1;
            int count = 0;
            ListNode first = head;
            while (count < mid) {
                first = first.next;
                count++;
            }

            ListNode second = reverseList(first.next);
            ListNode prevHead = new ListNode(-1);
            ListNode dummy = prevHead;
            count = 0;
            while (head != null && second != null) {
                if (count == 0) {
                    prevHead.next = head;
                    head = head.next;
                } else {
                    prevHead.next = second;
                    second = second.next;
                }
                prevHead = prevHead.next;
                count++;
            }

            if(head!=null) {
                prevHead.next = head;
                prevHead = prevHead.next;
            }
            if(second!=null) {
                prevHead.next = second;
                prevHead = prevHead.next;
            }
        }

    }

    public static void main(String[] args) {
        leetcode_143 t = new leetcode_143();
        t.solve();
    }
}
