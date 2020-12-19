package leetcode.s0301_400;

import java.util.List;

public class leetcode_369 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
            Math.pow(val, 2);
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current!=null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public ListNode plusOne(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode revNode = reverse(head);
        int carry = 0;
        ListNode current = revNode;
        ListNode prev = null;
        current.val++;
        while (current!=null) {
            int temp = current.val;
            current.val = (temp+carry)%10;
            carry = (temp+carry)/10;
            prev = current;
            current = current.next;
        }
        if(carry > 0) {
            prev.next = new ListNode(carry);
        }
        return reverse(revNode);
    }

    public void solve() {
        int[][] a = new int[][]{{1, 2, 3}, {9}, {0}};
        for(int i=0;i<a.length;i++) {
            ListNode[] nodes = new ListNode[a[i].length];
            for(int j=0;j<a[i].length;j++) {
                nodes[j] = new ListNode(a[i][j]);
                if(j>0) {
                    nodes[j-1].next = nodes[j];
                }
            }
            ListNode c = plusOne(nodes[0]);
            while(c!=null) {
                System.out.print(c.val);
                if(c.next!=null) {
                    System.out.print(" -> ");
                }
                c = c.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        leetcode_369 t = new leetcode_369();
        t.solve();
    }
}
