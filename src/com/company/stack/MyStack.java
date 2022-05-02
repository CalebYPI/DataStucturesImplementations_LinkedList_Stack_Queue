package com.company.stack;

import com.company.Node;

public class MyStack {
    static Node head;

    public static void push(int data) {
        Node nNode = new Node(data);
        nNode.next = head;
        head = nNode;
    }

    public static void pop() {

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
