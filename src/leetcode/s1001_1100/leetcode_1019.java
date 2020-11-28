package leetcode.s1001_1100;

import java.util.ArrayList;
import java.util.List;

public class leetcode_1019 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


    public int findLength(ListNode root) {
        if(root == null) {
            return 0;
        }
        int count = 1;
        while (root.next != null) {
            root = root.next;
            count++;
        }
        return count;
    }

    public int largestItems(ListNode head, int threshold) {
        List<Integer> arr = new ArrayList<>();
        while (head!=null) {
            if(head.val > threshold) {
                arr.add(head.val);
            }
            head = head.next;
        }
        return arr.size() == 0 ? 0 : arr.get(0);
    }

    public int[] nextLargerNodes(ListNode head) {
        int count = findLength(head);
        int[] a = new int[count];
        int index = 0;
        while (head != null) {
            a[index] = largestItems(head.next, head.val);
            head = head.next;
            index++;
        }
        return a;
    }


    public void solve() {
//        int[] a = new int[]{2, 1, 5};
        int[] a = new int[]{1,7,5,1,9,2,5,1};
        ListNode[] arr = new ListNode[a.length];
        for(int i=0;i<a.length;i++) {
            arr[i] = new ListNode(a[i]);
            if(i>0) {
                arr[i-1].next = arr[i];
            }
        }

        int[] b = nextLargerNodes(arr[0]);
        for(int ao: b) {
            System.out.print(ao+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        leetcode_1019 t = new leetcode_1019();
        t.solve();
    }
}
