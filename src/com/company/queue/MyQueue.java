package com.company.queue;

public class MyQueue {
    int front;
    int tail;
    int[] data;
    int size;

    public MyQueue() {
        data = new int[5];
    }

    public void enQueue(int d) {
        data[tail] = d;
        tail++;
        size++;
    }

    public int deQueue() {
        int v = data[front];
        front++;
        size--;
        return v;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[front+i]);
        }
    }

    public static void main(String[] args) {
        String sfx = " left the queue\n";
        MyQueue queue = new MyQueue();

        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);

        queue.display();

        System.out.println("\n" +queue.deQueue() + sfx);

        queue.display();
    }
}
