package Linked_Lists;

import java.util.*;

class Node {
    int data;
    Node next;
    Node back;

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

public class Delete_Tail_DLL {
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

    private static Node delete_head(Node head) {
        if (head == null || head.next == null)
            return null;

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    private static Node delete_Tail(Node head) {
        if (head == null || head.next == null)
            return null;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        tail.back = null;
        prev.next = null;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 6, 8 };
        Node head = convertArrtoDLL(arr);
        head = delete_Tail(head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->" + "");
            temp = temp.next;
        }
    }
}
