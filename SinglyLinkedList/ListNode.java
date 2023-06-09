package SinglyLinkedList;

public class ListNode {

    private ListNode next;
    private int data;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
