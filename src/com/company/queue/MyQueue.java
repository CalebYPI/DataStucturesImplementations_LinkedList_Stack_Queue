package com.company.queue;

public class MyQueue {
    private int lValue;
    private int[] data;

    public MyQueue() {
        lValue = -1;
        data = new int[5];
    }

    public void enQueue(int d) {
        //
    }

    public void deQueue() {
        //
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);

        queue.deQueue();
    }
}
