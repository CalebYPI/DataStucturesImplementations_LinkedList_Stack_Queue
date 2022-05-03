package com.company.stack;

public class MyStack {
    private int topValue;
    private final int[] data;

    public MyStack() {
        topValue = -1;
        data = new int[7];
    }

    public void push(int d) {
        topValue += 1;
        data[topValue] = d;
    }

    public int pop() {
        int v = data[topValue];
        topValue -= 1;
        return v;
    }

    public int showTop() {
        return data[topValue];
    }

    public static void main(String[] args) {
        String sufx = " was popped";
        MyStack stack = new MyStack();

        stack.push(3);
        stack.push(76);
        stack.push(945);
        stack.push(25);

        System.out.println(stack.pop() + sufx);
        System.out.println(stack.pop() + sufx);
        System.out.println(stack.showTop() + " is the top value");
    }
}
