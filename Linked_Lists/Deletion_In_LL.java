package Linked_Lists;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class Deletion_In_LL {
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
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

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 8 };
        Node head = convertArr2LL(arr);
        head = deleteHead(head);// calling head function
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->" + "");
            temp = temp.next;
        }
        // System.out.print(head.data);/* printing the data after deleting the head node
        // in the Linked Lists */
    }
}
