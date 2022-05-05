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
        tail = (tail + 1)%5;
        size++;
    }

    public int deQueue() {
        int v = data[front];
        front = (front + 1)%5;
        size--;
        return v;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[(front+i)%5] + " ");
        }
        System.out.println();
        for (int i : data) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        String sfx = " left the queue\n";
        MyQueue queue = new MyQueue();

        queue.enQueue(60);
        queue.enQueue(7);
        queue.enQueue(88);
        queue.enQueue(9);

        System.out.print(queue.deQueue() + sfx);
        System.out.print(queue.deQueue() + sfx);
        queue.enQueue(11);
        queue.enQueue(10);
        queue.enQueue(12);
        queue.display();
    }
}
