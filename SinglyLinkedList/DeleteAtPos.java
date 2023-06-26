package SinglyLinkedList;

import java.util.Scanner;

public class DeleteAtPos {
    private static class ListNode {
        private int data; // generic type.
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static ListNode head;

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static int findLength() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;

    }

    public static int delAtPos(int nodePos) {
        ListNode current = head;
        if (nodePos == 1) {
            head = head.next;
        } else {
            ListNode prevNode = head;
            int indexCount = 1;
            while (indexCount < nodePos - 1) {
                prevNode = prevNode.next;
                indexCount++;
            }
            current = prevNode.next;
            prevNode.next = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {

        // creating the head node.
        head = new ListNode(0);

        // creating the rest nodes here.
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        ListNode node5 = new ListNode(50);

        // connecting the nodes here.
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // display the ll here.
        System.out.println("Original Linked List:");
        display();
        int l1 = findLength();
        System.out.println("Length: " + l1);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the position of the node to delete:");
        int pos = input.nextInt();
        input.close();
        int delItem = delAtPos(pos);

        System.out.println("After deletion at pos: " + pos);
        System.out.println("Deleted Node : " + delItem);
        display();
        int l2 = findLength();
        System.out.println("Length: " + l2);
    }
}
