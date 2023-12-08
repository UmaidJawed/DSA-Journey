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

public class Deleting_LL_At_Position {
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

    private static Node deletekElement(Node head, int k) {
        if (head == null)
            return null;

        if (k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 6, 8 };
        Node head = convertArr2LL(arr);
        head = deletekElement(head, 3);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "-->" + "");
            temp = temp.next;
        }

    }
}
