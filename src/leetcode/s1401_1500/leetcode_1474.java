package leetcode.s1401_1500;

public class leetcode_1474 {

    class ListNode {
        int val;
        ListNode next;
    }

    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode current = head;
        ListNode lastNode = head;

        while (current!=null) {
            int mCount = m, nCount = n;
            while ((current!=null) || (mCount>1)) {
                lastNode = current;
                current = current.next;
                mCount--;
            }

            while ((current != null) || (nCount>1)) {
                current = current.next;
                nCount--;
            }

            lastNode.next = current;
        }
        return head;
    }

    public static void main(String[] args) {
        leetcode_1474 t = new leetcode_1474();
    }
}
