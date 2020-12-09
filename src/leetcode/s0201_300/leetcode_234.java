package leetcode.s0201_300;

public class leetcode_234 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
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

    public boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode current = head;
        if (head == null) {
            return false;
        }
        while (current!=null) {
            length++;
            current = current.next;
        }
        int startIndex = ((length-1)/2) + 1;
        current = head;
        for(int i=0;i<startIndex;i++) {
            current = current.next;
        }
        ListNode second = reverseList(current);
        printList(second);

        current = head;
        for(int i=0;i<(length/2)-1;i++) {
            current = current.next;
        }
        current.next = null;
        ListNode first = head;
        printList(first);
        while (second != null) {
            if(first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    public void printList(ListNode head) {
        ListNode c = head;
        while (c!=null) {
            System.out.print(c.val+" ");
            c = c.next;
        }
        System.out.println();
    }

    ListNode head = null;
    ListNode tail = null;

    public void insert(int val) {
        ListNode n = new ListNode(val);
        if(this.isEmpty()) {
            this.head = n;
            this.tail = n;
        } else {
            this.tail.next = n;
            this.tail = n;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        leetcode_234 t = new leetcode_234();
//        int[] nums = new int[]{1, 2, 3, 4, 3, 2, 1};
//        int[] nums = new int[]{1, 2, 3, 3, 2, 1};
//        int[] nums = new int[]{1, 2};
//        int[] nums = new int[]{1, 2, 2, 5};
        int[] nums = new int[]{};
        for(int i=0;i<nums.length;i++) {
            t.insert(nums[i]);
        }

        System.out.println(t.isPalindrome(t.head));

    }
}
