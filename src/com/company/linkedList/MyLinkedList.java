package com.company.linkedList;

import com.company.Node;

import java.util.Arrays;

public class MyLinkedList {
    static Node head;

    public void append(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = new Node(d);
            return;
        }
        n.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = n;
    }

    public void detachNode(int value) {
        Node t = head;
        Node prev = null;

        if (t != null && t.data == value) {
            head = t.next;
            return;
        }

        while (t != null && t.data != value) {
            prev = t;
            t = t.next;
        }

        if (t == null)
            return;

        prev.next = t.next;
    }

    public void display() {
        Node n = head;
        while ( n!= null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.append(5);
        list.append(87);
        list.append(135);
        list.append(65);

        System.out.println("\nList contents: ");
        list.display();

        System.out.println("\nRemoving Node of value 5");
        list.detachNode(5);

        System.out.println("\nNew contents of list: ");
        list.display();
    }
}
