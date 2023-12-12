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

public class Insertion_Before_Head_DLL {
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

    private static Node insert_Before_Head(Node head, int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        newHead.back = null;
        head.back = null;
        return newHead;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 6, 8 };
        Node head = convertArrtoDLL(arr);
        head = insert_Before_Head(head, 10);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->" + "");
            temp = temp.next;
        }
    }
}
