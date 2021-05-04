package com.queue;

public class TestMyLinkedListQueue {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
            myLinkedListQueue.enqueue(2);
            myLinkedListQueue.enqueue(6);
            myLinkedListQueue.enqueue(7);

        myLinkedListQueue.dequeue();
        myLinkedListQueue.dequeue();
        myLinkedListQueue.enqueue(30);
        myLinkedListQueue.enqueue(40);
        myLinkedListQueue.enqueue(50);
//        System.out.println("Dequeued item is " + myLinkedListQueue.dequeue().key);
        myLinkedListQueue.display();
    }
}
