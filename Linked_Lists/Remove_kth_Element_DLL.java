package Linked_Lists;

import java.util.*;

class Node {
    int data;
    Node next, back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.next = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class Remove_kth_Element_DLL {
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

    private static Node removekthElement(Node head, int k) {
        Node temp = head;
        int cnt = 0;

        // This Loop will make sure that temp will be standing at the kth node
        while (temp != null) {
            cnt++;
            if (cnt == k)
                break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;

        // Here we'll have 4 Edge-Cases
        if (prev == null && front == null) {
            return null;
        }

        else if (prev == null) {
            delete_head(head);
            return head;
        }

        else if (front == null) {
            delete_Tail(head);
            return head;
        }
        /*
         * making prev node pointing next to front node And
         * making front node pointing back to the prev node
         */
        prev.next = front;
        front.back = prev;
        // removing temp connection with the prev and front node
        temp.next = null;
        temp.back = null;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 6, 8 };
        Node head = convertArrtoDLL(arr);
        head = removekthElement(head, 2);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->" + "");
            temp = temp.next;
        }
    }
}
