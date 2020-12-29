package easy;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode_160 {

    class ListNode {
        int val;
        ListNode next;
    }
    public void solve() {
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> a = new HashSet<>();
        while (headA != null) {
            a.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if(a.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        leetcode_160 t = new leetcode_160();
        t.solve();
    }
}
