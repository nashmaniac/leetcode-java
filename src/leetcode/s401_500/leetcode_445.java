package leetcode.s401_500;

import java.util.Stack;

public class leetcode_445 {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;

        Stack<ListNode> n1 = new Stack<ListNode>();
        Stack<ListNode> n2 = new Stack<ListNode>();
        int first = 0;
        int second = 0;
        ListNode current = l1;
        while (current != null) {
            first++;
            n1.push(current);
            current = current.next;
        }

        current = l2;
        while (current!= null) {
            second++;
            n2.push(current);
            current = current.next;
        }

//        System.out.println(first);
//        System.out.println(second);
        int carry = 0;
        while (!n1.isEmpty() && !n2.isEmpty()) {
            ListNode f = n1.pop();
            ListNode s = n2.pop();
//            System.out.println(f.val);
//            System.out.println(s.val);
            int val = f.val+s.val+carry;
            ListNode m = new ListNode(val%10);
            carry = val/10;
            if(head == null) {
                head = m;
            } else {
                m.next = head;
                head = m;
            }
        }
        if(first!=second) {
            if(first> second) {
                while (!n1.isEmpty()) {
                    ListNode f = n1.pop();
                    int val = f.val + carry;
                    ListNode m = new ListNode(val%10);
                    carry = val/10;
                    if(head == null) {
                        head = m;
                    } else {
                        m.next = head;
                        head = m;
                    }
                }
            } else {
                while (!n2.isEmpty()) {
                    ListNode f = n2.pop();
                    int val = f.val + carry;
                    ListNode m = new ListNode(val%10);
                    carry = val/10;
                    if(head == null) {
                        head = m;
                    } else {
                        m.next = head;
                        head = m;
                    }
                }
            }
        }

        if(carry!=0) {
            ListNode m = new ListNode(carry);
            m.next = head;
            head = m;
        }
        return head;
    }

    public void solve() {
        ListNode head1 = null;
        ListNode head2 = null;
        int[] number1 = new int[] {7};
        int[] number2 = new int[] {5};
        for(int i=0;i< number1.length;i++) {
            ListNode m = new ListNode(number1[i]);
            if(head1 == null) {
                head1 = m;
            } else {
                m.next = head1;
                head1 = m;
            }
        }

        for(int i=0;i< number2.length;i++) {
            ListNode m = new ListNode(number2[i]);
            if(head2 == null) {
                head2 = m;
            } else {
                m.next = head2;
                head2 = m;
            }
        }

        ListNode c = addTwoNumbers(head1, head2);

        while (c!=null) {
            System.out.print(c.val + " ");
            c = c.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        leetcode_445 t = new leetcode_445();
        t.solve();
    }
}
