package com.company.linkedList;

import com.company.Node;

public class MyLinkedList {
    static Node head;

    public void append(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = new Node(d);
        }
        n.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = n;
    }

    public static void push(int data) {
        Node nNode = new Node(data);
        nNode.next = head;
        head = nNode;
    }

    public void detachNode() {

    }

    public void display() {
        Node n = head;
        while ( n!= null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {

    }
}
