package Linked_Lists;

import java.util.*;

class Node {
    int data;
    Node next, back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class Reverse_DLL {
    private static Node convertArrtoDLL(int arr[]) {

        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            temp.next = null;
            temp.back = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node reverseDLL(Node head) {
        // Check if the list is empty
        // or has only one node
        if (head == null || head.next == null) {
            // No change is needed;
            // return the current head
            return head;
        }

        // Initialize a pointer to
        // the previous node
        Node prev = null;

        // Initialize a pointer to
        // the current node
        Node current = head;

        // Traverse the linked list
        while (current != null) {

            // Store a reference to
            // the previous node
            prev = current.back;

            // Swap the previous and
            // next pointers
            current.back = current.next;

            // This step reverses the links
            current.next = prev;

            // updating prev
            prev = current;

            // Move to the next node
            // in the orignal list

            current = current.back;
        }

        // The final node in the original list
        // becomes the new head after reversal
        return prev;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 6, 8 };
        Node head = convertArrtoDLL(arr);
        head = reverseDLL(head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->" + "");
            temp = temp.next;
        }
    }
}