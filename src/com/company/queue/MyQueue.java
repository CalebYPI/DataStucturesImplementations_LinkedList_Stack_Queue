package com.company.queue;

import com.company.Node;

public class MyQueue {
    static Node head;

    public void enqueue() {

    }

    public void dequeue() {

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
