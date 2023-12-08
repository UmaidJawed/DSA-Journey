package Linked_Lists;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class Deleting_kth_Value {
    private static Node convertArr2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
        }
        return head;
    }

    // Function for deleting head in the Linked Lists
    private static Node deleteHead(Node head) {
        Node temp = head;
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
