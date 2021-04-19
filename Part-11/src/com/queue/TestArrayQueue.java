package com.queue;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(4);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(3);
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.display();
    }
}
