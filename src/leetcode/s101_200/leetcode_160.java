package leetcode.s101_200;

public class leetcode_160 {

    class ListNode {
        int val;
        ListNode next;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode current = headA;
        while (current!=null) {
            lenA++;
            current = current.next;
        }
        current = headB;
        while (current!=null) {
            lenB++;
            current = current.next;
        }
        // System.out.println(lenA);System.out.println(lenB);

        if(lenA > lenB) {
            for(int i=0;i<lenA-lenB;i++) {
                headA = headA.next;
            }

        } else if(lenB > lenA) {
            for(int i=0;i<lenB-lenA;i++) {
                headB = headB.next;
            }
        }

        // System.out.println(headA.val);
        // System.out.println(headB.val);
        while (headA!=null && headB!=null) {
            if(headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        leetcode_160 t = new leetcode_160();
    }
}
