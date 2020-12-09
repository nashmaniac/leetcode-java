package leetcode.s0201_300;

public class leetcode_237 {

    class ListNode {
        int val;
        ListNode next;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        leetcode_237 t = new leetcode_237();
    }
}
