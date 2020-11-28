package leetcode.s701_800;

public class leetcode_725 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public int findLength(ListNode root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        while(root.next != null) {
            root = root.next;
            count++;
        }
        return count;
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        int chainLength = findLength(root);
        int[] partsLength = new int[k];
        int parts = 0, remaining = 0;
        if(chainLength<k) {
            for(int i=0;i<partsLength.length;i++) {
                partsLength[i] = 1;
            }
        } else {
            remaining = chainLength % k;
            for(int i=0;i<partsLength.length;i++){
                partsLength[i] = chainLength/k;
                if (remaining > 0) {
                    partsLength[i]++;
                    remaining--;
                }
            }
        }
        ListNode[] arr = new ListNode[k];
        for(int i=0;i<arr.length;i++) {
            parts = partsLength[i];
            arr[i] = root;
            if(root!=null) {
                int counter = parts;
                while (counter > 1) {
                    root = root.next;
                    counter--;
                }
                ListNode lastNode = root;
                root = lastNode.next;
                lastNode.next = null;
            }
        }

        return arr;
    }

    public void solve() {
        int[] a = new int[]{0, 1, 2, 3, 4};
        int k = 3;
        ListNode[] arr = new ListNode[a.length];
        for(int i=0;i<a.length;i++) {
            arr[i] = new ListNode(a[i]);
            if(i>0) {
                arr[i-1].next = arr[i];
            }
        }
        ListNode[] result = splitListToParts(arr[0], k);

        for(int i=0;i<result.length;i++) {
            ListNode current = result[i];
            while (current!=null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        leetcode_725 t = new leetcode_725();
        t.solve();
    }
}
