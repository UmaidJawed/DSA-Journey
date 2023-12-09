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

public class Inserting_At_kPosition {
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

    private static Node deleteValue(Node head, int ele) {
        if (head == null)
            return null;

        if (head.data == ele) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == ele) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insertHead(Node head, int val) {
        Node temp = new Node(val);
        temp.next = head;
        return temp;
    }

    private static Node insertTail(Node head, int val) {
        if (head == null)
            return new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newnode = new Node(val);
        temp = newnode;
        return head;
    }

    private static Node inesertAtK(Node head, int ele, int k) {
        if (head == null) {
            if (k == 1)
                return new Node(ele);

            else
                return head;
        }
        if (k == 1) {
            Node Newnode = new Node(ele);
            Newnode.next = head;
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k - 1) {
                Node newNode = new Node(ele);
                newNode = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 6, 8 };
        Node head = convertArr2LL(arr);
        head = inesertAtK(head, 100, 2);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "-->" + "");
            temp = temp.next;
        }

    }
}
