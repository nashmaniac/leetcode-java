package leetcode.s1201_1300;

public class leetcode_1265 {

    interface ImmutableListNode {
        public void printValue(); // print the value of this node.
        public ImmutableListNode getNext(); // return the next node.
    };

    public void printLinkedListInReverse(ImmutableListNode head) {
        if(head == null) {
            return;
        }
        printLinkedListInReverse(head.getNext());
        head.printValue();
    }

    public static void main(String[] args) {
        leetcode_1265 t = new leetcode_1265();
    }
}
