package com.company.stack;

import com.company.Node;

import java.util.Arrays;

public class MyStack {
    static Node head;

    public void push(int data) {
        Node nNode = new Node(data);
        nNode.next = head;
        head = nNode;
    }

    public void pop() {

    }

    public void display() {
        Node n = head;
        while ( n!= null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(3);
        stack.push(76);
        stack.push(945);
        stack.push(25);

        System.out.println("\nStack contents: ");
        stack.display();

        stack.pop();

        System.out.println("\nContents of stack after pop: ");
        stack.display();
    }
}
