package com.company.linkedList;

public class MyLinkedList {
    private Node list;

    public void append(int d) {
        Node n = new Node(d);
        if (list == null) {
            list = new Node(d);
            return;
        }
        n.next = null;
        Node last = list;
        while (last.next != null)
            last = last.next;
        last.next = n;
    }

    public void detachNode(int value) {
        Node t = list;
        Node prev = null;
        if (t != null && t.data == value) {
            list = t.next;
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
        Node n = list;
        while ( n!= null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.append(5);
        linkedList.append(87);
        linkedList.append(135);
        linkedList.append(65);

        System.out.println("\nList contents: ");
        linkedList.display();

        System.out.println("\nRemoving Node of value 5");
        linkedList.detachNode(5);

        System.out.println("\nNew contents of list: ");
        linkedList.display();
    }
}
