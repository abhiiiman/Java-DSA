package SinglyLinkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; // generic type.
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10); // head data.
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // now we have to connect them together.

        sll.head.next = second; // 10-->1-->N
        second.next = third; // 10-->1-->8-->N
        third.next = fourth; // 10-->1-->8-->11-->N
    }

}
